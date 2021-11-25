package com.cheatSheet.pages;

import com.cheatSheet.utility.BrowserUtil;
import com.cheatSheet.utility.ConfigReader;
import com.cheatSheet.utility.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryLogin {

    @FindBy(xpath = "//input[@id='inputEmail']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@id='inputPassword']")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement submitBtn;

    @FindBy(xpath = "//div[@class='alert alert-danger']")
    public WebElement error;

    @FindBy(tagName = "title")
    public WebElement title1;

    @FindBy(xpath = "//li[@class='nav-item']")
    public List<WebElement> modules;

    public LibraryLogin(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public void goTo(){
        Driver.getDriver().navigate().to(ConfigReader.read("url"));
    }

    public void login(String username, String password){
        this.usernameBox.sendKeys(username);
        this.passwordBox.sendKeys(password);
        this.submitBtn.click();
    }

    public void isOnLoginPage(){
        String actual = "https://library2.cybertekschool.com/login.html";
        String expected = Driver.getDriver().getCurrentUrl();
        boolean isEqual = actual.equals(expected);
        System.out.println(isEqual);
    }

    public void errorMsg(String username,String password){
        this.usernameBox.sendKeys(username);
        this.passwordBox.sendKeys(password);
        this.submitBtn.click();
        BrowserUtil.waitFor(1);
        System.out.println("this.error.isDisplayed() = " + this.error.isDisplayed());


    }

    public void checkTitle(){
        String actual = "Login - Library";
        String expected = Driver.getDriver().getTitle();

        assertEquals(actual,expected);


    }

    public void checkModules(String username){
        if(username.equals("email1")){
            this.modules.size();

        }else if(username.equals("email2")){
            this.modules.size();
        }else{
            System.out.println("Invalid username");
        }
  
    }




}
