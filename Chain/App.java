package meu;

public class App{
    public static void main(String[] args) {
        InterfaceHandler a1 = new Autenticar();
        InterfaceHandler a2 = (InterfaceHandler) new Autorizar();

        a1.setNext(a2);
        a1.handle();
    }
}
