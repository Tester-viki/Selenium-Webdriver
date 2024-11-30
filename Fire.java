package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Fire {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub

		
	WebDriver d = new FirefoxDriver();
	
	d.get("https://www.myntra.com/");
	
	String title = d.getTitle();
	System.out.println("Title: "+title);
	
	String url = d.getCurrentUrl();
	System.out.println("URL"+url);
	
	Thread.sleep(20);
    d.quit();	
	}

}
