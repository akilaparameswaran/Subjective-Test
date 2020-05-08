package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MecuryTours {

	public static void main(String[] args) throws InterruptedException 
	{
		//System.setProperty("webdriver.chrome.diver", "C:\\Users\\akilap\\eclipse-workspace\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("Akila");
		driver.findElement(By.name("lastName")).sendKeys("Srikanth");
		driver.findElement(By.name("phone")).sendKeys("9789826879");
		driver.findElement(By.name("userName")).sendKeys("akilaps");
		driver.findElement(By.name("address1")).sendKeys("1-D Kesava");
		driver.findElement(By.name("city")).sendKeys("Chennai");
		driver.findElement(By.name("email")).sendKeys("akilaps90@gmail.com");
		driver.findElement(By.name("password")).sendKeys("entrance");
		driver.findElement(By.name("confirmPassword")).sendKeys("entrance");
		driver.findElement(By.name("register")).click();
		
		Thread.sleep(4000);
		
		driver.findElement(By.linkText("sign-in")).click();
		driver.findElement(By.name("userName")).sendKeys("akilaps90@gmail.com");
		driver.findElement(By.name("password")).sendKeys("entrance");
		driver.findElement(By.name("login")).click();

	}

}
