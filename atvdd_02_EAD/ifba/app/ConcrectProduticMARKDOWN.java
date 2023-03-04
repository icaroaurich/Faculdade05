package ifba.app;

import ifba.elementos.Cabecalho;
import ifba.elementos.Corpo;
import ifba.elementos.Rodape;
import ifba.elementos.markdown.CabecalhoMarkdown;
import ifba.elementos.markdown.CorpoMarkdown;
import ifba.elementos.markdown.RodapeMarkdown;

public class ConcrectProduticMARKDOWN implements Product{

    @Override
    public Cabecalho cabecalho() {
            return new CabecalhoMarkdown();}

    @Override
    public Corpo corpo() {
            return new CorpoMarkdown();
    }

    @Override
    public Rodape rodape() {
            return new RodapeMarkdown();
    }
    
}