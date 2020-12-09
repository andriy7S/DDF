package com.w2a.testcases;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;
import com.w2a.utilities.TestUtil;

public class AddCustomerTest extends TestBase {

	@Test(dataProviderClass = TestUtil.class, dataProvider = "dp")
	public void addCustomerTest(String firstName, String lastName, String postCode, String alerttext)
			throws InterruptedException {

		clickElement("addCustBtn_CSS");
		typeIn("firstname_CSS", firstName);
		typeIn("lastname_XPATH", lastName);
		typeIn("postcode_CSS", postCode);
		clickElement("addbtn_CSS");

		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		Assert.assertTrue(alert.getText().contains(alerttext));
		alert.accept();
	}

}
