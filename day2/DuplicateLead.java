package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Email')]")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("@gmail.com");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		WebElement firstname = driver.findElement(By.xpath("//td[@class='x-grid3-col x-grid3-cell x-grid3-td-firstName ']//a[@class='linktext']"));
		String name = firstname.getText();
		System.out.println(name);
		driver.findElement(By.xpath("//td[@class='x-grid3-col x-grid3-cell x-grid3-td-firstName ']//a[@class='linktext']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Duplicate Lead')]")).click();
		WebElement pagetitle = driver.findElement(By.xpath("//div[contains(text(),'Duplicate Lead')]"));
		String title = pagetitle.getText();
		System.out.println(title);
		driver.findElement(By.name("submitButton")).click();
		WebElement duplicatename = driver.findElement(By.id("viewLead_firstName_sp"));
		String name2 = duplicatename.getText();
		System.out.println(name2);
		if (name==name2) {
			System.out.println("Both names are same:" +name +name2);
		}
		driver.close();
	}

}
