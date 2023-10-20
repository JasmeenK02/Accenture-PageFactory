package com.accenture.pages;

import com.accenture.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class);
    @CacheLookup
    @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
    WebElement AcceptCookies;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Industries')]")
    WebElement industries;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Banking')]")
    WebElement banking;





    public void acceptingTheCookies() {
        clickOnElement(AcceptCookies);
    }
    public void industriesOption() {
        clickOnElement(industries);
    }
    public void bankingSector() {
        clickOnElement(banking);
    }
}
