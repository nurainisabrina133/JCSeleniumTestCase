package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestRecruitment {
    public static WebDriver driver;
    public LoginPage loginPage;
    public  RecruitmentPage recruitmentPage;
    @BeforeClass
    public void setUp() {
        DriverSingleton.getInstance("chrome");
        driver = DriverSingleton.getDriver();
        loginPage = new LoginPage();
        recruitmentPage = new RecruitmentPage();
        driver.get("https://shop.demoqa.com/my-account/");
        loginPage.login("Adminoooooooooo", "fhguiy8oiuioj");
    }
    @Test
    public void tessAddCandidate(){

    }
    @AfterClass
    public void quitBrowser() {
        delay(6);
        DriverSingleton.closeObjectInstance();
    }

    static void delay(long detik ) {
        try {
            Thread.sleep(detik + 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException();
        }
    }
}


