package pack;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.android.AndroidDriver;

public class SearchTescoStore {
	

	public static void searchTesco(RemoteWebDriver driver) throws Exception
	
	{
		 driver.findElement(By.xpath("//android.widget.ImageView[@resource-id='com.tesco.grocery.view:id/action_bar_up_navigation']")).click();
		 Thread.sleep(4000);
		 ((AndroidDriver) driver).scrollTo("Store locator");
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("//android.widget.TextView[@text='Store locator']")).click();
		 
		 Thread.sleep(8000);
		 driver.findElement(By.xpath("//android.widget.EditText[@resource-id='locality']")).click();
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//android.widget.EditText[@resource-id='locality']")).sendKeys("123456");
		 
		 Thread.sleep(2000);
		 
		 driver.navigate().back();
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//android.widget.Button[@content-desc='Find stores ']")).click();
		 
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("//android.widget.Button[@resource-id='com.tesco.grocery.view:id/ok_single_btn']")).click();
		 
		 Thread.sleep(6000);
		 driver.findElement(By.xpath("//android.widget.EditText[@resource-id='locality']")).sendKeys("SN13QA");
		
		  //driver_and.hideKeyboard();
		  
		 
		 Thread.sleep(2000);
		 driver.navigate().back();
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//android.widget.Button[@content-desc='Find stores ']")).click();
		 
		 Thread.sleep(6000);
		 driver.findElement(By.className("android.view.View")).click();
		 
		 
		 
	}

}
