package impressora;

public class ImpressoraArgox implements InterfaceImprimir{

    private String obj;

    public ImpressoraArgox(Produto produto){
        this.obj = "131100000800080"+produto.getNome();
    }
    @Override
    public void imprimir() {
        System.out.println(obj);
    }
    
}
