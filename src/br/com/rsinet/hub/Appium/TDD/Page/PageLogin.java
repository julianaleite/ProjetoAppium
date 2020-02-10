package br.com.rsinet.hub.Appium.TDD.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class PageLogin {

	private AndroidDriver driver;
	private WebElement element;
	private TouchAction action;

	public PageLogin(AndroidDriver driver) {
		this.driver = driver;
		action = new TouchAction(driver);
	}

	// Metodo que busca o elemento login para entrar para pagina de criar conta.
	// metodo da direto o comando click.
	public void ElementoLogin() {
		driver.findElement(By.id("com.Advantage.aShopping:id/linearLayoutLogin")).click();

	}

// Metodo que busca o elemento criar conta para entrar para pagina de criar cadastro , o metodo da direto o comando click.
	public void CriarConta() {
		driver.findElement(By.id("com.Advantage.aShopping:id/textViewDontHaveAnAccount")).click();
	}
}