package pack;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Configuration {
	
	public RemoteWebDriver driver;
	DesiredCapabilities capabilities=new DesiredCapabilities();
	public SearchTescoStore tesco;
	
	@BeforeTest
	@Parameters({"Device_ID","OS_Version"})
	public void setupDriver(String Device_ID,String OS_Version) throws MalformedURLException
	{
		if(Device_ID.equalsIgnoreCase("8TVK8T6S9SNFHEQ4"))
		{
			
			setupCapabilities(Device_ID,OS_Version);
			System.out.println("Into Device ID::"+Device_ID);
			driver = new AndroidDriver(new URL("http://9.84.222.111:5555/wd/hub"), capabilities);
		}
		if(Device_ID.equalsIgnoreCase("emulator-5554"))
		{
			
			setupCapabilities(Device_ID,OS_Version);
			System.out.println("Into Device ID:"+Device_ID);
			driver = new AndroidDriver(new URL("http://9.77.88.27:5552/wd/hub"), capabilities);
		}
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		tesco=new SearchTescoStore();
	}
	
public void setupCapabilities(String device,String os_version)

{
	
	capabilities.setCapability("BROWSER_NAME", "Android");
	capabilities.setCapability("automationName", "Appium");
	capabilities.setCapability("platformVersion",os_version); 
	capabilities.setCapability("deviceName",device);
	capabilities.setCapability("platformName","Android");
	capabilities.setCapability("version","6.0");
	capabilities.setCapability("platform","Android");
    capabilities.setCapability("appPackage","com.tesco.grocery.view");
    capabilities.setCapability("appActivity","md50c9efa6bac9366ed33bd663294b9f0f7.TabSplashScreenActivity");
}


@Test
public void searchTescoStore() throws Exception

{
	tesco.searchTesco(driver);
}

}
