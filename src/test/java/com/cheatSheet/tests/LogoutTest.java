package com.cheatSheet.tests;

import com.cheatSheet.pages.LibraryLogout;
import com.cheatSheet.utility.TestBase;
import org.junit.jupiter.api.Test;

public class LogoutTest extends TestBase {

    LibraryLogout libraryLogout;

    @Test
    public void testLogout(){
        libraryLogout = new LibraryLogout();
        libraryLogout.logout();
    }
}
