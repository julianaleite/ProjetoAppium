package br.com.rsinet.hub.Appium.TDD.teste;

import java.io.IOException;
import java.net.MalformedURLException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
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
import br.com.rsinet.hub.Appium.Utility.*;
import io.appium.java_client.android.AndroidDriver;

public class TesteCadastarCliente {

	private AndroidDriver driver;
	private HomePageCadastrar homepage;
	private PageLogin logincliente;
	private CadastrarDadosCliente cadastrarcliente;
	private MassaDeDadosExcel massadados;

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

	// Metodo que chama todas a configuraçoes iniciais para efetuar os testes
	@Before
	public void IniciarTest() throws Exception {
		driver = DriverManager.ConfiguraDriver();
		ExcelUtils.setExcelFile(Constant.PathTestData + Constant.FileTestData, "Planilha1");
		homepage = new HomePageCadastrar(driver);
		logincliente = new PageLogin(driver);
		cadastrarcliente = new CadastrarDadosCliente(driver);
		massadados = new MassaDeDadosExcel();

	}

// Metodo para o Primeiro caso de teste positivo de cadastrar cliente usando massa do excel
	@Test
	public void Teste1PositivoCadastro() throws Exception {

		test = extent.startTest("Cadastro Valido");

		homepage.ElementoInicializador();
		logincliente.ElementoLogin();
		logincliente.CriarConta();
		homepage.ElementoInicializador();
		logincliente.ElementoLogin();
		logincliente.CriarConta();
		cadastrarcliente.escreverNome(massadados.userName());
		cadastrarcliente.escreverEmail(massadados.email());
		cadastrarcliente.escreverSenha(massadados.senha());
		cadastrarcliente.confirmarAsenha(massadados.confirmaSenha());
		cadastrarcliente.escreverPrimeiroaNome(massadados.primeiroNome());
		cadastrarcliente.escreverSegundoNome(massadados.ultimoNome());
		cadastrarcliente.escreverTelefone(massadados.telefone());
		cadastrarcliente.clicaPais();
		cadastrarcliente.escolhePais(massadados.Pais());
		cadastrarcliente.escreverEstado(massadados.Estado());
		cadastrarcliente.escreverEndereço(massadados.Endereco());
		cadastrarcliente.escreverCidade(massadados.Cidade());
		cadastrarcliente.escreverZip(massadados.Codigo());
		cadastrarcliente.registrarNome();
		
		Thread.sleep(5000);
		String conta = driver.findElementById("com.Advantage.aShopping:id/textViewAdvantage").getText();
		Assert.assertTrue(conta.contains("Create Account"));
//ScreenShot
		String screenShotPath = Screenshot.capture(driver, "Cadastro Valido");
// reporte 
		test.log(LogStatus.PASS, "Funcionou: " + test.addScreenCapture(screenShotPath));

	}

//Metodo para caso de teste negatuivo cadastrar cliente 
	@Test
	public void TesteNegativoCadastro() throws Exception {
		test = extent.startTest("Cadastro Invalido");

		homepage.ElementoInicializador();
		logincliente.ElementoLogin();
		logincliente.CriarConta();
		cadastrarcliente.escreverNome(massadados.userName());
		cadastrarcliente.escreverEmail(massadados.email());
		cadastrarcliente.escreverSenha(massadados.senha());
		cadastrarcliente.confirmarAsenha(massadados.confirmaSenha());
		cadastrarcliente.escreverPrimeiroaNome(massadados.primeiroNome());
		cadastrarcliente.escreverSegundoNome(massadados.ultimoNome());
		cadastrarcliente.escreverTelefone(massadados.telefone());
		cadastrarcliente.clicaPais();
		cadastrarcliente.escolhePais(massadados.Pais());
		cadastrarcliente.escreverEstado(massadados.Estado());
		cadastrarcliente.escreverEndereço(massadados.Endereco());
		cadastrarcliente.escreverCidade(massadados.Cidade());
		cadastrarcliente.escreverZip(massadados.Codigo());
		cadastrarcliente.registrarNome();
		
		String registerv = driver.findElementById("com.Advantage.aShopping:id/buttonRegister").getText();
		Assert.assertTrue(registerv.contains("REGISTER"));

		String screenShotPath = Screenshot.capture(driver, "Cadastro Invalido");

		test.log(LogStatus.PASS, "Funcionou: " + test.addScreenCapture(screenShotPath));
	}

//metodo que chama a classe driver manager com o metodo fechar driver para finalizar a classe de testes.
	@After
	public void AcabouTest() throws Exception {

		DriverManager.fecharDriver();

	}
}
