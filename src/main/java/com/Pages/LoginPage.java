package com.Pages;

import com.ProjectTestingHR.DriverSingleton;

import  org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
    private WebDriver driver;
    private WebElement pa_color;
    private WebElement pa_size;

    public LoginPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='username']")
    WebElement username;
    @FindBy(xpath = "//input[@id='password']")
    WebElement password;
    @FindBy(xpath = "//button[@name='login']")
    WebElement btnLogin;
    @FindBy(xpath = "//a[normalize-space()='Dashboard']")
    WebElement txtDashboard;
    @FindBy(xpath = "//span[contains(text(),'ToolsQA Demo Site')]")
    WebElement loginTitle;
    @FindBy(xpath = "//a[normalize-space()='pink drop shoulder oversized t shirt']")
    WebElement imgDash;
    @FindBy(xpath = "//select[@id='pa_color']")
    WebElement pColor;
    @FindBy(xpath = "//select[@id='pa_size']")
    WebElement org_size;
    @FindBy(xpath = "//*[@id='product-1497']/div[1]/div[2]/form/div/div[2]/button")
    WebElement selectCart;


    public void setCompanyColor(String comp_color) {
        Select dropdown;
        dropdown = new Select(pColor);
        dropdown.selectByValue(comp_color);
    }

    public void setCompanySize(String comp_size) {
        Select dropdown;
        dropdown = new Select(org_size);
        dropdown.selectByValue(comp_size);
    }

    public String getLoginTitle() {
        return loginTitle.getText();
    }

    public String getTxtDashboadr() {
        return txtDashboard.getText();
    }

    public void login(String username, String password) {
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        btnLogin.click();
        loginTitle.click();
        imgDash.click();
        pColor.click();
        org_size.click();

    }

    public String getSelectCart() {
        selectCart.click();
        return selectCart.getText();
    }

