package com.selenium.AppiumProject;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	DesiredCapabilities capabilities  = new DesiredCapabilities();

        capabilities.setCapability("udid","0bb3b01a541d8f1a");
        capabilities.setCapability("deviceName","Nexus 5");
        capabilities.setCapability("platformVersion", "6.0.1");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("appPackage", "app.globallogic.com.glo");
        capabilities.setCapability("appActivity", "app.globallogic.com.glo.view.activities.Splash");

        AppiumDriver driver;
		try {
			driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
    }
}
