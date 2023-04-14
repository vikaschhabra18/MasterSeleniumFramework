package org.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.selenium.enums.WaitStrategy;

import io.qameta.allure.Step;

public class GoogleLoginPage extends BasePage {

	public GoogleLoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

//	public Boolean isLoaded() {
//		return wait.until(ExpectedConditions.textToBe(cartHeading, "Cart"));
//	}

//	@FindBy(css = "td[class='product-name'] a")
//	private WebElement productName;
	
	@FindBy(linkText = "Gmail")
	private WebElement gmailLink;
	
//	private final By checkoutBtn = By.xpath("//a[normalize-space()='Proceed to checkout']");
//	private final By cartHeading = By.cssSelector(".has-text-align-center");

//	public String getProductName() {
//		return wait.until(ExpectedConditions.visibilityOf(productName)).getText();
//
//	}

//	public CheckoutPage checkout() {
//		click(checkoutBtn, WaitStrategy.CLICKABLE, "Checkout");
//		return new CheckoutPage(driver);
//	}
	
	public void clickGmail() {
		waitAndClick(gmailLink, "Gmail Link");
	}
	@Step
	public GoogleLoginPage load() {
		load("");
		wait.until(ExpectedConditions.titleContains("Google"));
		return this;
	}
}