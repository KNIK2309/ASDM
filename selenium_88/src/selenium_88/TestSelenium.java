package selenium_88;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D://selenium//chromedriver_win32//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		//to get the elements corresponding to the email
		
		 WebElement email = driver.findElement(By.id("email"));	
		 
		 //to get the elements corresponding to the password
		 
		 WebElement password = driver.findElement(By.id("pass"));	
		 
		 email.sendKeys("7709749606");
		 password.sendKeys("rutujakelkar");
		 System.out.println("Text Field Set");
		 
		 
		 WebElement login = driver.findElement(By.id("u_0_3"));
		 login.click();
		 
		 
		 String title=driver.getTitle();
			System.out.println(title);
			driver.close();		


	}

}
