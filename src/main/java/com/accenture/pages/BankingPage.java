package com.accenture.pages;

import com.accenture.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BankingPage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class);


    @CacheLookup
    @FindBy(xpath = "//body/div[2]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/span[1]")
    WebElement bankingCapi;



    public void bankingCapibilities() {
        clickOnElement(bankingCapi);
    }
}
