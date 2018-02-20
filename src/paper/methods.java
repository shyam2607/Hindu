package paper;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class methods 
{
public static AndroidDriver driver;
public static File src=new File(".\\excel\\hindu.xlsx");
public static XSSFWorkbook workbook;
public static XSSFSheet sheet;
public static XSSFCell cell;

  @Test
  public void install() throws MalformedURLException, InterruptedException 
  {
		// Created object of DesiredCapabilities class.
		  DesiredCapabilities capabilities = new DesiredCapabilities();

		  // Set android deviceName desired capability. Set your device name.
		  capabilities.setCapability("deviceName", "ZY223K962H");

		  // Set BROWSER_NAME desired capability. It's Android in our case here.
		  capabilities.setCapability(CapabilityType.BROWSER_NAME, "Android");

		  capabilities.setCapability("platformName", "Android");
		  // Set android VERSION desired capability. Set your mobile device's OS version.
		  capabilities.setCapability(CapabilityType.VERSION, "7.0.1");

		  // Set android platformName desired capability. It's Android in our case here.
		  
		  
		  //launch the hindu app using the apk file
		  capabilities.setCapability("app", "C:\\Users\\Mathivathani\\eclipse-workspace\\Hindu\\apk\\hindu.apk");
		  
		  // Set android appPackage desired capability. It is
		  // com.hindu.droid for hindu application.
		  capabilities.setCapability("appPackage", "com.tamilthehindu");

		  
		  // com.hindu.droid.account.splash.SplashActivity for hindu application.
		  capabilities.setCapability("appActivity", "com.tamilthehindu.SplashScreenActivity");
		  
		  // Created object of RemoteWebDriver will all set capabilities.
		  // Set appium server address and port number in URL string.
		  // It will launch hindu app in android device.
		  driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		  driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		  Thread.sleep(5000);
  }
  public void access() throws InterruptedException
	{
		driver.findElement(By.xpath(".//android.widget.Button[@text='ALLOW']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//android.widget.Button[@resource-id='android:id/button2']")).click();
		Thread.sleep(5000);
		
	}
}
