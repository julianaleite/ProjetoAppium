package br.com.rsinet.hub.Appium.TDD.teste;

import java.io.IOException;
import java.net.MalformedURLException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import br.com.rsinet.hub.Appium.Manager.DriverManager;
import br.com.rsinet.hub.Appium.TDD.Page.BuscaLupa;
import br.com.rsinet.hub.Appium.Utility.Reportes;
import br.com.rsinet.hub.Appium.Utility.Screenshot;
import io.appium.java_client.android.AndroidDriver;

public class TestePesquisaLupa {

	private BuscaLupa pesquisa;
	private AndroidDriver driver;

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

	@Before
	public void InicioDoTeste() throws MalformedURLException {
		driver = DriverManager.ConfiguraDriver();
		pesquisa = new BuscaLupa(driver);

	}

// metodo para chamar classe e metodos de comandos para rodar teste valido 
	@Test
	public void TesteValidoPesquisa() throws IOException {
		test = extent.startTest("Teste de pesquisa Valido");
		pesquisa.Lupa();
		pesquisa.escreverPesquisa("laptops");
		pesquisa.Lupa();
		pesquisa.escolherProdutoDesejado();

		// ScreenShot
		String screenShotPath = Screenshot.capture(driver, "Pesquisa Valido");
		// reporte
		test.log(LogStatus.PASS, "Funcionou: " + test.addScreenCapture(screenShotPath));

	}
	// metodo para chamar classe e metodos de comandos para rodar teste Invalido

	@Test
	public void TesteInvalidoPesquisa() throws IOException {
		test = extent.startTest("Teste de pesquisa Invalido");
		pesquisa.Lupa();
		pesquisa.escreverPesquisa("Iphone");
		pesquisa.Lupa();

		String screenShotPath = Screenshot.capture(driver, "Pesquisa Invalida");

		test.log(LogStatus.PASS, "Funcionou: " + test.addScreenCapture(screenShotPath));

	}

	// metodo para chamar classe e metodo para finalizar o aplicativo
	@After
	public void FimTest() {
		DriverManager.fecharDriver();
	}
}
