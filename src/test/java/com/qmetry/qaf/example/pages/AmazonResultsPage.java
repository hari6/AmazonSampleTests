package com.qmetry.qaf.example.pages;

import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.annotations.PageIdentifier;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebElement;

public class AmazonResultsPage {
	
	@PageIdentifier
	@FindBy(locator = "css=h1.a-size-base>div>div:nth-of-type(1)>div>div.a-section>span:nth-of-type(1)")
	private QAFWebElement searchResultText;
	
	@FindBy(locator = "css=div.s-result-item:nth-of-type(2)>div>span>div>div>div>div>div:nth-of-type(2)>div:nth-of-type(2)>div>div:nth-of-type(1)>div>div>div:nth-of-type(1)>h2>a.a-text-normal>span)")
	private QAFWebElement searchResultString;
	
	@FindBy(locator = "css=div.sc-list-item-content>div>div:nth-of-type(1)>div>div>div:nth-of-type(2)>ul>li:nth-of-type(1)>span>a>span:nth-of-type(1)")
	private QAFWebElement addtocartstring;
	
	@FindBy(locator = "css=div.sc-list-item-content>div>div:nth-of-type(1)>div>div>div:nth-of-type(2)>div:nth-of-type(1)>span:nth-of-type(2)>span>input")
	private QAFWebElement deletelink;
	
	
	public QAFWebElement getDeletestring() {
		return deletelink;
	}

	public void setDeletestring(QAFWebElement deletestring) {
		this.deletelink = deletestring;
	}

	public QAFWebElement getAddtocartbtn() {
		return addtocartbtn;
	}

	public QAFWebElement getAddtocartstring() {
		return addtocartstring;
	}

	public void setAddtocartstring(QAFWebElement addtocartstring) {
		this.addtocartstring = addtocartstring;
	}

	public void setAddtocartbtn(QAFWebElement addtocartbtn) {
		this.addtocartbtn = addtocartbtn;
	}

	@FindBy(locator = "css=input#add-to-cart-button")
	private QAFWebElement addtocartbtn;

	public QAFWebElement getSearchResultString() {
		return searchResultString;
	}

	public void setSearchResultString(QAFWebElement searchResultString) {
		this.searchResultString = searchResultString;
	}

	public QAFWebElement getSearchResultText() {
		return searchResultText;
	}

	public void setSearchResultText(QAFWebElement searchResultText) {
		this.searchResultText = searchResultText;
	}
	
	
	
}
