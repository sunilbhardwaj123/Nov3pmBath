package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandlePromptPopUP {

	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/alerts");

		driver.findElement(By.id("promtButton")).click();
		Thread.sleep(2000);
				Alert aleart = driver.switchTo().alert();
				
			String alearttext = aleart.getText();
		System.out.println(alearttext);
				aleart.sendKeys("ankita");
				
		
				aleart.accept();
				
}
}
