package selenium.practice.java;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ex1 
{
    public static void main(String []args) throws Exception
    {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ravina\\Desktop\\ritesh\\recordings\\Drivers\\chromedriver.exe");
    	WebDriver driver=new ChromeDriver();
    	try {
    	driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
    	if(driver.getTitle().equals("OrangeHRM - New Level of HR Management"))
    	{
    	System.out.println("Title matched");
    	}else
    	{
    		System.out.println("Title not matched");
    	}
    	driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys("addmin");
    	
    	
    	
    	
    	
    	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admiin");
    	WebDriverWait w=new WebDriverWait(driver, 4000);
    	w.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("Submit"))));
    	
    	driver.findElement(By.xpath("//input[@value='Login']")).click();
       /* Robot r=new Robot();
    	r.keyPress(KeyEvent.VK_TAB);
    	r.keyRelease(KeyEvent.VK_TAB);
    	r.keyPress(KeyEvent.VK_ENTER);
    	r.keyRelease(KeyEvent.VK_ENTER); */
    	
    /*	WebElement element=driver.findElement(By.name("Submit"));
    	JavascriptExecutor ex=(JavascriptExecutor)driver;
    	ex.executeScript("arguments[0].click();", element); */
    	
    	
    	
    /*	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    	Thread.sleep(3000);
    	driver.switchTo().frame("rightMenu");
    	
    	driver.findElement(By.linkText("Bjorn - Lothbrok")).click();
    	driver.findElement(By.xpath("//span[@id='empname']")).click();
    	WebElement fileinput=driver.findElement(By.name("photofile"));
    	fileinput.sendKeys("C:\\Users\\Ravina\\Desktop\\ritesh\\sc shots\\bjorn.jpg");
    	driver.findElement(By.xpath("//input[@onclick='addPic();']")).click();
    	
    	Thread.sleep(8000); 
    	
    	driver.switchTo().defaultContent(); */
    	Thread.sleep(8000);
    	driver.findElement(By.linkText("Logout")).click();
    	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    	driver.quit();
    	
    	}catch(Exception e)
    	{
    		File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    		FileUtils.copyFile(f1, new File("C:\\Users\\Ravina\\Desktop\\ritesh\\sc shots\\Testresult.png"));
    		System.out.println("Screenshot Captured");
    	}
    	
    }
	
	
	
}
