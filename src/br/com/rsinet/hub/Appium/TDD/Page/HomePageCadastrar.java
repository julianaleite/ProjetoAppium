package br.com.rsinet.hub.Appium.TDD.Page;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageCadastrar {
	private WebDriver driver;

	public HomePageCadastrar(WebDriver driver) throws MalformedURLException {
		this.driver = driver;
	}

	public void ElementoInicializador() {
		driver.findElement(By.id("com.Advantage.aShopping:id/imageViewMenu")).click();

	}
}
