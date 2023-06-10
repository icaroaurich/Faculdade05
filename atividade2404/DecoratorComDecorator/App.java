package DecoratorComDecorator;

public class App {
    public static void main(String[] args) {
        Decorator decorator = new Decorator();
        Balde balde = new Balde();

        decorator.colocarAgua(balde);
        decorator.colocarTerra(balde);
    }
}
