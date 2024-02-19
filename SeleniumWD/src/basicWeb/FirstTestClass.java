package basicWeb;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstTestClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Navigate to seleniumdev page
		
		driver.get("https://trytestingthis.netlify.app/");
		
		WebElement dropdown = driver.findElement(By.id("option"));
		
		Select selectObject = new Select(dropdown);
		/*
		Thread.sleep(2000);
		selectObject.selectByIndex(1);
		selectObject.selectByValue("option 2");
		selectObject.selectByVisibleText("Option 3");
		
		*/
		
		//List<WebElement> allAvailableOptions = selectObject.getOptions();
		List<WebElement> allAvailableOptions = driver.findElements(By.id("option"));
		
		for(WebElement option : allAvailableOptions) {
			
			System.out.println(option.getText());
			//if(option.getText().equalsIgnoreCase("option 2"))
			//	option.click();
			
			
		}
		
		
		
		Thread.sleep(2000);
		driver.quit();
		System.out.println("Done");
		
		
		
		//driver.close();
		
		
		

	}

}
