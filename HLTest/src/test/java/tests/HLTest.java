package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;

public class HLTest extends BaseTest {

	HomePage home;
	@Test(description="Check number is in range or not")
	public void verifyNumberInCorrectRange () throws InterruptedException{
	
	home = page.GetInstance(HomePage.class);
	home.goToHomePage();
	home.loginToApp();
	home.pause();
	home.goToPortfolio();
	
	//Title Check 
	
	String Actual = driver.getTitle();
	String Expected = "HiddenLevers: Risk Profile: HL 50/50 Benchmark Jul-18-2019";
	Assert.assertEquals(Actual, Expected);
	home.pause();
	String riskvalue =home.totalwrostloss.getText();
	int number=Integer.parseInt(riskvalue); 
	
	if (number >= -30 && number <= -20) {
		System.out.println("Found" + number + " " + "Which is between -20 and -30 so TestCase passed");
	} else {
		System.out.println("Found" + number + " " + "Which is not between -20 and -30 so TestCase failed");
		
	}
	
	// Checking for fail , by making number = -15
	
		
	int increasenumber=Integer.parseInt(riskvalue)+10; 
		
	if (increasenumber >= -30 && increasenumber <= -20) {
			System.out.println("Found" + increasenumber + " " + "Which is between -20 and -30 so TestCase passed");
	} else {
			System.out.println("Found" + increasenumber + " " + "Which is not between -20 and -30 so TestCase failed");
			
	}
	
	}
		
	
}
