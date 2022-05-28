package selenium.practice.java;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import net.jodah.failsafe.internal.util.Assert;



public class Tp1 {

	public static void main(String[] args) 
	
	{
        
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ravina\\Desktop\\ritesh\\recordings\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String m="upcoming";
		driver.get("https://www.google.com/");
		//Alert ac =driver.switchTo().alert();
		//ac.dismiss();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Marvels daredevil imdb");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.ENTER);
	//	driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//child::input[@value='Google Search']")).click();
		driver.findElement(By.xpath("//h3[contains(text(),'Daredevil (TV Series 2015–2018) - IMDb')]")).click();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[contains(text(),'Episode guide')]")).click();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        
		WebElement e=driver.findElement(By.xpath("//select[@id='bySeason']"));
		
		Select st =new Select(e);
		st.selectByValue("1");
		
		List<WebElement> l=driver.findElements(By.xpath("//div[contains(@class,'list_item')]"));
		System.out.println("No. of Episodes available in season 1 are "+l.size());
		
		System.out.println("Enter No. of Episode ");
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		int f=n-1;
		WebElement s=l.get(f);
		
		System.out.println("Episode no. "+n+" is "+s.getText());
		
		
		
		
	}

}
