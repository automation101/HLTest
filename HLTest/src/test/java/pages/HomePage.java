package pages;
 

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
 
 
public class HomePage extends BasePage {
 
    //*********Constructor*********
    public HomePage (WebDriver driver) {
        super(driver);
    }
 
    //*********Page Variables*********
    String baseURL = "https://www.hiddenlevers.com/";
    
    
    //*********Web Elements By Using Page Factory*********
      @FindBy(how = How.ID, using = "memberLogin")
      public WebElement loginpage;
      
      @FindBy(how=How.XPATH, using ="//*[@id=\"userlogin\"]")
      public WebElement loginemail;
      
      @FindBy(how=How.XPATH, using ="//*[@id=\"password1\"]")
      public WebElement loginpassword;
     
      @FindBy(how=How.ID, using ="btnLogin")
      public WebElement submit;
      
      @FindBy(how=How.XPATH, using ="//span[@id='totalWorstLoss']")
      public WebElement totalwrostloss;
      
    //*********Page Methods*********
    //Go to Homepage
    public void goToHomePage (){
        driver.get(baseURL);
    }
    
    //login method
    
    public void loginToApp () {
    	loginpage.click();
    	pause();
    	driver.switchTo().frame("loginFrame");
    	loginemail.sendKeys("pinkal.patel@me.com");
    	loginpassword.sendKeys("@MahantSwami20!");
    	submit.click();
    }
    //Go to Portfolio URl
    String goToUrl = "https://www.hiddenlevers.com/l/riskprofile/?p0=1151191&";
    public void goToPortfolio (){
        driver.navigate().to(goToUrl);
    }
   
  //implicit wait
    public void pause (){
    	driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
       
    }
    
    public void verifyUrl() {
    	String url = driver.getCurrentUrl();
    	
    	Assert.assertEquals(url, baseURL);
    	
    }
    
    
  
}