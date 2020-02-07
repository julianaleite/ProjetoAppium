package br.com.rsinet.hub.Appium.TDD.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuscaLupa {
	
	private WebDriver driver;

	public BuscaLupa(WebDriver driver) {
		this.driver = driver;
	}
	
	public void ClicarNalupa() {
		driver.findElement(By.id("com.Advantage.aShopping:id/imageViewSearch")).click();
		
	}
	public void ClicarCampoDePesquisa() {
		driver.findElement(By.id("com.Advantage.aShopping:id/editTextSearch")).sendKeys("LAPTOPS");
	}
	public void EscolherLaptop() {
		driver.findElement(By.id("com.Advantage.aShopping:id/imageViewProduct")).click();
	}
	public void PesquisarCelular() {
		driver.findElement(By.id("com.Advantage.aShopping:id/editTextSearch")).sendKeys("Celular");
}
}