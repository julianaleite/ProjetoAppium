package br.com.rsinet.hub.Appium.TDD.teste;

import java.io.IOException;
import java.net.MalformedURLException;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import br.com.rsinet.hub.Appium.Manager.DriverManager;
import br.com.rsinet.hub.Appium.TDD.Page.ProdutoTelaPrincipal;
import br.com.rsinet.hub.Appium.Utility.Reportes;
import br.com.rsinet.hub.Appium.Utility.Screenshot;
import io.appium.java_client.android.AndroidDriver;

public class TestePesquisaNaTelaPrincipal {

	private AndroidDriver driver;
	private ProdutoTelaPrincipal principal;

//	Metodo que chama a classe Reportes e o metodo inicia reporte
	@BeforeClass
	public static void IniciaReport() {
		Reportes.iniciaReport();

	}

// metodo que chama a classe reporte e o metodo fechar reporte
	@AfterClass
	public static void fechaReport() {
		Reportes.fechaReport();

	}

	ExtentTest test = Reportes.getTest();
	ExtentReports extent = Reportes.getExtent();

// Metodos que busca as informaçoes para da inicio aos testes , com as configuraçoes nescessaroias
	@Before
	public void IniciarTeste() throws MalformedURLException {

		driver = DriverManager.ConfiguraDriver();
		principal = new ProdutoTelaPrincipal(driver);
	}

	// Metodo para primeiro caso de teste da tela principal
	@Test
	public void TesteValidoTelaPrincipal() throws IOException {

		test = extent.startTest("teste principal Valido");

		principal.cliqueNoTablet();
		principal.EscolhaOTablet();

		// ScreenShot
		String screenShotPath = Screenshot.capture(driver, "tela principal Valido");
		// reporte
		test.log(LogStatus.PASS, "Funcionou: " + test.addScreenCapture(screenShotPath));

	}

//Metodo caso de teste invalido da tela principal 
	@Test
	public void TesteInvalidoTelaPrincipal() throws IOException {
		// test = extent.startTest("tela principal Invalido");

		principal.cliqueNoTablet();
		principal.EscolhaOTablet();
		principal.BotaoMaisQuantidadeTablet();

		for (int i = 0; i < 20; i++) {
			principal.MaisTablets();

		}
		principal.aplicarTablets();
		principal.addNoCarrinho();
		principal.digitarNome("juliana.teste@teste.com.br");
		principal.digitarSenha("1213Ju");
		principal.salvarLogin();

		String screenShotPath = Screenshot.capture(driver, "tela principal Invalido");

		// test.log(LogStatus.PASS, "Funcionou: " +
		// test.addScreenCapture(screenShotPath));
	}

// Metodo para finalizar os testes
	@After
	public void FinalTest() {
		DriverManager.fecharDriver();
	}
}