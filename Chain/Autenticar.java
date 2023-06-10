package meu;

public class Autenticar implements InterfaceHandler {

    private InterfaceHandler test;

    public void handle(){
        System.out.println("Teste 01");
        if (test!= null){test.handle();}
    }
    public void setNext(InterfaceHandler next){
        this.test = next;
    }
}
