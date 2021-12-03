package com.cheatSheet.tests;

import com.cheatSheet.pages.LibrarianAddNewBook;
import com.cheatSheet.pages.LibraryLogin;
import com.cheatSheet.utility.ConfigReader;
import com.cheatSheet.utility.TestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddNewBookTest extends TestBase {
    LibrarianAddNewBook librarianAddBook;
    LibraryLogin libraryLogin;

    @Test
    public void addNewBook(){
        libraryLogin = new LibraryLogin();
        librarianAddBook = new LibrarianAddNewBook();

        String username = ConfigReader.read("librarian");
        String password = ConfigReader.read("password");
        librarianAddBook.goTo();
        libraryLogin.login(username,password);
        librarianAddBook.addNewBook();


        Assertions.assertEquals(librarianAddBook.entryCount.getText(),"Showing 1 to 10 of 8,134 entries");






    }
}
