package com.automaty.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{
    @FindBy(how = How.XPATH, using = "//nav//div[1]//a[1]")
    private WebElement SignInButton;

    @FindBy(how = How.XPATH, using = "//*[@id='row']//h1[.='']")
    private WebElement AuthenticationLabel;

    private WebDriver driver;

    public HomePage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public HomePage ClickButtonForSignIn(){
        SignInButton.click();
        return this;
    }

    public HomePage AuthenticationLabelIsVisible(){
        AuthenticationLabel.isDisplayed();
        return this;
    }
}
