package miscellaneous;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class FramesDemo {
			
	
			public static void main(String[] args) {
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://jqueryui.com/droppable/");	
			WebElement el = driver.findElement(By.xpath("//*[@id='content']/iframe"));
			driver.switchTo().frame(el);
			
			//this gives the total number of frames in the web page
			int count = driver.findElements(By.tagName("iframe")).size();
			System.out.println(count);
			Actions act = new Actions(driver);
			WebElement source = driver.findElement(By.id("draggable"));
			WebElement target = driver.findElement(By.id("droppable"));
			act.dragAndDrop(source, target).build().perform();
			
			//switches back to the default page
			driver.switchTo().defaultContent();
			
	}

}
