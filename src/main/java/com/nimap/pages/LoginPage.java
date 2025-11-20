package com.nimap.pages;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage{

	 @FindBy(id = "mobile")
	    WebElement mobileField;

	    @FindBy(id = "password")
	    WebElement passwordField;

	    @FindBy(xpath = "//button[contains(text(),'Login')]")
	    WebElement loginButton;

	    @FindBy(css = ".Toastify__toast-body, .toast") // common toast selectors
	    WebElement toastMessage;

	    public LoginPage(WebDriver driver) {
	        super(driver);
	    }

	    public void enterMobile(String mobile) {
	        mobileField.clear();
	        mobileField.sendKeys(mobile);
	    }

	    public void enterPassword(String pwd) {
	        passwordField.clear();
	        passwordField.sendKeys(pwd);
	    }

	    public void clickLogin() {
	        loginButton.click();
	    }

	    public void login(String mobile, String password) {
	        enterMobile(mobile);
	        enterPassword(password);
	        clickLogin();
	    }

	    public String getToastText() {
	        try {
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	            wait.until(ExpectedConditions.visibilityOf(toastMessage));
	            return toastMessage.getText();
	        } catch (Exception e) {
	            return "";
	        }
	    }
}
