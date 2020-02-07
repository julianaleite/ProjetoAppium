package br.com.rsinet.hub.Appium.TDD.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PageLogin {

	private WebDriver driver;

	public PageLogin(WebDriver driver) {
		this.driver = driver;
	}
public void ElementoLogin() {
		driver.findElement(By.id("com.Advantage.aShopping:id/linearLayoutLogin")).click();
	
	//public void  botaoLogin() { driver.findElement(By.xpath("//android.support.v4.widget.DrawerLayout[@content-desc=\"Main Menu\"]/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]"));
}
	public void CriarConta() {
			driver.findElement(By.id("com.Advantage.aShopping:id/textViewDontHaveAnAccount")).click();
	}
}