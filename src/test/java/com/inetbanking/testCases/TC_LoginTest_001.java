package com.inetbanking.testCases;

import com.inetbanking.pageobjects.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

//import org.testng.Assert;

public class TC_LoginTest_001 extends  BaseClass {
    @Test
    public void loginTest() throws IOException {

        driver.get(baseURL);

        logger.info("URL is open");
        LoginPage lp = new LoginPage(driver);
        lp.setUserName(username);
        logger.info("input USer ");
        lp.setPassword(password);
        logger.info("input passwd ");
        lp.clickSubmit();

        if (driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
            Assert.assertTrue(true);
            logger.info("login passed ");
        } else {
            captureScreen(driver, "loginTest");
            Assert.assertTrue(false);
            logger.info("login failed ");
        }
    }
}

