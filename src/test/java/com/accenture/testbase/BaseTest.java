package com.accenture.testbase;


import com.accenture.propertyreader.PropertyReader;
import com.accenture.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



/**
 * Author - Sarvat Shaikh
 * Project Name: The-Works-B2S
 */

public class BaseTest extends Utility {

    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod
    public void setUp(){
        selectBrowser(browser);
    }

    @AfterMethod
    public void tearDown(){
        closeBrowser();
    }
}
