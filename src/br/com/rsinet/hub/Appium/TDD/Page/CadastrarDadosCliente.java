package br.com.rsinet.hub.Appium.TDD.Page;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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

	public WebElement ElementoNome() {
		return driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.EditText"));

	}

	public WebElement ElementoEmail() {
		return driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText"));

	}

	public WebElement ElementoSenha() {
		return driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.EditText\r\n"
						+ ""));
	}

	public WebElement ElementoConfirmasenha() {
		return driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.EditText\r\n"));
	}

	public WebElement ElementoPrimeiroNome() {
		return driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.EditText\r\n"));
	}

	public WebElement ElementoSegundoNome() {
		return driver.findElement(By.className("android.widget.EditText"));

	}

	public WebElement ElementoTelefone() {
		return driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText\r\n"));

	}

	public WebElement ElementoPais() {
		return driver.findElement(By.id("com.Advantage.aShopping:id/textViewCountries"));

	}
	public WebElement ElementoEstado(){
		return driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText\r\n"));
	}
	public WebElement ElementoEndereço() {
		return driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText\r\n" + 
				""));
	}
	public WebElement ElementoCidade() {
		return driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.EditText\r\n"));
	}
	public WebElement ElementoZip() {
		return driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.EditText\r\n"));
	}
	public WebElement ElementoResgistrar() {
		return driver.findElement(By.id("com.Advantage.aShopping:id/buttonRegister"));
	
}
	
	public void escreverNome(String nome) {
		ElementoNome().clear();
		ElementoNome().sendKeys(nome);

	}

	public void escreverEmail(String email) {
		ElementoEmail().clear();
		ElementoEmail().sendKeys(email);

	}

	public void escreverSenha(String senha) {
		ElementoSenha().clear();
		ElementoSenha().sendKeys(senha);
	}

	public void confirmarAsenha(String confirmesenha) {
		ElementoConfirmasenha().clear();
		ElementoConfirmasenha().sendKeys(confirmesenha);

	}

	public void escreverPrimeiroaNome(String primeironome) {
		ElementoPrimeiroNome().clear();
		ElementoPrimeiroNome().sendKeys(primeironome);
	}

	public void escreverSegundoNome(String segundonome) {
		ElementoSegundoNome().clear();
		ElementoSegundoNome().sendKeys(segundonome);
	}

	public void escreverTelefone(String telegone) {
		ElementoTelefone().clear();
		ElementoTelefone().sendKeys(telegone);
		action.press(PointOption.point(941, 1412)).moveTo(PointOption.point(925, 420)).release().perform();
	}
 public void escreverZip(String zip) {
	 ElementoZip().clear();
	 ElementoZip().sendKeys(zip);
	 
 }
	/*public void escolherPais(String pais) {
		ElementoPais().selectByVisibleTest(pais);*/
	
	
public void escreverEstado(String estado) {
	ElementoEstado().sendKeys(estado);
	
}
public void escreverEndereço(String endereço) {
	ElementoEndereço().sendKeys(endereço);
}
public void escreverCidade(String cidade) {
	ElementoCidade().sendKeys(cidade);
}
public void registrarNome() {
	ElementoResgistrar().click();
}
}