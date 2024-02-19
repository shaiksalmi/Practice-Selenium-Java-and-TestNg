

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//js alert
		
		/*driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		
		Alert alert1 = driver.switchTo().alert();
		
		System.out.println(alert1.getText());
		
		alert1.accept();
		
		if(driver.getPageSource().contains("You successfully clicked an alert"))
			System.out.println("You successfully clicked an alert");
		
		*/
		
		//js cofirm
		
		
driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		
		Alert alert2 = driver.switchTo().alert();
		
		System.out.println(alert2.getText());
		
		alert2.dismiss();
		
		if(driver.getPageSource().contains("You clicked: Cancel"))
			System.out.println("You clicked: Cancel");
		
		
		
	}

}
