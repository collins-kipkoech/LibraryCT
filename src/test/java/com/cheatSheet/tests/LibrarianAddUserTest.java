package com.cheatSheet.tests;

import com.cheatSheet.pages.LibrarianAddUser;
import com.cheatSheet.pages.LibraryLogin;
import com.cheatSheet.utility.BrowserUtil;
import com.cheatSheet.utility.ConfigReader;
import com.cheatSheet.utility.Driver;
import com.cheatSheet.utility.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class LibrarianAddUserTest extends TestBase {
    LibrarianAddUser librarianAddUser;
    LibraryLogin libraryLogin;



    @Test
    public void addUser(){
        libraryLogin = new LibraryLogin();
        librarianAddUser = new LibrarianAddUser();
        libraryLogin.goTo();
        String userName= ConfigReader.read("librarian");
        String passWord= ConfigReader.read("password");
        libraryLogin.login(userName,passWord);

        BrowserUtil.waitFor(2);
        librarianAddUser.addUser();
    }
}
