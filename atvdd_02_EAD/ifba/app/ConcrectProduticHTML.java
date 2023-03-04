package ifba.app;

import ifba.elementos.Cabecalho;
import ifba.elementos.Corpo;
import ifba.elementos.Rodape;
import ifba.elementos.html.CabecalhoHTML;
import ifba.elementos.html.CorpoHTML;
import ifba.elementos.html.RodapeHTML;

public class ConcrectProduticHTML implements Product{

    @Override
    public Cabecalho cabecalho() {
            return new CabecalhoHTML();}

    @Override
    public Corpo corpo() {
            return new CorpoHTML();
    }

    @Override
    public Rodape rodape() {
            return new RodapeHTML();
    }
    
}