package br.com.rsinet.hub.Appium.TDD.Page;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class CadastrarDadosCliente {

	private AndroidDriver driver;
	private WebElement element;
	private TouchAction action;

	public CadastrarDadosCliente(AndroidDriver driver) {
		this.driver = driver;
		action = new TouchAction(driver);
	}

// Metodo que busca o Elemento Digitar o nome 
	private WebElement ElementoNome() {
		return driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.EditText"));

	}

//Metodo que busca o Elemento do campo digitar email 
	private WebElement ElementoEmail() {
		return driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText"));

	}

	// Metodo que busca o Elemento do campo digitar senha
	private WebElement ElementoSenha() {
		return driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.EditText\r\n"
						+ ""));
	}

	// Metodo que busca o Elemento do campo digitar confirmar senha
	private WebElement ElementoConfirmasenha() {
		return driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.EditText\r\n"));
	}

	// Metodo que busca o Elemento do campo digitar primeiro nome
	private WebElement ElementoPrimeiroNome() {
		return driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.EditText\r\n"));
	}

	// Metodo que busca o Elemento do campo digitar segundo nome
	private WebElement ElementoSegundoNome() {
		return driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.EditText\r\n"));

	}

	// Metodo que busca o Elemento do campo digitar telefone
	private WebElement ElementoTelefone() {
		return driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText"));

	}

	private WebElement Country() {
		return driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout\r\n"));
	
		    }
	
//Metodo que busca o Elemento do campo digitar Estado
	private WebElement ElementoEstado() {
		return driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText\r\n" + 
				""));
	}
//Metodo que busca o Elemento do campo digitar Cidade
	private WebElement ElementoCidade() {
		return driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.EditText\r\n"));

	}

	// Metodo que busca o Elemento do campo digitar endereço
	private WebElement ElementoEndereço() {
		return driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText\r\n"));

	}

	// Metodo que busca o Elemento do campo digitar codigo
	private WebElement ElementoZip() {
		return driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.EditText\r\n"));
	}

	// Metodo que busca o Elemento do campo Registar
	private WebElement ElementoResgistrar() {
		return driver.findElement(By.id("com.Advantage.aShopping:id/buttonRegister"));
	}

	// Metodo que da o comando para o elemento nome
	public void escreverNome(String nome) {
		ElementoNome().sendKeys(nome);
		
	}

//Metodo que da o comando para o elemento email
	public void escreverEmail(String email) {
		ElementoEmail().sendKeys(email);

	}

//Metodo que da o comando para o elemento senha
	public void escreverSenha(String senha) {
		ElementoSenha().sendKeys(senha);
	}

	// Metodo que da o comando para o elemento confirmar senha
	public void confirmarAsenha(String confirmesenha) {
		ElementoConfirmasenha().sendKeys(confirmesenha);

	}

	// Metodo que da o comando para o elemento primeiro nome
	public void escreverPrimeiroaNome(String primeironome) {
		ElementoPrimeiroNome().sendKeys(primeironome);
	}

//Metodo que da o comando para o elemento segundo nome, e arrasta a tela do celuar.
	public void escreverSegundoNome(String segundonome) {
		ElementoSegundoNome().sendKeys(segundonome);
		action.press(PointOption.point(941, 1412)).moveTo(PointOption.point(925, 420)).release().perform();

		
	}

	// Metodo que da o comando para o elemento Telefone
	public void escreverTelefone(String telegone) {
		ElementoTelefone().sendKeys(telegone);
	}
	public void escolhePais() {
        ((FindsByAndroidUIAutomator<WebElement>) driver).findElementByAndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""
                        + "Brazil" + "\").instance(0))")
                .click();
	}
	public void clicaPais() {
		Country().click();
	}

	// Metodo que da o comando para o elemento codigo
	public void escreverZip(String zip) {
		ElementoZip().sendKeys(zip);
		action.press(PointOption.point(806, 1685)).moveTo(PointOption.point(824, 1171)).release().perform();

	}

	// Metodo que da o comando para o elemento Estado
	public void escreverEstado(String estado) {
		ElementoEstado().sendKeys(estado);

	}

	// Metodo que da o comando para o elemento Endereço
	public void escreverEndereço(String endereço) {
		ElementoEndereço().sendKeys(endereço);
	}

	// Metodo que da o comando para o elemento Cidade
	public void escreverCidade(String cidade) {
		ElementoCidade().sendKeys(cidade);
	}

//Metodo que da o comando para o elemento Registrar
	public void registrarNome() {
		ElementoResgistrar().click();
	}

}