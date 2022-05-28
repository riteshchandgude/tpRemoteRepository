package selenium.practice.java;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2
{
       public static void main(String []args) throws InterruptedException
       {
    	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ravina\\Desktop\\ritesh\\recordings\\Drivers\\chromedriver.exe");
    	   WebDriver driver= new ChromeDriver();
    	   driver.navigate().to("file:///C:/Users/Ravina/Desktop/ritesh/recordings/html%20files/WebTable.html");
    	   Thread.sleep(3000);
    	   driver.navigate().to("https://www.google.com/");
    	   int row = driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr")).size();
    	   int col = driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr[1]/td")).size();
    	   int row_col= driver.findElements(By.xpath("//*[@id='idCourse']/tbody/tr/td")).size();
    	   
    	   System.out.println("No. of rows are "+row);
    	   System.out.println("No. of columns are "+col);
    	   System.out.println("Size of entire content is "+row_col);
    	   
    	   String data1= driver.findElement(By.xpath("//*[@id='idCourse']/tbody/tr[3]/td[3]")).getText();	
    	   System.out.println("3rd row & 3rd column contains "+data1);
    	   
    	   for(int i=1;i<=row;i++)
    	   {
    		   
    		   String data2=driver.findElement(By.xpath("//*[@id='idCourse']/tbody/tr["+i+"]")).getText();
    		   System.out.println("Matter of entire content is "+data2);   
    	   }
       }
       
       
       
}
