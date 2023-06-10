package DecoratorSemDecorator;

public class Carro implements InterfaceCarro{

    private String cor;
    private String tipo;

    @Override
    public void construirCarroLuxo() {
        this.cor = "Amarelo";
        this.tipo = "de luxo";
    }
    @Override
    public void construirCarroBasico() {
        this.cor = "Branco";
        this.tipo = "basico";
    }
    @Override
    public void construirCarroEsporte() {
        this.cor = "Preto";
        this.tipo = "esporte";
    }

    public void getAll(){
        System.out.println("Minha cor é: "+cor+" e eu sou um carro "+tipo);
    }
    
}
