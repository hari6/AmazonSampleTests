package com.qmetry.qaf.example.steps;

import static com.qmetry.qaf.automation.step.CommonStep.get;
import static com.qmetry.qaf.automation.step.CommonStep.sendKeys;
import static com.qmetry.qaf.automation.step.CommonStep.verifyLinkWithPartialTextPresent;

import java.sql.Driver;

import org.hamcrest.Matchers;
import org.openqa.selenium.Keys;

import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.util.Validator;
import com.qmetry.qaf.example.pages.AmazonHomePage;
import com.qmetry.qaf.example.pages.AmazonResultsPage;
import com.qmetry.qaf.example.pages.BaseTestPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepsLibrary {
	/**
	 * @param searchTerm
	 *            : search term to be searched
	 */
	
	@Given("^User launches amazon website$")
	public void user_launches_amazon_website() throws Throwable {
		BaseTestPage basetestpage = new BaseTestPage();
		basetestpage.openPage(null);
	}
//	\"([^\"]*)\"
	@When("^Enters a \"([^\"]*)\" in Search text box$")
	public void enters_a_string_in_search_text_box(String searchstr) throws Throwable {
		AmazonHomePage amazonhomepage = new AmazonHomePage();
		Validator.verifyTrue(amazonhomepage.getSearchfield().verifyPresent("Search field"), "Search field is not present", "Search field is present");
		amazonhomepage.getSearchfield().sendKeys(searchstr);
		amazonhomepage.getSearchsubmitbtn().click();  
	}
	
	@Then("^User lands on search results page$")
	public void user_lands_on_search_results_page() throws Throwable {
		AmazonResultsPage amazonresultspage = new AmazonResultsPage();
		Validator.verifyTrue(amazonresultspage.getSearchResultText().verifyPresent("Search results page"), "User did not land on search results page", "User successfully lands on search results page");
	}
	
	@And("^Verify the list if the search results matches search string \"([^\"]*)\"$")
	public void verifysearchresults(String searchstr) throws Throwable {
		AmazonResultsPage amazonresultspage = new AmazonResultsPage();
		Validator.verifyTrue(amazonresultspage.getSearchResultString().verifyPresent("Search results String"), "Search results string doesn't match the search string entered", "Search results string matches the search string entered");
		Validator.verifyThat(amazonresultspage.getSearchResultString().getText(), Matchers.anything(searchstr));
	}
	
	@Then("^Click on the product and verify for Add to cart button and select the product$")
	public void AddtoCart() throws Throwable {
		AmazonResultsPage amazonresultspage = new AmazonResultsPage();
		amazonresultspage.getSearchResultString().click();
		Validator.verifyTrue(amazonresultspage.getAddtocartbtn().verifyPresent("Add to cart button"), "Add to cart button is not present", "Add to cart button is present");
		amazonresultspage.getAddtocartbtn().click();
	}
	
	@Then("^Verify by clicking Add to cart icon and see if the added product is present$")
	public void VerifyAddtoCart() throws Throwable {
		AmazonHomePage amazonhomepage = new AmazonHomePage();
		AmazonResultsPage amazonresultspage = new AmazonResultsPage();
		Validator.verifyTrue(amazonhomepage.getAddtocarticon().verifyPresent("Add to cart Icon"), "Add to cart icon is not present on the Home page", "Add to cart Icon is present on the Home page");
		amazonhomepage.getAddtocarticon().click();
		Validator.verifyTrue(amazonresultspage.getAddtocartstring().verifyPresent("Product added to cart string"), "Added product in cart is not present", "dded product to cart is present");
		Validator.verifyThat(amazonresultspage.getAddtocartstring().getText(), Matchers.containsString(amazonresultspage.getSearchResultString().getText()));
	}
	
	@Then("^Click on Delete link from cart$")
	public void DeletefromCart() throws Throwable {
		AmazonHomePage amazonhomepage = new AmazonHomePage();
		AmazonResultsPage amazonresultspage = new AmazonResultsPage();
		Validator.verifyTrue(amazonresultspage.getDeletestring().verifyPresent("Delete link"), "Delete link is not present", "Delete link is present");
		amazonresultspage.getDeletestring().click();
		Validator.verifyTrue(amazonhomepage.getAddtocartnumber().verifyPresent("Add to cart number"), "Add to cart number is not present", "Add to cart number is present");
		Validator.verifyThat(amazonhomepage.getAddtocartnumber().getText(), Matchers.equalTo("0"));
		
		
	}
	
	
	
	
	
	
	

}
