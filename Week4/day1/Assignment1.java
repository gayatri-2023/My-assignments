package Week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
	 
	    driver.switchTo().frame("iframeResult");
       // driver.findElement(By.xpath("//button[contains(text(),'Try')]")).click();  
       driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
       
        Thread.sleep(2000);
        Alert alert= driver.switchTo().alert();
        Thread.sleep(2000);
        alert.sendKeys("Gayatri"); //sending text to a alert popup textbox for prompt alert
        alert.accept();
        String text1=driver.findElement(By.id("demo")).getText();
        System.out.println(text1);

	}

}
