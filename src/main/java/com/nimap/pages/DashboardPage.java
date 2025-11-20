package com.nimap.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nimap.base.BaseTest;

public class DashboardPage extends BasePage{
	 @FindBy(xpath = "//button[contains(text(),'Punch In')]")
	    WebElement punchInButton;

	    @FindBy(css = ".Toastify__toast-body, .toast")
	    WebElement toastMessage;

	    public DashboardPage(WebDriver driver) {
	        super(driver);
	    }

	    public void clickPunchIn() {
	        punchInButton.click();
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
