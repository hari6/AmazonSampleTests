Feature: Amazon features


  #@dataFile: resources/env1/data/data.json
#META-DATA: {"dataFile":"resources/env1/data/data.json"}
@regression
Scenario: Search for a product and verify the list
    Given User launches amazon website
    When Enters a "samsung galaxy s21" in Search text box
    Then User lands on search results page
    And Verify the list if the search results matches search string "samsung galaxy s21"
    

    
@regression
Scenario: Add a product and verify the product is added into cart
    Given User launches amazon website
    Then Verify by clicking Add to cart icon and see if the added product is present
    
    
@regression
Scenario: Remove product from cart and verify change
    Given User launches amazon website
    Then Verify by clicking Add to cart icon and see if the added product is present
    Then Click on Delete link from cart
    
    
 
    
