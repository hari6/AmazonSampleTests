package com.qmetry.qaf.example.pages;

import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.annotations.PageIdentifier;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class AmazonHomePage {

	@PageIdentifier
	@FindBy(locator = "xpath=//input[@id='twotabsearchtextbox']")
	private QAFWebElement searchfield;
	
	@FindBy(locator = "xpath=//input[@id='nav-search-submit-button']")
	private QAFWebElement searchsubmitbtn;
	
	@FindBy(locator = "css=span.nav-cart-icon")
	private QAFWebElement addtocarticon;
	
	@FindBy(locator = "css=span#nav-cart-count")
	private QAFWebElement addtocartnumber;
	

	public QAFWebElement getAddtocartnumber() {
		return addtocartnumber;
	}

	public void setAddtocartnumber(QAFWebElement addtocartnumber) {
		this.addtocartnumber = addtocartnumber;
	}

	public QAFWebElement getAddtocarticon() {
		return addtocarticon;
	}

	public void setAddtocarticon(QAFWebElement addtocarticon) {
		this.addtocarticon = addtocarticon;
	}

	public QAFWebElement getSearchfield() {
		return searchfield;
	}

	public void setSearchfield(QAFWebElement searchfield) {
		this.searchfield = searchfield;
	}

	public QAFWebElement getSearchsubmitbtn() {
		return searchsubmitbtn;
	}

	public void setSearchsubmitbtn(QAFWebElement searchsubmitbtn) {
		this.searchsubmitbtn = searchsubmitbtn;
	}

			
}
