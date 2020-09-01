package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseSeleniumTest
{
    protected WebDriver driver;

    @BeforeTest
    public void setUp()
    {
        System.out.println("Before Test");
        String driverpath = "E:\\Projekty Java\\Automaty\\src\\main\\resources\\Executables\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverpath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterTest
    public void tearDown()
    {
        System.out.println("After Test");
        //driver.quit();
    }

}
