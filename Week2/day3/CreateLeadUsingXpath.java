package Week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLeadUsingXpath {
	

	public static void main(String[] args) {
	
 ChromeDriver drive = new ChromeDriver();	
drive.manage().window().maximize();
drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
drive.get("http://leaftaps.com/opentaps/control/login");
drive.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesManager");
drive.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
drive.findElement(By.xpath("//input[@type='submit']")).click();
drive.findElement(By.xpath("//a[contains (@href,'crmsfa')]")).click();
drive.findElement(By.xpath("//a[contains (@href,'/crmsfa/control/leadsMain')]")).click();
drive.findElement(By.xpath("//a[contains (@href,'createLeadForm')]")).click();
//driver.findElement(By.linkText("Leads")).click();
drive.findElement(By.xpath("//input [@id ='createLeadForm_companyName']")).sendKeys("TestLeaf");
drive.findElement(By.xpath("//input [@id ='createLeadForm_firstName']")).sendKeys("Gayatrii");
drive.findElement(By.xpath("//input[@id ='createLeadForm_lastName']")).sendKeys("Dandapatt");
drive.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("gayatri26.dandapat@gmail.com");
drive.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneNumber']")).sendKeys("2323562222");
drive.findElement(By.xpath("//input[@type='submit']")).click();
}
	
}