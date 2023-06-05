package Week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/alert.xhtml");
		
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[1]")).click();
			Alert alert1 = driver.switchTo().alert();
			String text1 = alert1.getText();
			alert1.accept();
			System.out.println("Alert Simple Dialog:"+text1);
			
			Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]")).click();
			Alert alert2 = driver.switchTo().alert();
			String text2 = alert2.getText();
			alert2.accept();
			System.out.println("Alert Confirm Dialog:"+text2); 
			 
			//code to click on sweet alert which is inspectable
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]")).click();
			Thread.sleep(2000);
			String text3=driver.findElement(By.xpath("(//div[@class='ui-dialog-content ui-widget-content'])[1]")).getText();
			driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
			System.out.println("Sweet Alert Simple Dialog:"+text3); 	 
		 
		//code for clicking on Sweet alert didnt worked
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[5]")).click();
		String text4=driver.findElement(By.xpath("(//div[@class='ui-dialog-content ui-widget-content'])[2]")).getText();
		    Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[2]")).click();
		    System.out.println("Sweet Modal Dialog:"+text4);
			
			
			
		    
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[6]")).click();  
		//Thread.sleep(2000);
		    Alert alert3 = driver.switchTo().alert();
		    alert3.sendKeys("Gayatri");
		    Thread.sleep(2000);
		    alert3.accept();
			String text5 = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
			System.out.println("Alert Confirm Dialog:"+text5); 
			
			
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[7]")).click();  
			 Thread.sleep(2000);
			 String text6=driver.findElement(By.xpath("(//div[@class='ui-dialog-content ui-widget-content'])[4]")).getText();
			  driver.findElement(By.xpath("(//button[@aria-disabled='false'])[9]")).click();
			  System.out.println("Sweet Alert Confirmation:"+text6);
			  
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[8]")).click();
			  Thread.sleep(2000);
			  String text7=driver.findElement(By.xpath("(//div[@class='ui-dialog-content ui-widget-content'])[3]")).getText();
			  driver.findElement(By.xpath("(//a[@aria-label='Close'])[3]")).click();
			   System.out.println("Sweet Modal Min and Max:"+text7);  
			  
			

	}

}
