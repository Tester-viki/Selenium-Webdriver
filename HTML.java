package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HTML {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.marionette","D:\\Browser\\Testingdemo\\Brower driver\\geckodriver.exe");    

		 WebDriver d = new FirefoxDriver ();
		 
		
		d.get("http://adactinhotelapp.com/"); 
		d.manage().window().maximize();
		 		
	 	 WebElement X = d.findElement(By.xpath("//*[@id=\"login_form\"]/table/tbody/tr[7]/td/a"));
		 X.click();
		 
		 WebElement X1 = d.findElement(By.xpath("//*[@id=\"username\"]"));
		 X1.sendKeys("Vignesh");Thread.sleep(10);
		 
		 WebElement X2 = d.findElement(By.xpath("//*[@id=\"password\"]"));
		 X2.sendKeys("Vignesh@123");Thread.sleep(10);
		 
		 
		 WebElement X3 = d.findElement(By.xpath("//*[@id=\"re_password\"]"));
		 X3.sendKeys("Vignesh@123");Thread.sleep(10);
		 
		 WebElement X4 = d.findElement(By.xpath("//*[@id=\"full_name\"]"));
		 X4.sendKeys("Vicky");Thread.sleep(10);
		 
		 WebElement X5 = d.findElement(By.xpath("//*[@id=\"Submit\"]"));
		 X5.click();Thread.sleep(10);
		 
		 String s = d.getCurrentUrl();
		 
		 if(s.equals("http://adactinhotelapp.com/Register.php")) {
	      System.out.println("You are in Adact website");}
	      else {
	    	  System.out.println("You are not in Adact website");
	      }
		 
		 
		 
		 d.quit();
		 
		//  WebElement X = d.findElement(By.xpath("/html/body/input[1]"));	
		//  X.sendKeys("VigneshSankar");
        // X.clear();
         
		// WebElement X1 = d.findElement(By.xpath("/html/body/input[2]"));	
         
		//  X1.sendKeys("Raja987");
         
		// WebElement X2 = d.findElement(By.xpath("/html/body/input[3]"));	
         
		//  X2.click();
         
		//  WebElement X3 = d.findElement(By.xpath("/html/body/a[1]"));
         
		// X3.click();Thread.sleep(20);
		// d.navigate().back();
		// d.quit();
         
         
   
		
	}

}
