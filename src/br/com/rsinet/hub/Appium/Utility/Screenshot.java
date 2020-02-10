package br.com.rsinet.hub.Appium.Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.appium.java_client.android.AndroidDriver;

// classe para identificar qual pasta sera saldo os prints
public class Screenshot {

	public static String capture(WebDriver driver, String screenShotName) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        String dest = System.getProperty("user.dir") + "\\Screenshots\\" + screenShotName + ".png";
        File destination = new File(dest);
        FileUtils.copyFile(source, destination);
        return dest;
        
	}
}