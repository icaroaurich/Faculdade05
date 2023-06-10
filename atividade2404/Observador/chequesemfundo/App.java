package chequesemfundo;

public class App{
    public static void main(String[] args) {
        Cliente icaro = new Cliente();
        icaro.addObserver("Icaro", "icaroaurich@hotmail.com");
        icaro.addObserver("Teste", "teste@hotmail.com");
        icaro.addCheque(1,1001);
        
    }
    
}