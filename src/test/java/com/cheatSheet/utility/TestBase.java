package com.cheatSheat.utility;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;


public abstract class TestBase {
    // we want only subclasses of TestBase have access to this.
    protected WebDriver driver ;
    // setting up all driver stuff here directly in @BeforeEach method
    @BeforeEach
    public void setupWebDriver(){

        driver =  Driver.getDriver() ;
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
    }

    @AfterEach
    public void closeBrowser(){
        Driver.closeBrowser();
    }


}
