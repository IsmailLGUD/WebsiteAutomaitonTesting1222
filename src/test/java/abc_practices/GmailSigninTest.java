package abc_practices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailSigninTest {

	public static void main(String[] args) throws Throwable {
		System.out.println("Welcome to Gmail sign in test project!");		
		System.setProperty("webdriver.chrome.driver", 
				 "C:/Users/MD. ISMAIL HOSSAIN/utilities/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // For Chrome Browser
				driver.get("https://www.google.com");
				
				//driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div[2]/a[1]")).click();
				driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[1]/a")).click();
				driver.findElement(By.xpath("/html/body/header/div/div/div/a[2]")).click();
				driver.findElement(By.xpath("//*[@id=\\\"yDmH0d\\")).sendKeys("mdismailhossain215@gmail.com");
				//driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]")).sendKeys("mdismailhossain215@gmail.com");
				System.out.println("I clicked on the Sign in button ..............");
				
				Thread.sleep(500);
				
	}

}
