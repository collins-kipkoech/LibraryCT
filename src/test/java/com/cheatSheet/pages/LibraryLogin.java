package com.cheatSheet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LibraryLogin {

    @FindBy(xpath = "//input[@id='inputEmail']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@id='inputPassword']")
    public WebElement passwordBox;


}
