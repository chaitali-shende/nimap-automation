package com.nimap.test;
import org.testng.annotations.*;

import com.nimap.base.BaseTest;
import com.nimap.pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test(dataProvider="loginData")
    public void loginTest(String mobile, String pass) {
        driver.get("https://testffc.nimapinfotech.com/");
        LoginPage login = new LoginPage(driver);
        login.login(mobile, pass);
    }

    @DataProvider
    public Object[][] loginData(){
        return new Object[][] {
            {"9519519519", "12345678"}   // Valid
        };
    }
}
