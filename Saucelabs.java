package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Saucelabs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.firefox.marionette","D:\\Browser\\Testingdemo\\Brower driver\\geckodriver.exe");    
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://saucedemo.com");Thread.sleep(150);
		String title = driver.getTitle();Thread.sleep(150);
		boolean titleIsCorrect = title.contains("Swag Labs");Thread.sleep(150);
		String jobStatus = titleIsCorrect ? "passed" : "failed";Thread.sleep(50);

		System.out.println("sauce:job-result=" + jobStatus);
		driver.quit();
		
		
		
	}

}
