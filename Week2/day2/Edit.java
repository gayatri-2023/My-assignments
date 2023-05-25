package Week2.day2;

	import java.time.Duration;
	import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

	public class Edit {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("http://leaftaps.com/opentaps/control/login");
			driver.findElement(By.id("username")).sendKeys("demosalesManager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Gayatri");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Dandapat");
			driver.findElement(By.name("submitButton")).click();
			driver.findElement(By.linkText("Edit")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("updateLeadForm_companyName")).clear();
			driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TestLeafnew" );
			driver.findElement(By.name("submitButton")).click();			
		
		//	driver.close();
			
			
		}
}
