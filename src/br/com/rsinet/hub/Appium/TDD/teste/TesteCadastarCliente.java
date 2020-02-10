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

import br.com.rsinet.hub.Appium.Utility.*;
import io.appium.java_client.android.AndroidDriver;

public class TesteCadastarCliente {

	private AndroidDriver driver;
	private HomePageCadastrar homepage;
	private PageLogin logincliente;
	private CadastrarDadosCliente cadastrarcliente;

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

	//Metodo que chama todas a configuraçoes iniciais para efetuar os testes
	@Before
	public void IniciarTest() throws Exception {
		driver = DriverManager.ConfiguraDriver();
		ExcelUtils.setExcelFile(Constant.PathTestData + Constant.FileTestData, "Planilha1");
		homepage = new HomePageCadastrar(driver);
		logincliente = new PageLogin(driver);
		cadastrarcliente = new CadastrarDadosCliente(driver);

	}

// Metodo para o Primeiro caso de teste positivo de cadastrar cliente usando massa do excel
	@Test
	public void Teste1PositivoCadastro() throws Exception {

		test = extent.startTest("Cadastro Valido");

		String username = ExcelUtils.getCellData(1, 0);
		String Email = ExcelUtils.getCellData(1, 1);
		String senha = ExcelUtils.getCellData(1, 2);
		String senhaConfirme = ExcelUtils.getCellData(1, 3);
		String primeiroNome = ExcelUtils.getCellData(1, 4);
		String ultimoNome = ExcelUtils.getCellData(1, 5);
		String Telefone = ExcelUtils.getCellData(1, 6);
		String Pais = ExcelUtils.getCellData(1, 7);
		String Cidade = ExcelUtils.getCellData(1, 8);
		String Endereço = ExcelUtils.getCellData(1, 9);
		String Estado = ExcelUtils.getCellData(1, 10);
		String Codigo = ExcelUtils.getCellData(1, 11);

		homepage.ElementoInicializador();
		logincliente.ElementoLogin();
		logincliente.CriarConta();
		cadastrarcliente.escreverNome(username);
		cadastrarcliente.escreverEmail(Email);
		cadastrarcliente.escreverSenha(senha);
		cadastrarcliente.confirmarAsenha(senhaConfirme);
		cadastrarcliente.escreverPrimeiroaNome(primeiroNome);
		cadastrarcliente.escreverSegundoNome(ultimoNome);
		cadastrarcliente.escreverTelefone(Telefone);
		cadastrarcliente.clicaPais();
		cadastrarcliente.escolhePais();
		cadastrarcliente.escreverEstado(Estado);
		cadastrarcliente.escreverEndereço(Endereço);
		cadastrarcliente.escreverCidade(Cidade);
		cadastrarcliente.escreverZip(Codigo);
		cadastrarcliente.registrarNome();
//ScreenShot
		String screenShotPath = Screenshot.capture(driver, "Cadastro Valido");
// reporte 
		test.log(LogStatus.PASS, "Funcionou: " + test.addScreenCapture(screenShotPath));

	}

//Metodo para caso de teste negatuivo cadastrar cliente 
	@Test
	public void TesteNegativoCadastro() throws IOException {
		test = extent.startTest("Cadastro Invalido");

		homepage.ElementoInicializador();
		logincliente.ElementoLogin();
		logincliente.CriarConta();
		cadastrarcliente.escreverNome("Juliana");
		cadastrarcliente.escreverEmail("juliana.teste@teste.com.br");
		cadastrarcliente.escreverSenha("12345");
		cadastrarcliente.confirmarAsenha("12345");
		cadastrarcliente.escreverPrimeiroaNome("Juliana");
		cadastrarcliente.escreverSegundoNome("Silva");
		cadastrarcliente.escreverTelefone("987654321");
		cadastrarcliente.clicaPais();
		cadastrarcliente.escolhePais();
		cadastrarcliente.escreverEstado("SP");
		cadastrarcliente.escreverEndereço("Rua teste automaçao");
		cadastrarcliente.escreverCidade("Barueri");
		cadastrarcliente.escreverZip("654321");
		cadastrarcliente.registrarNome();

		String screenShotPath = Screenshot.capture(driver, "Cadastro Invalido");

		test.log(LogStatus.PASS, "Funcionou: " + test.addScreenCapture(screenShotPath));
	}

//metodo que chama a classe driver manager com o metodo fechar driver para finalizar a classe de testes.
	@After
	public void AcabouTest() throws Exception {

		DriverManager.fecharDriver();

	}
}
