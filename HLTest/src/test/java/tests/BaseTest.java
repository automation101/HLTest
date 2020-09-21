package tests;

import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.PageGenerator;
 
public class BaseTest {
    public WebDriver driver;
    public WebDriverWait wait;
    public PageGenerator page;
 
    @BeforeMethod
    public void setup () {
        //Create a Chrome driver. All test classes use this.
    	
    	
    	System.setProperty("webdriver.chrome.silentOutput","true");
        WebDriverManager.chromedriver().setup();
        ChromeOptions chOption = new ChromeOptions();
        chOption.addArguments("--disable-extensions");
        chOption.addArguments("test-type");
        chOption.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);
        chOption.setExperimentalOption("prefs", prefs);
        driver = new ChromeDriver(chOption);
        
 
        //Maximize Window
        driver.manage().window().maximize();
 
        //Instantiate the Page Class
        page = new PageGenerator(driver);
    }
 
    @AfterMethod
    public void teardown () {
        driver.quit();
    }
}