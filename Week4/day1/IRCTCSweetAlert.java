package Week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IRCTCSweetAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.findElement(By.xpath("(//input[@role='searchbox'])[1]")).sendKeys("CHENNAI EGMORE - MS");
		driver.findElement(By.xpath("(//input[@role='searchbox'])[2]")).sendKeys("KANYAKUMARI - CAPE");
		driver.findElement(By.xpath("//button[contains(text(),'Search')]")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("(//span[contains(@class,'repeat')])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='WL col-xs-12'])[1]")).click();
		driver.findElement(By.xpath("(//button[contains (text(),'Book Now')])[1]")).click();
		driver.findElement(By.xpath("//span[text()='No']")).click();
		
	}

}
/*a)Launch the browser
b)Load the url https://www.irctc.co.in/nget/train-search
c)Enter MS in ‘From’ textbox
d)Enter Cape in ‘To’ textbox
e)Click search button 
f)Click refresh button
g)Click WL and Click BookNow button
e)Click No button in the alert<sweet alert>*/