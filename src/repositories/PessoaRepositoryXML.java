package repositories;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import abstractions.PessoaRepositoryAbstract;
import entities.Pessoa;

public class PessoaRepositoryXML extends PessoaRepositoryAbstract{

	@Override
	public void exportarDados(Pessoa pessoa) throws Exception {
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		
		DocumentBuilder builder = factory.newDocumentBuilder();
		
		Document document = builder.newDocument();
		
		Element root = document.createElement("PESSOA");
		document.appendChild(root);
		
		Element idPessoa = document.createElement("IDPESSOA");		
		idPessoa.setTextContent(pessoa.getIdPessoa().toString());		
		root.appendChild(idPessoa);
		
		Element nome = document.createElement("NOME");		
		nome.setTextContent(pessoa.getNome().toString());		
		root.appendChild(nome);
		
		Element cpf = document.createElement("CPF");		
		nome.setTextContent(pessoa.getCpf().toString());		
		root.appendChild(cpf);
		
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		
		Transformer transformer = transformerFactory.newTransformer();
		
		DOMSource source = new DOMSource(document);
		
		StreamResult stream = new StreamResult(new File("D:\\saida de arquivos\\pessoa.xml"));
		
		transformer.transform(source, stream);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
