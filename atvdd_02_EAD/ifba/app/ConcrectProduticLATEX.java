package ifba.app;

import ifba.elementos.Cabecalho;
import ifba.elementos.Corpo;
import ifba.elementos.Rodape;
import ifba.elementos.latex.CabecalhoLATEX;
import ifba.elementos.latex.CorpoLATEX;
import ifba.elementos.latex.RodapeLATEX;

public class ConcrectProduticLATEX implements Product{

    @Override
    public Cabecalho cabecalho() {
            return new CabecalhoLATEX();}

    @Override
    public Corpo corpo() {
            return new CorpoLATEX();
    }

    @Override
    public Rodape rodape() {
            return new RodapeLATEX();
    }
    
}