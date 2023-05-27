import io.restassured.RestAssured;
import io.restassured.http.ContentType;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class BinaryFileUploadExample {

    public static void main(String[] args) {
        // Set the base URL of the API
        RestAssured.baseURI = "https://api.example.com";

        // Path to the binary file
        String filePath = "/path/to/binary/file.bin";

        // Read the binary file as a byte array
        byte[] fileBytes;
        try {
            fileBytes = Files.readAllBytes(new File(filePath).toPath());
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        // Send the request with the binary file in the request body
        RestAssured.given()
                .contentType(ContentType.BINARY)
                .body(fileBytes)
                .post("/upload") // Replace "/upload" with the actual endpoint
                .then()
                .statusCode(200);
    }
}
