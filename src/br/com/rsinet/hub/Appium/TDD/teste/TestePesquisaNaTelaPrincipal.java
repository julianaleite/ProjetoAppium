package br.com.rsinet.hub.Appium.TDD.teste;

import java.net.MalformedURLException;

import org.testng.annotations.Test;
import org.aspectj.lang.annotation.After;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import br.com.rsinet.hub.Appium.Manager.DriverManager;
import br.com.rsinet.hub.Appium.TDD.Page.ProdutoTelaPrincipal;

public class TestePesquisaNaTelaPrincipal {

	private WebDriver driver;
	private ProdutoTelaPrincipal principal;

	@BeforeMethod
	public void IniciarTeste() throws MalformedURLException {
		driver = DriverManager.ConfiguraDriver();
		principal = new ProdutoTelaPrincipal(driver);

	}


	@Test
	public void TesteValidoTelaPrinpal() {
		principal.ClicarTablet();
		principal.EscolherTablet();

	}

	@Test
	public void TesteInvalidoTelaPrincipal() {
		principal.ClicarTablet();
		principal.EscolherTablet();
		principal.ClicarMaisTablet();

		for (int i = 0; i < 20; i++) {
			principal.MaisQuantidadeDeTablet(driver);

		}
		principal.aplicar();
		principal.addCarrinho();
	}

	@AfterMethod
	public void FinalTest() {
		DriverManager.fecharDriver();
	}
}