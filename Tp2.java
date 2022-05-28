package selenium.practice.java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tp2 {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ravina\\Desktop\\ritesh\\recordings\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Marvel's Jessica And Jones Imdb");
		driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//child::center//child::input[@name='btnK']")).click();
		
		

	}

}
