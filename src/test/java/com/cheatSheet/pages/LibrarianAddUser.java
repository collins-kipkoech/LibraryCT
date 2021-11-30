package com.cheatSheet.pages;

import com.cheatSheet.utility.BrowserUtil;
import com.cheatSheet.utility.ConfigReader;
import com.cheatSheet.utility.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LibrarianAddUser {

    //@FindBy(xpath = "//*[@id=\"menu_item\"]/li[2]")
    @FindBy(linkText = "Users")
    public WebElement userModule;

    @FindBy(xpath = "//*[@id=\"users\"]/div[1]/div[1]/span/a")
    public WebElement addUserButton;

    @FindBy(name = "full_name")
    public WebElement fullNameInput;

    @FindBy(name = "password")
    public WebElement passWordField;

    @FindBy(name = "email")
    public WebElement emailField;

    @FindBy(name = "address")
    public WebElement addressField;

    @FindBy(xpath = "//*[@id=\"add_user_form\"]/div[2]/button[2]")
    public WebElement saveChangeButton;

    @FindBy(xpath = "//*[@id=\"tbl_users\"]/tbody/tr[1]/td[4]")
    public WebElement savedMail;

    public LibrarianAddUser() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void goTo() {
        Driver.getDriver().navigate().to(ConfigReader.read("url"));
    }

    public void addUser() {

        userModule.click();
        BrowserUtil.waitFor(2);
        addUserButton.click();
        BrowserUtil.waitFor(2);
        fullNameInput.sendKeys("Roja");
        passWordField.sendKeys("1234");
        emailField.sendKeys("gabrielaouko@gmail.c");
        addressField.sendKeys("21188 VA");
        saveChangeButton.click();
        BrowserUtil.waitFor(2);

        String  actualMail = "gabrielaouko@gmail.c";
        assertEquals(savedMail.getText(),actualMail);

        System.out.println(savedMail.getText());

    }
}
