package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.marionette","D:\\Browser\\Testingdemo\\Brower driver\\geckodriver.exe");    
		
		WebDriver driver = new FirefoxDriver();
		 driver.get("https://www.google.com/");  
		 driver.manage().window().maximize();  
		 driver.close();

	}

}
