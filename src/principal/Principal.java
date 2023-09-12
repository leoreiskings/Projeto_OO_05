package principal;

import controllers.PessoaController;

public class Principal {
	
	public static void main(String[] args) {
	
		try {
			
			PessoaController pessoaController = new PessoaController();
			
			pessoaController.executarExportacao();
			
			System.out.println("\nPessoa Gravado com Sucesso!");			
			
		} catch (Exception e) {
			System.out.println("\nErro: " + e.getMessage());
		}		
	}
}
