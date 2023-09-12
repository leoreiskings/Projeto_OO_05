package repositories;

import java.io.File;
import java.io.PrintWriter;
import java.util.HashMap;

import org.json.simple.JSONObject;

import abstractions.PessoaRepositoryAbstract;
import entities.Pessoa;

public class PessoaRepositoryJSON extends PessoaRepositoryAbstract{

	@Override
	public void exportarDados(Pessoa pessoa) throws Exception {
		 
		HashMap<String, Object> mapa = new HashMap<String, Object>();
		
		mapa.put("idpessoa", pessoa.getIdPessoa());
		mapa.put("nome", pessoa.getNome());
		mapa.put("cpf", pessoa.getCpf());
		
		JSONObject json = new JSONObject(mapa);
													   	
		PrintWriter printWriter = new PrintWriter(new File("D:\\saida de arquivos\\pessoa.json"));
		
		printWriter.write(json.toJSONString());
		printWriter.flush();
		printWriter.close();
		
		
		
		
		
		
		
		
	}

}
