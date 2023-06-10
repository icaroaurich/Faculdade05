package DecoratorSemDecorator;

public class App {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.construirCarroBasico();
            carro.getAll();
        carro.construirCarroLuxo();
            carro.getAll();
        carro.construirCarroEsporte();
            carro.getAll();
    }
}
