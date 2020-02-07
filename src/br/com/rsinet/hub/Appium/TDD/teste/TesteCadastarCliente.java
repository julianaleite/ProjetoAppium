package br.com.rsinet.hub.Appium.TDD.teste;

import java.io.IOException;
import java.net.MalformedURLException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import br.com.rsinet.hub.Appium.Manager.DriverManager;
import br.com.rsinet.hub.Appium.TDD.Page.CadastrarDadosCliente;
import br.com.rsinet.hub.Appium.TDD.Page.HomePageCadastrar;
import br.com.rsinet.hub.Appium.TDD.Page.PageLogin;
import br.com.rsinet.hub.Appium.Utility.Reportes;
import br.com.rsinet.hub.Appium.Utility.Screenshot;
import io.appium.java_client.android.AndroidDriver;

public class TesteCadastarCliente {

	private AndroidDriver driver;
	private HomePageCadastrar homepage;
	private PageLogin logincliente;
	private CadastrarDadosCliente cadastrarcliente;

	@BeforeClass
	public static void IniciaReport() {
		Reportes.iniciaReport();

	}

	@AfterClass
	public static void fechaReport() {
		Reportes.fechaReport();

	}

	ExtentTest test = Reportes.getTest();
	ExtentReports extent = Reportes.getExtent();

	@Before
	public void IniciarTest() throws MalformedURLException {
		driver = DriverManager.ConfiguraDriver();
		homepage = new HomePageCadastrar(driver);
		logincliente = new PageLogin(driver);
		cadastrarcliente = new CadastrarDadosCliente(driver);

	}

	@Test
	public void Teste1PositivoCadastro() throws InterruptedException, IOException {

		test = extent.startTest("Cadastro Valido");

		homepage.ElementoInicializador();
		logincliente.ElementoLogin();
		logincliente.CriarConta();
		cadastrarcliente.escreverNome("Juliana");
		cadastrarcliente.escreverEmail("juliana.teste@teste.com.br");
		cadastrarcliente.escreverSenha("1213Ju");
		cadastrarcliente.confirmarAsenha("1213Ju");
		cadastrarcliente.escreverPrimeiroaNome("Juliana");
		cadastrarcliente.escreverSegundoNome("Silva");
		cadastrarcliente.escreverTelefone("987654321");
		cadastrarcliente.escreverEstado("SP");
		cadastrarcliente.escreverEndereço("Rua teste automaçao");
		cadastrarcliente.escreverCidade("Barueri");
		cadastrarcliente.escreverZip("654321");
		cadastrarcliente.registrarNome();

		String screenShotPath = Screenshot.capture(driver, "Cadastro Valido");

		test.log(LogStatus.PASS, "Funcionou: " + test.addScreenCapture(screenShotPath));
//		test = extent.startTest("Registro válido");

	}

	@After
	public void AcabouTest() throws Exception {

		DriverManager.fecharDriver();

	}
}
