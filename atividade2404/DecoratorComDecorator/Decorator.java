package DecoratorComDecorator;

public class Decorator {
    public void colocarAgua(Balde balde){
        balde.setConteudo("Agua");
    }
    public void colocarTerra(Balde balde){
        balde.setConteudo("Terra");
    }
    public void colocarGrama(Balde balde){
        balde.setConteudo("Grama");
    }
    public void colocarLava(Balde balde){
        balde.setConteudo("Lava");
    }
}
