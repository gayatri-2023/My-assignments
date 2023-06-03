package Week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditUsingAdvancedXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//form[@id='login']//input[@id='username']")).sendKeys("demosalesManager");
		
		driver.findElement(By.xpath("//form[@id='login']//input[@id='password']")).sendKeys("crmsfa");//GP-child
		
		driver.findElement(By.xpath("//form[@id='login']//input[@type='submit']")).click();
		driver.findElement(By.xpath("//div[@for='crmsfa']/a")).click(); //P-->C
		//click on Leads
		driver.findElement(By.xpath("//div[@class='x-panel-header']//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[contains(@href,'createLeadForm')]")).click();//couldnt do with advanced xpath
		driver.findElement(By.xpath("//form[@id='createLeadForm']//input[@id='createLeadForm_companyName']")).sendKeys("ABC");
		
		driver.findElement(By.xpath("//form[@id='createLeadForm']//input[@id='createLeadForm_firstName']")).sendKeys("A");
		driver.findElement(By.xpath("//form[@id='createLeadForm']//input[@id='createLeadForm_firstName']")).sendKeys("A");
		driver.findElement(By.xpath("//form[@id='createLeadForm']//input[@id='createLeadForm_lastName']")).sendKeys("B");
		
		driver.findElement(By.xpath("//form[@id='createLeadForm']//input[@name='submitButton']")).click();
	//click on edit button
		driver.findElement(By.xpath("//div[@class='frameSectionHeader']//a[text()='Edit']")).click();
		driver.findElement(By.xpath("//form[@id='updateLeadForm']//input[@id='updateLeadForm_companyName']")).clear();
		driver.findElement(By.xpath("//form[@id='updateLeadForm']//input[@id='updateLeadForm_companyName']")).sendKeys("ABCD");
		driver.findElement(By.xpath("//form[@id='updateLeadForm']//input[@value='Update']")).click();
		
	}
	

}
