package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.marionette","D:\\Browser\\Testingdemo\\Brower driver\\geckodriver.exe");    

		 WebDriver d = new FirefoxDriver ();
		 
		
		d.get("http://adactinhotelapp.com/Register.php"); 
		d.manage().window().maximize();
		
		WebElement X = d.findElement(By.xpath("//*[@id=\"username\"]"));
		
		
		
	}

}
