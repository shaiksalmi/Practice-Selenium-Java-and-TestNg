package basicWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loctors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://classic.freecrm.com/");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("username");
		
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("username");
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		

	}

}
