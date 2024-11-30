package testing;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Demo {


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.firefox.marionette","D:\\Browser\\Testingdemo\\Brower driver\\geckodriver.exe");    

	 WebDriver d = new FirefoxDriver ();
	 //deleting cookies
	 d.manage().deleteAllCookies();
	 //Thread.sleep(20);
	 
	 //Point p = new Point(240,240);
	 //d.manage().window().maximize();
     
	 
	 
	 
	 
	 //opening browser
	 d.get("https://www.facebook.com/");
	 Thread.sleep(2);
	 d.manage().window().maximize();
	 d.navigate().to("https://twitter.com/x/migrate?tok=7b2265223a222f222c2274223a313732323636363433357d34fce800bcf26e26ce2f152704e18b78");
	 Thread.sleep(10);
	 
	 d.navigate().back();
	 Thread.sleep(5);
	 
     d.navigate().forward();
	 Thread.sleep(5);
	 
	 d.quit();
	 //d.navigate().refresh();
	 


	 
  }

}

