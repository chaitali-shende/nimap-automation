package com.nimap.pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddCustomerPage extends BasePage {
	  @FindBy(id = "custName")
	    WebElement nameField;

	    @FindBy(id = "custMobile")
	    WebElement mobileField;

	    @FindBy(id = "custEmail")
	    WebElement emailField;

	    @FindBy(xpath = "//button[contains(text(),'Save') or contains(text(),'Add Customer')]")
	    WebElement saveButton;

	    @FindBy(css = ".Toastify__toast-body, .toast")
	    WebElement toastMessage;

	    public AddCustomerPage(org.openqa.selenium.WebDriver driver) {
	        super(driver);
	    }

	    public void addCustomer(String name, String mobile, String email) {
	        nameField.clear();
	        nameField.sendKeys(name);
	        mobileField.clear();
	        mobileField.sendKeys(mobile);
	        emailField.clear();
	        emailField.sendKeys(email);
	        saveButton.click();
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
