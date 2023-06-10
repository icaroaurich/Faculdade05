package impressora;

public class ImpressoraElgin implements InterfaceImprimir{

    private String obj;

    public ImpressoraElgin(Produto produto){
        this.obj = "A0080,80,0,3,1,1,N,"+produto.getNome();
    }
    @Override
    public void imprimir() {
        System.out.println(obj);
    }
    
}
