package chequesemfundo;

import java.util.ArrayList;

public class Cliente {
    private int saldo = 1000;
    ArrayList<Integer> cheques = new ArrayList<Integer>();
    ArrayList<Observer> observerList = new ArrayList<Observer>();

    public Boolean setSaldo(int valor) {
        int saldoTemporario = saldo;
        saldoTemporario = saldoTemporario - valor;

        if(saldoTemporario < 0){
            System.out.println("Saldo insuficiente");
            return false;}
        else{this.saldo = saldo - valor;}
        return true;
    }
    public void addCheque(int numeroCheque, int valorCheque){
        if (setSaldo(valorCheque)){
            this.cheques.add(numeroCheque);}
        else{notificarObservadores();}
    }
    public void addObserver(String nome, String email){
        Observer observer  = new Observer(nome,email);
        observerList.add(observer);
    }
    public void notificarObservadores(){
        for (int i = 0; i < observerList.size(); i++) {
            observerList.get(i).notificarObserver();
        }
    }
}
