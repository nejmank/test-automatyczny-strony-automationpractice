package com.automaty.Tests;

import Basic.BaseSeleniumTest;
import com.automaty.Page.AuthenticationPage;
import com.automaty.Page.HomePage;
import com.automaty.Page.RegistrationPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class RegistrationTest extends BaseSeleniumTest
{
    @Test
    public void registrationTest() throws InterruptedException{

        driver.get("http://automationpractice.com/index.php");
        HomePage homePage = new HomePage(driver);
        homePage.ClickButtonForSignIn();

        Assert.assertEquals(homePage.AuthenticationLabelIsVisible(), "AUTHENTICATION");

        AuthenticationPage authenticationPage = new AuthenticationPage(driver);
        authenticationPage.setEmailInputForRegistration("testowyEmail@gmail.com")
                .ClickEmailCreate();

        Assert.assertEquals(authenticationPage.CreateAccountLabelIsVisible(), "CREATE AN ACCOUNT");

        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.SetMrCheckBox()
                .setNameAndLastNameInRegistration("Jan", "Kowalski")
                .setNewPassword("testowyPassword")
                .setDateOfBirth("24", "April", "1990")
                .ClickForNewsletter()
                .ClickForSepcialOffers();
    }

}
