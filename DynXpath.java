package selenium.practice.java;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynXpath {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ravina\\Desktop\\ritesh\\recordings\\Drivers\\chromedriver.exe");
		WebDriver driver;
		driver= new ChromeDriver();
		
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='txtUserName' and @type='text']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='txtPassword' and @type='password']")).sendKeys("admin");
		driver.findElement(By.xpath("//font[@color='#6C7E89' and @face='tahoma']")).getText();
		driver.findElement(By.name("Submit")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.switchTo().frame("rightMenu");
		
		List<WebElement> l=driver.findElements(By.xpath("//table[@class='data-table']//child::tbody//child::tr"));
		int m=l.size();
		System.out.println("No. of names avilable on the page are "+m);
		for(int i=1;i<=m;i++)
		{
			String s=driver.findElement(By.xpath("//table[@class='data-table']//child::tbody//child::tr["+i+"]//child::td[3]")).getText();
			if(s.equals("Sheldon Lee Cooper"))
			{
				System.out.println("Name Matched on "+i+"th row");
			}
		}
		driver.switchTo().defaultContent();
		driver.close();
		
		
		 
		
	}
    
	
	
	
	
	
	
	
	
	
}
