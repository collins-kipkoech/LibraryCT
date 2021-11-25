package com.cheatSheet.tests;

import com.cheatSheet.pages.LibraryLogin;
import com.cheatSheet.utility.BrowserUtil;
import com.cheatSheet.utility.ConfigReader;
import com.cheatSheet.utility.TestBase;
import org.junit.jupiter.api.Test;

public class LoginTest extends TestBase {

    LibraryLogin libraryLogin;

    @Test
    public void testLogin(){
        libraryLogin = new LibraryLogin();
        libraryLogin.goTo();
        String username = ConfigReader.read("student");
        String password = ConfigReader.read("password");
        libraryLogin.login(username,password);
        BrowserUtil.waitFor(2);

    }

    @Test
    public void testIsOnLoginPage(){
        libraryLogin = new LibraryLogin();
        libraryLogin.goTo();
        libraryLogin.isOnLoginPage();

    }

    @Test
    public void testError(){
        libraryLogin = new LibraryLogin();
        libraryLogin.goTo();
        libraryLogin.errorMsg("bla","bla");

    }

    @Test
    public void testModules(){
        libraryLogin = new LibraryLogin();
        libraryLogin.goTo();
        String username = ConfigReader.read("student");
        String password = ConfigReader.read("password");
        libraryLogin.login(username,password);
        libraryLogin.checkModules("student");

    }
}
