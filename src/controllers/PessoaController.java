package controllers;

import java.util.Scanner;

import abstractions.PessoaRepositoryAbstract;
import entities.Pessoa;
import repositories.PessoaRepositoryJSON;
import repositories.PessoaRepositoryXML;

public class PessoaController {

	// atributo
	private Scanner scanner;
	
	// método construtor
	public PessoaController() {
	
		// inicializando o atributo scanner
		scanner = new Scanner(System.in);
	
	} 
	
	public void executarExportacao() throws Exception {
		
		System.out.println("\nEXPORTAÇÃO DE DADOS DE PESSOA:\n");
		
		Pessoa pessoa = new Pessoa();
		
		System.out.print("Informe o ID da pessoa........: ");
		pessoa.setIdPessoa(Integer.parseInt(scanner.nextLine()));
		
		System.out.print("Informe o Nome da pessoa......: ");
		pessoa.setNome(scanner.nextLine());
		
		System.out.print("Informe o CPF da pessoa.......: ");
		pessoa.setCpf(scanner.nextLine());
		
		System.out.print("Escolha (1) para gerar Arquivo [XML] ou (2) para gerar Arquivo [JSON]: ");		
		
		
		Integer opcao = Integer.parseInt(scanner.nextLine());
		
		PessoaRepositoryAbstract repository = null;
		
		switch (opcao) {
		
		case 1:			
			repository = new PessoaRepositoryXML();
			break;

		case 2:			
			repository = new PessoaRepositoryJSON();
			break;		
		}
		
		repository.exportarDados(pessoa);		
	}
	
	
	
	
}
