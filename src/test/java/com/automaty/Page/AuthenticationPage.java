package com.automaty.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AuthenticationPage
{
    @FindBy(how = How.XPATH, using = "/html/body/div/div[2]/div/div[3]/div/div/div[1]/form/div/div[2]/input")
    private WebElement EmailInput;

    @FindBy(how = How.XPATH, using = "//button[@id='SubmitCreate']")
    private WebElement CreateAccountButton;

    @FindBy(how = How.XPATH, using = "//h1[@class='page-heading']")
    private WebElement CreateAccountLabel;

    private WebDriver driver;


    public AuthenticationPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public AuthenticationPage setEmailInputForRegistration(String Email){
        EmailInput.click();
        EmailInput.sendKeys(Email);

        return this;
    }

    public AuthenticationPage ClickEmailCreate(){
        CreateAccountButton.click();
        return this;
    }

    public AuthenticationPage CreateAccountLabelIsVisible(){
        CreateAccountLabel.isDisplayed();
        return this;
    }

}
