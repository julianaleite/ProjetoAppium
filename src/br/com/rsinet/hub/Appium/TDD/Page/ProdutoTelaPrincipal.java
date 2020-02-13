package br.com.rsinet.hub.Appium.TDD.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class ProdutoTelaPrincipal {

	private AndroidDriver driver;
	private WebElement element;
	private TouchAction action;

	public ProdutoTelaPrincipal(AndroidDriver driver) {
		this.driver = driver;
		action = new TouchAction(driver);

	}

//Metodo que busca o elemento clicar na pagina de tablets
	private WebElement ClicarTablet() {
		return driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[3]/android.widget.ImageView"));

	}

	// Metodo que busca o elemento do tablets escolhido
	private WebElement EscolherTablet() {
		return driver.findElement(By.xpath(
				"//android.widget.RelativeLayout[@content-desc=\"Tablets\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[1]/android.widget.ImageView"));
	}

	// Metodo que busca o elemento botao de acrecentar mais tablets
	private WebElement ClicarMaisTablet() {
		return driver.findElement(By.id("com.Advantage.aShopping:id/textViewProductQuantity"));
	}

	// Metodo que busca o elemento de acrecentar mais quantidade de tablets
	private WebElement MaisQuantidadeDeTablet() {
		return driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.ImageView[2]"));

	}

	// Metodo que busca o elemento aplicar a quantidade escolhida
	private WebElement aplicar() {
		return driver.findElement(By.id("com.Advantage.aShopping:id/textViewApply"));

	}

	// Metodo que busca o elemento adicionar no carrinho
	private WebElement addCarrinho() {
		return driver.findElement(By.id("com.Advantage.aShopping:id/buttonProductAddToCart"));
	}

	// Metodo que busca o elemento do campo digitar o email para fazer login
	private WebElement userName() {
		return driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[3]/android.widget.EditText\r\n"));
	}

	// Metodo que busca o elemento do campo digita senha na pagina de fazer login
	private WebElement senha() {
		return driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[4]/android.widget.EditText\r\n"));
	}

// Metodo que busca o elemento para efetua login 
	private WebElement login() {
		return driver.findElement(By.id("com.Advantage.aShopping:id/buttonLogin"));
	}

// Metodo que da o comando para clicar no tablet
	public void cliqueNoTablet() {
		ClicarTablet().click();

	}

//Metodo que da o comando para escolher o tablet desejado
	public void EscolhaOTablet() {
		EscolherTablet().click();
	}

	// Metodo que da o comando para acrecentar mais tablet
	public void BotaoMaisQuantidadeTablet() {
		ClicarMaisTablet().click();
	}

	// Metodo que acrecenta mais quantidade de tablets
	public void MaisTablets() {
		MaisQuantidadeDeTablet().click();
	}

	// Metodo que da o comando para aplicar a quantidade desejada de tablets
	public void aplicarTablets() {
		aplicar().click();
	}

	// Metodo que da o comando para adicionar no carrinho
	public void addNoCarrinho() {
		addCarrinho().click();
	}

	// Metodo que da o comando de digitar o email para fazer login
	public void digitarNome(String nome) {
		userName().sendKeys(nome);
	}

//Metodo que da o comando de digitar a senha para fazer login 
	public void digitarSenha(String senha) {
		senha().sendKeys(senha);
	}

//Metodo que da o comando para efetuar login na conta 
	public void salvarLogin() {
		login().click();
	}
}
