package br.com.rsinet.hub.Appium.Manager;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class DriverManager {
	public static AndroidDriver<MobileElement> driver;

	public static AndroidDriver<MobileElement> ConfiguraDriver() throws MalformedURLException {

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "juju");
		caps.setCapability("platformVersion", "9");
		caps.setCapability("platformName", "Android");
		caps.setCapability("appPackage", "com.Advantage.aShopping");
		caps.setCapability("appActivity", "com.Advantage.aShopping.SplashActivity");

		AndroidDriver<MobileElement> driver = null;
		if (driver == null) {

			driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
			driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);

		}
		return driver;
	}

	public static void fecharDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}
}
