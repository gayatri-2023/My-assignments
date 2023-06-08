package Marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonTC {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags");
	   
		driver.findElement(By.xpath("//div[@aria-label='bags for men']")).click();
		String result=driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[1]")).getText();
		System.out.println(result);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='adidas']")).click();
		driver.findElement(By.xpath("//span[text()='PUMA']")).click();
	
		
driver.findElement(By.xpath("//span[@class='a-dropdown-label']")).click();
driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
String firstsearch=driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[1]")).getText();
System.out.println("Results found for new bag:"+firstsearch);
String price1=driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
System.out.println("price of first bag:"+price1);
//String secondsearch=driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[2]")).getText();
//System.out.println("Results found for new bag:"+secondsearch);
String pagetitle=driver.getTitle();
System.out.println("page title is :"+pagetitle);

	}

}
