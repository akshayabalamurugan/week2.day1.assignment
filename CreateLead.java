package week2.day1.assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
public class CreateLead {
	public static void main(String[] args) {
//		1. Launch URL "http://leaftaps.com/opentaps/control/login"
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
//        2. Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
//        3. Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
//        4. Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
//        5. Click on Leads Button
		driver.findElement(By.linkText("Leads")).click();
//        6. Click on Create Lead
		driver.findElement(By.linkText("Create Lead")).click();
//        7. Enter CompanyName Field Using id Locator
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Telekom");
//        8. Enter FirstName Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Akshaya");
//        9. Enter LastName Field Using id Locator
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Balamurugan");
//        10. Enter FirstName(Local) Field Using id Locator
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Akshaya");
//        11. Enter Department Field Using any Locator of Your Choice
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Telecommunication");
//        12. Enter Description Field Using any Locator of your choice
		driver.findElement(By.id("createLeadForm_description")).sendKeys("I wanted to create a form as assignment");
//        13. Enter your email in the E-mail address Field using the locator of your choice
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("akshayabalamurugan12@gmail.com");
//        14. Select State/Province as NewYork Using Visible Text
		WebElement state= driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select state1= new Select(state);
		state1.selectByVisibleText("New York");
//        15. Click on Create Button
		driver.findElement(By.className("smallSubmit")).click();
//        16. Get the Title of Resulting Page. refer the video  using driver.getTitle()
		String title=driver.getTitle();
		System.out.println(title);
	}
}
