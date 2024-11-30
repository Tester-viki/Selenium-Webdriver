	package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Logo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.firefox.marionette","D:\\Browser\\Testingdemo\\Brower driver\\geckodriver.exe");    

		 WebDriver d = new EdgeDriver ();
		 
		 d.get("https://www.google.co.in/");
		 boolean logo = d.findElement(By.xpath("//*[@id=\"hplogo\"]"))
		 .isDisplayed();
		 
		 if (logo == true) {
		  System.out.println("logo is available");
		  } else {
		  System.out.println("logo is not available");
		  }
		 d.quit();
	}

}
