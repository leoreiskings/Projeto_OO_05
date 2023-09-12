package abstractions;

import entities.Pessoa;

public abstract class PessoaRepositoryAbstract {

	public abstract void exportarDados(Pessoa pessoa)
	
			throws Exception;
	
}
