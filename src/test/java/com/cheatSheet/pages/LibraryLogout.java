package com.cheatSheet.pages;

import com.cheatSheet.utility.BrowserUtil;
import com.cheatSheet.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryLogout {

    @FindBy(xpath = "//a[@id='navbarDropdown']")
    public WebElement logoutBtn;

    @FindBy(linkText = "Log Out")
    public WebElement logoutLink;

    public LibraryLogout(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public void logout(){
        logoutBtn.click();
        BrowserUtil.waitFor(1);
        logoutLink.click();
    }

    public boolean isOnLoginPage(){
        String actual = "https://library2.cybertekschool.com/login.html";
        String expected = Driver.getDriver().getCurrentUrl();
        boolean isEqual = actual.equals(expected);
        return isEqual;
    }

}
