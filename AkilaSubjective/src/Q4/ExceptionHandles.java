package Q4;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptionHandles 
{
	 static WebDriver driver;
	    public static void screenshot(String s)
	    {
	        //IO Exception
	        try {
	        TakesScreenshot screen =((TakesScreenshot)driver);
	        File SrcFile=screen.getScreenshotAs(OutputType.FILE);
	        File despath = new File("");
	        FileUtils.copyFile(SrcFile, despath);
	        } catch (IOException e) 
	        {
	            System.out.println("Path not found I/O exception");
	        }    
	    }
	    public static void main(String[] args) throws Exception
	    {
	          
	         driver = new ChromeDriver();
	         driver.manage().window().maximize();
	         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	         driver.get("http://newtours.demoaut.com/mercurysignon.php");
	         driver.findElement(By.name("userName")).sendKeys("Admin");
	         driver.findElement(By.name("password")).sendKeys("admin123");
	         //No Such Element Exception
	         try 
	         {
	            driver.findElement(By.name("data")).click();
	        } 
	         catch (Exception e) 
	        {
	            System.out.println("No Such Element Exception");
	            
	        }
	         //No Alert Present Exception
	         try 
	         {
	            Alert alert = driver.switchTo().alert();
	            alert.accept();
	        } 
	         catch (Exception e) 
	        {
	            System.out.println("No Alert Present Exception");
	            
	        }
	         //No Such Frame Exception
	         try {
	            driver.switchTo().frame("home");
	        } catch (Exception e) {
	            
	            System.out.println("No Such Frame Exception");
	        }
	         screenshot("homepage");
	         driver.findElement(By.name("login")).click();
	        
	         driver.close();
	         
	    }

}
