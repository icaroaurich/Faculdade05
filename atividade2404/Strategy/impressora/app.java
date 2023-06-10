package impressora;

public class app{
    public static void main(String[] args) {
        Produto produto = new Produto();

        ImpressoraElgin impressoraElgin = new ImpressoraElgin(produto);
            impressoraElgin.imprimir();
        ImpressoraArgox impressoraArgox = new ImpressoraArgox(produto);
            impressoraArgox.imprimir();
    }
}