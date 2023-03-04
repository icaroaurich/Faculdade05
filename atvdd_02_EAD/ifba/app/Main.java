package ifba.app;

public class Main {

	public static void main(String[] args) {
		ConcrectCriadorDocumento criador = new ConcrectCriadorDocumento();
		Product tipo = new ConcrectProduticHTML();

		System.out.println(criador.gerarDocumentacao(tipo));
		
	}

}
