package chequesemfundo;

public class Observer {
    private String nome;
    private String email;

    public Observer(String nome,String email){
        this.nome = nome;
        this.email = email;
    }
    public void notificarObserver(){
        System.out.println(nome+" foi notificado atravéz do email "+email+ " que o saldo da conta não é suficiente");
    }
}
