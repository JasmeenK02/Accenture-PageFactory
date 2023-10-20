package com.accenture.testsuite;

import com.accenture.pages.BankingPage;
import com.accenture.testbase.BaseTest;
import com.accenture.customlisteners.CustomListeners;
import com.accenture.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class HomePageTest extends BaseTest {

    HomePage homePage;
    BankingPage bankingPage;


    @BeforeMethod
    public void inIt() {
        homePage = new HomePage();
        bankingPage = new BankingPage();
    }


        @Test
        public void test001(){
            homePage.acceptingTheCookies();
            homePage.industriesOption();
            homePage.bankingSector();
            bankingPage.bankingCapibilities();
        }



}
