package br.com.rsinet.hub.Appium.TDD.teste;

import java.net.MalformedURLException;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import br.com.rsinet.hub.Appium.Manager.DriverManager;
import br.com.rsinet.hub.Appium.TDD.Page.BuscaLupa;

public class TestePesquisaLupa {
	
	private WebDriver driver;
	private BuscaLupa pesquisa;

	@BeforeMethod
	public void InicioDoTeste() throws MalformedURLException {
	driver = DriverManager.ConfiguraDriver();
	pesquisa = new BuscaLupa(driver);
	

}
	@Test
	public void TesteValidoPesquisa() {
		pesquisa.ClicarNalupa();
		pesquisa.ClicarCampoDePesquisa();
		pesquisa.ClicarNalupa();
		pesquisa.EscolherLaptop();
		
		
	}
	@Test
	public void  TesteInvalidoPesquisa() {
		pesquisa.ClicarNalupa();
		pesquisa.PesquisarCelular();
		pesquisa.ClicarNalupa();
		
}
	
	@AfterMethod
	public void FimTest() {
		DriverManager.fecharDriver();
}
}