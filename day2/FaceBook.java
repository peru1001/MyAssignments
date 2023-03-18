package week2.day2;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) throws InterruptedException {
		 WebDriverManager.edgedriver().setup();
			EdgeDriver driver = new EdgeDriver();
      //WebDriverManager.chromedriver().setup();
		//ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		driver.findElement(By.xpath("//form[@id='reg']//input[@name='firstname']")).sendKeys("Amala");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Ram");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9658778542");
		driver.findElement(By.xpath("//div[@id='password_field']//input")).sendKeys("password");
		WebElement sourcedd = driver.findElement(By.id("day"));
		Select a = new Select(sourcedd);
		a.selectByValue("13");
		WebElement sourcemonth = driver.findElement(By.id("month"));
		Select b = new Select (sourcemonth);
		b.selectByVisibleText("Feb");
		WebElement sourceyear = driver.findElement(By.id("year"));
		Select c = new Select (sourceyear);
		c.selectByVisibleText("1993");
		driver.findElement(By.xpath("//input[@value='1']")).click();
		Thread.sleep(3000);
		System.out.println("Execution successfull");
	}

}
