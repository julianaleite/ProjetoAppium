package br.com.rsinet.hub.Appium.TDD.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProdutoTelaPrincipal {
	private WebDriver driver;

	public ProdutoTelaPrincipal(WebDriver driver) {
		this.driver = driver;
	}

	public void ClicarTablet() {
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[3]/android.widget.ImageView")).click();

	}

	public void EscolherTablet() {
		driver.findElement(By.xpath("//android.widget.RelativeLayout[@content-desc=\"Tablets\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[1]/android.widget.ImageView")).click();
	}
public void ClicarMaisTablet() {
	driver.findElement(By.id("com.Advantage.aShopping:id/textViewProductQuantity")).click();
}
public void MaisQuantidadeDeTablet(WebDriver driver) {
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.ImageView[2]")).click();
}
public void aplicar() {
	driver.findElement(By.id("com.Advantage.aShopping:id/textViewApply")).click();
	
}
public void addCarrinho() {
	driver.findElement(By.id("com.Advantage.aShopping:id/buttonProductAddToCart")).click();
}

}
