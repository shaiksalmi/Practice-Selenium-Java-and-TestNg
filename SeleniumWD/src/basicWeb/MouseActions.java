package basicWeb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
	//	driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		//WebElement boxA = driver.findElement(By.xpath("//li[text()= 'A']"));
		
	//	WebElement boxD = driver.findElement(By.xpath("//li[text()= 'D']"));

		
		//Actions actions = new Actions(driver);
		
	//	actions.moveToElement(boxA);
		
	//	actions.clickAndHold();
		//actions.moveToElement(boxD);
		
		//actions.contextClick(boxD);
		//actions.doubleClick(boxD);
		
		//Thread.sleep(2000);
		//actions.release().perform();
		//actions.build().perform();
		
		
		driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");
		WebElement elem1 = driver.findElement(By.id("draggable"));
		
		WebElement elem2 = driver.findElement(By.id("droppable"));
		
		Actions actions = new Actions(driver);
		actions.dragAndDrop(elem1, elem2);
		actions.build().perform();

		
		
		
	
		
		Thread.sleep(2000);
		
		System.out.println("Done");
		
		driver.quit();

	}

}
