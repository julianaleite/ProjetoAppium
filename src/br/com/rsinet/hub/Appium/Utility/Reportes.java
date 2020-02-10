package br.com.rsinet.hub.Appium.Utility;

import com.relevantcodes.extentreports.ExtentReports;

import com.relevantcodes.extentreports.ExtentTest;

// classe nescessaria para efetuar os reportes
public class Reportes {

	private static ExtentReports extent;
	private static ExtentTest test;

	public static void iniciaReport() {
		extent = new ExtentReports(System.getProperty("user.dir") + "/ExtentScreenshot.html", true);
	}
// Metodo para finalizar o reportes
	public static void fechaReport() {
		extent.flush();
	}

	public static ExtentTest getTest() {
		return test;
	}

	public static ExtentReports getExtent() {
		return extent;
	}
}