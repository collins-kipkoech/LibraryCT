package com.cheatSheet.pages;

import com.cheatSheet.utility.BrowserUtil;
import com.cheatSheet.utility.ConfigReader;
import com.cheatSheet.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LibrarianAddNewBook {
    @FindBy(linkText = "Books")
    public WebElement booksIcon;

    @FindBy(partialLinkText = "Add")
    public WebElement addBook;

    @FindBy(xpath = "//input[@name=\"name\"]")
    public WebElement bookName;
    @FindBy(xpath = "//input[@name=\"isbn\"]")
    public WebElement isbn;
    @FindBy(name = "year" )
    public WebElement yearInput;
    @FindBy(xpath = "//input[@name=\"author\"]")
    public WebElement authorInput;
    //select dropdown
    @FindBy(name = "book_category_id")
    public WebElement bookCategory;
    //description
    @FindBy(xpath = "//textarea[@id=\"description\"]")
    public WebElement description;
    @FindBy(xpath = "//button[@type=\"submit\"]")
    public WebElement saveChanges;
    @FindBy(xpath = "//div[@class=\"dataTables_info\"]")
    public WebElement entryCount;

    public LibrarianAddNewBook() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    public void goTo(){
        Driver.getDriver().navigate().to(ConfigReader.read("url"));
    }



    public void addNewBook(){
        booksIcon.click();

        addBook.click();

        bookName.sendKeys("Song Of Fire And Ice");

        isbn.sendKeys("0553588486");

        yearInput.sendKeys("2005");

        authorInput.sendKeys("George RR Martin");
        //select book category
        Select bookCategorySelect = new Select(bookCategory);
        bookCategorySelect.selectByIndex(3);
        BrowserUtil.waitFor(2);

        description.sendKeys("Here is the first volume in George R. R. Martin’s magnificent cycle of novels");

        saveChanges.click();
        BrowserUtil.waitFor(5);







    }


}
