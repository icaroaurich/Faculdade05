package meu;

public class Autorizar implements InterfaceHandler{

    private InterfaceHandler test;

    public void handle(){
        System.out.println("Teste 02");
        if (test!= null){test.handle();}
    }
    public void setNext(InterfaceHandler next){
        this.test = next;
    }
}
