package com.automaty.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage
{
    @FindBy(how = How.XPATH, using = "//input[@id='id_gender1']")
    private WebElement MrCheckbox;

    @FindBy(how = How.XPATH, using = "//input[@id='id_gender2']")
    private WebElement MrsCheckbox;

    @FindBy(how = How.XPATH, using = "//input[@id='customer_firstname']")
    private WebElement FirstNameInput;

    @FindBy(how = How.XPATH, using = "//input[@id='customer_lastname']")
    private WebElement LastNameInput;

    @FindBy(how = How.XPATH, using = "//input[@id='email']")
    private WebElement EmailInput2;

    @FindBy(how = How.XPATH, using = "//input[@id='passwd']")
    private WebElement PasswordInput;

    @FindBy(how = How.XPATH, using = "//select[@id='days']")
    private WebElement DayOfBirthSelect;

    @FindBy(how = How.XPATH, using = "//select[@id='months']")
    private WebElement MonthOfBirthSelect;

    @FindBy(how = How.XPATH, using = "//select[@id='years']")
    private WebElement YearOfBirthSelect;

    @FindBy(how = How.XPATH, using = "//input[@id='newsletter']")
    private WebElement NewsletterInput;

    @FindBy(how = How.XPATH, using = "//input[@id='optin']")
    private WebElement SpecialOffersInput;

    @FindBy(how = How.XPATH, using = "//input[@id='firstname']")
    private WebElement FirstnameAddressInput;

    @FindBy(how = How.XPATH, using = "//input[@id='lastname']")
    private WebElement LastnameAddressInput;

    @FindBy(how = How.XPATH, using = "//input[@id='company']")
    private WebElement NameOfCompanyInput;

    private WebDriver driver;

    public RegistrationPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public RegistrationPage SetMrCheckBox(){
        MrCheckbox.click();
        return this;
    }

    public RegistrationPage SetMrsCheckBox(){
        MrsCheckbox.click();
        return this;
    }

    public RegistrationPage setNameAndLastNameInRegistration(String Name, String LastName){
        FirstNameInput.click();
        FirstNameInput.sendKeys(Name);
        LastNameInput.click();
        LastNameInput.sendKeys(LastName);
        return this;
    }

    public RegistrationPage setNewPassword(String Password){
        PasswordInput.click();
        PasswordInput.sendKeys(Password);
        return this;
    }

    public RegistrationPage setDateOfBirth(String Day, String Month, String Year){
        DayOfBirthSelect.click();
        DayOfBirthSelect.sendKeys(Day);
        MonthOfBirthSelect.click();
        MonthOfBirthSelect.sendKeys(Month);
        YearOfBirthSelect.click();
        YearOfBirthSelect.sendKeys(Year);
        return this;
    }

    public RegistrationPage ClickForNewsletter(){
        NewsletterInput.click();
        return this;
    }

    public RegistrationPage ClickForSepcialOffers(){
        SpecialOffersInput.click();
        return this;
    }

}
