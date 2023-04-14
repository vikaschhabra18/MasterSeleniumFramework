package org.selenium.tests;

import org.selenium.annotations.FrameworkAnnotation;
import org.selenium.base.BaseTest;
import org.selenium.enums.AuthorType;
import org.selenium.enums.CategoryType;
import org.selenium.pages.GoogleLoginPage;
import org.testng.annotations.Test;

import io.qameta.allure.*;

@Epic("Epic - Click GMAIL")
@Feature("Feature - Clicking on GMAIL Link")
public class GoogleLoginTest extends BaseTest{
  
  @Story("Story - User should be able to Click on Gmail link")
	@Link("https://www.google.com")
	@Description("Dummy Desc")
	@FrameworkAnnotation(author = { AuthorType.SANJAY}, category = { CategoryType.SANITY, CategoryType.REGRESSION })
	@Test(groups = {"SANITY", "REGRESSION"}, description = "Dummy Desc")
  public void loginGoogle() {
	  
	  GoogleLoginPage a =  new GoogleLoginPage(getDriver()).load();
	  
	  a.clickGmail();
	  try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
 
}
