package Week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//div[@class='_6ltg']/a")).click(); 
		
		//parent to child-Click on Create New Account button
		//driver.findElement(By.xpath("//input[@name = 'firstname']/parent::div")).sendKeys("Gayatri");--doesnt work
	   //driver.findElement(By.xpath("//div[@class='_5dbb']/input")).sendKeys("Gayatri");//parent-child works
		driver.findElement(By.xpath("//form[@id='reg']//input[@name='firstname']")).sendKeys("Gayatri");
		driver.findElement(By.xpath("//form[@id='reg']//input[@name='lastname']")).sendKeys("Dandapat");
		driver.findElement(By.xpath("//form[@id='reg']//input[@name='reg_email__']")).sendKeys("abc@gmai.com");
		driver.findElement(By.xpath("//form[@id='reg']//input[@type='password']")).sendKeys("tree123");
		
		//Handle DOB dropdowns in fb
		
		WebElement eDay= driver.findElement(By.id("day"));
		Select dayy=new Select(eDay);
		dayy.selectByValue("26");
		
		WebElement eMon= driver.findElement(By.id("month"));
		Select mon=new Select(eMon);
		mon.selectByVisibleText("Jan");
		
		WebElement eYear= driver.findElement(By.id("year"));
		Select year=new Select(eYear);
		year.selectByValue("1987");
		
		driver.findElement(By.xpath("//input[@name='sex']")).click();
		
		//driver.close();

	}

}



/*



*/