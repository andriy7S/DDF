package com.w2a.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.w2a.base.TestBase;

public class BankManagerLoginTest extends TestBase {

	@Test
	public void loginAsBankManager() throws InterruptedException {

		try {
			Assert.assertEquals("abc", "xyz");
			System.out.println("After assertion");
		} catch (Throwable t) {
			System.out.println("Inside catch...");
		}
		log.debug("Inside Login Test Class");

		clickElement("bmlBtn_CSS");

		Assert.assertTrue(isElementPresent(By.cssSelector(OR.getProperty("addCustBtn_CSS"))),
				"Login is not successful");

		log.debug("Login Successfully executed");

		Assert.fail("Forcefull fail.....");

	}

}
