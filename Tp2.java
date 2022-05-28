package selenium.practice.java;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tp2 {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ravina\\Desktop\\ritesh\\recordings\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Marvel's Jessica And Jones Imdb");
		
		WebDriverWait wait=new WebDriverWait(driver,4000);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//child::center//child::input[@name='btnK']"))));
		
		/*Actions act =  new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//child::center//child::input[@name='btnK']"))).click().perform();*/
		//driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//child::center//child::input[@name='btnK']")).click();
		WebElement e=driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//child::center//child::input[@name='btnK']"));
		JavascriptExecutor ex=(JavascriptExecutor)driver;
		ex.executeScript("arguments[0].click();", e);
		
		
		
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//h3[starts-with(text(),'Jessica Jones (TV Series 2015–2019) - IMDb')]")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[contains(text(),'Episode guide')]")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
         
		Select st=new Select(driver.findElement(By.xpath("//select[@id='bySeason']")));
		st.selectByValue("2");
		List<WebElement> ele=driver.findElements(By.xpath("//div[starts-with(@class,'list_item')]"));
		
		System.out.println("No. of Episodes in J&J "+ele.size());
		
		for(int i=1;i<ele.size();i++)
		{
			WebElement eletemp=ele.get(i);
			System.out.println("Name wise Episodes of J&J S01 "+eletemp.getText());
		}
		

	}

}
