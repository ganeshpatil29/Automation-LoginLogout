package LOGINLOGOUT;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAndLogout 
{
	public static void main(String[] args) throws Exception
	{
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		wd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); //this will redirect you to the webpage
		
		//Login
		Thread.sleep(2000);
		wd.findElement(By.xpath("//input [@name='username']")).sendKeys("Admin"); // using the elements you can locate the placeholder for sending username and password.
		wd.findElement(By.xpath("//input [@name='password']")).sendKeys("admin123");
		wd.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
		//Logout
        wd.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
		wd.findElement(By.xpath("//a[.='Logout']")).click();  // here . this dot indicates the text that is present on the back-end code.
		
		wd.quit(); // this will end your session.
		
	}

}
