package com.cheatSheet.pages;

import com.cheatSheet.utility.ConfigReader;
import com.cheatSheet.utility.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryLogin {

    @FindBy(xpath = "//input[@id='inputEmail']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@id='inputPassword']")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement submitBtn;

    public LibraryLogin(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public void goTo(){
        Driver.getDriver().navigate().to(ConfigReader.read("url"));
    }

    


}
