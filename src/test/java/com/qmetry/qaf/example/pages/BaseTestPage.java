package com.qmetry.qaf.example.pages;

import com.qmetry.qaf.automation.ui.api.PageLocator;
import static com.qmetry.qaf.automation.step.CommonStep.get;

public class BaseTestPage {
	
	public void openPage(PageLocator locator) {
		get("/");
	}

	
}
