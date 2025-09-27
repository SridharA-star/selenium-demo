package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class BasicValidation {
	// declaration of webdriver
	public static WebDriver driver;
	String url = "https://www.facebook.com/";
	
	@BeforeTest
	public void setup() {		
		driver = new ChromeDriver();		
		driver.get(url);
	}
    // VALIDATING THE PAGE URL
	@Test
	public void validatePageURL() {
		String currentURL = driver.getCurrentUrl();
		if (currentURL.equals(url)) {
			System.out.println("The URL is correct: " + currentURL);
		} else {
			System.out.println("The URL is incorrect. Expected: " + url + ", but got: " + currentURL);
		}
	}
	// VALIDATING THE PAGE TITLE
	@Test
	public void validatePageTitle() {		
		String expectedTitle = "Facebook - log in or sign up";
		String actualTitle = driver.getTitle();
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("The title is correct: " + actualTitle);
		} else {
			System.out.println("The title is incorrect. Expected: " + expectedTitle + ", but got: " + actualTitle);
		}
	}		
	// closing the driver			
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
	

}
