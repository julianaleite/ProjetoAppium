package br.com.rsinet.hub.Appium.TDD.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BuscaLupa {

	private WebDriver driver;
	private WebElement element;

	public BuscaLupa(WebDriver driver) {
		this.driver = driver;
	}

	// Metodo que busca o Elemento clicar na lupa
	private WebElement ClicarNalupa() {
		return driver.findElement(By.id("com.Advantage.aShopping:id/imageViewSearch"));

	}

	// Metodo que busca o Elemento clicar no campo de pesquisa da lupa
	private WebElement ClicarCampoDePesquisa() {
		return driver.findElement(By.id("com.Advantage.aShopping:id/editTextSearch"));

	}

	// Metodo que busca o Elemento dos produtos laptops
	private WebElement EscolherLaptop() {
		return driver.findElement(By.xpath(
				"//android.widget.RelativeLayout[@content-desc=\"Search\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[4]/android.widget.ImageView\r\n"));
	}

	// Metodo que da o comando para o elemento Estado
	public void Lupa() {
		ClicarNalupa().click();

	}

// Metodo que da o comando para clicar no campo de pesquisa e escrever o produto desejado

	public void escreverPesquisa(String laptops) {
		ClicarCampoDePesquisa().sendKeys(laptops);
	}

//Metodo que da o comando para escolher o prodito desejado laptop
	public void escolherProdutoDesejado() {
		EscolherLaptop().click();

	}

}
