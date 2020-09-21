package pages;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
 
public class BasePage extends PageGenerator {
 
    public BasePage(WebDriver driver) {
        super(driver);
    }
 
    //If we need we can use custom wait in BasePage and all page classes
    WebDriverWait wait = new WebDriverWait(this.driver,20);
    
    
   
    }
    
    
   
    
    
