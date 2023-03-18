package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Create Contact')]")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Lynn");
		driver.findElement(By.id("lastNameField")).sendKeys("Heath");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Local");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Name");
		driver.findElement(By.name("departmentName")).sendKeys("Finance");
		driver.findElement(By.name("description")).sendKeys("Experienced in Finance Department");
		driver.findElement(By.xpath("//td[@colspan='4']//input[@name='primaryEmail']")).sendKeys("test@gmail.com");
		WebElement state = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select statenew = new Select(state);
		statenew.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@value='Create Contact']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Important Notes");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		Thread.sleep(1000);
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
		
	}

}
