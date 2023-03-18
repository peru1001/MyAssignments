package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

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
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Kumaran");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[@class='x-grid3-col x-grid3-cell x-grid3-td-firstName ']//a[@class='linktext']")).click();
		WebElement pagetitle = driver.findElement(By.id("sectionHeaderTitle_leads"));
		String title = pagetitle.getText();
		System.out.println(title);
		driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		WebElement existingname = driver.findElement(By.xpath("(//input[@name='companyName'])[2]"));
		String oldname = existingname.getText();
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).clear();
		driver.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("Cognizant");
		driver.findElement(By.name("submitButton")).click();
		WebElement companyname = driver.findElement(By.id("viewLead_companyName_sp"));
		String newname = companyname.getText();
		if (oldname!=newname) {
			
			System.out.println(newname);
		}
		driver.close();
		
	}

}
