package br.com.rsinet.hub.Appium.Utility;

public class MassaDeDadosExcel {

	public String userName() throws Exception {
		return ExcelUtils.getCellData(1, 0);
	}

	public String email() throws Exception {
		return ExcelUtils.getCellData(1, 1);
	}

	public String senha() throws Exception {
		return ExcelUtils.getCellData(1, 2);
	}

	public String confirmaSenha() throws Exception {
		return ExcelUtils.getCellData(1, 3);
	}

	public String primeiroNome() throws Exception {
		return ExcelUtils.getCellData(1, 4);

	}

	public String ultimoNome() throws Exception {
		return ExcelUtils.getCellData(1, 5);
	}

	public String telefone() throws Exception {
		return ExcelUtils.getCellData(1, 6);
	}

	public String Pais() throws Exception {
		return ExcelUtils.getCellData(1, 7);
	}

	public String Cidade() throws Exception {
		return ExcelUtils.getCellData(1, 8);

	}

	public String Endereco() throws Exception {
		return ExcelUtils.getCellData(1, 9);
	}

	public String Estado() throws Exception {
		return ExcelUtils.getCellData(1, 10);
	}

	public String Codigo() throws Exception {
		return ExcelUtils.getCellData(1, 11);
	}

}