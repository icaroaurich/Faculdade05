package ifba.app;

import java.util.Date;

import ifba.elementos.Cabecalho;
import ifba.elementos.Corpo;
import ifba.elementos.Rodape;

public class ConcrectCriadorDocumento implements InterfaceCriadorDocumento{
	
	public String gerarDocumentacao(Product documento) {
		Cabecalho cabecalho = documento.cabecalho();
		Corpo corpo = documento.corpo();
		Rodape rodape = documento.rodape();
		
		cabecalho.setTitulo("Padroes de projeto");
		cabecalho.setEmpresa("Insituto Federal da Bahia");
		
		corpo.setTexto("Aula de padroes de projeto.");
		
		rodape.setData(new Date());
		
		return cabecalho.getOutput() + corpo.getOutput() + rodape.getOutput();
	}
}
