package Week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLeadUsingXpath {

	public static void main(String[] args) throws InterruptedException {
	
		 ChromeDriver drive = new ChromeDriver();	
		 drive.manage().window().maximize();
		 drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 drive.get("http://leaftaps.com/opentaps/control/login");
		 drive.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesManager");
		 drive.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		 drive.findElement(By.xpath("//input[@type='submit']")).click();
		 drive.findElement(By.xpath("//a[contains (@href,'crmsfa')]")).click();
		//drive.findElement(By.xpath("//a[contains(text(),'Leads')]")).click(); 
		 //Click on Leads tab
		 drive.findElement(By.xpath("//a[contains (@href,'/crmsfa/control/leadsMain')]")).click();
		 //click on Findleads button
		 drive.findElement(By.xpath("//a[contains(@href,'findLeads')]")).click();
		 //click on Phone tab
		 drive.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
		 //click and search phone number
		 drive.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("2323562222");
		//click on Find Leads button in phone screen
		 drive.findElement(By.xpath("//button[@id='ext-gen334']")).click();
		 String text=null;
		 //click on the Lead Id field after search
		 text= drive.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).getText();//This a helped to get the first id
		 System.out.println("Lead Id is "+ text);
		 Thread.sleep(2000);
	
		 //Drill on lead id field
		 drive.findElement(By.xpath("//div[@class ='x-grid3-cell-inner x-grid3-col-partyId']//a")).click();
		//Click on Delete button
		drive.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
		 //Click on Find Leads again
		
		 drive.findElement(By.xpath("//a[contains(@href,'findLeads')]")).click();
		 
	
}
/*
		 
		Delete Lead:
		1	Launch the browser
		2	Enter the username
		3	Enter the password
		4	Click Login
		5	Click crm/sfa link
		6	Click Leads link
		7	Click Find leads
		8	Click on Phone
		9	Enter phone number
		10	Click find leads button
		11	Capture lead ID of First Resulting lead
		12	Click First Resulting lead
		13	Click Delete
		14	Click Find leads
		15	Enter captured lead ID
		16	Click find leads button
		17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		18	Close the browser (Do not log out)
*/

}