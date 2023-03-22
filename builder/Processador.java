package builder;

public class Processador{
    private String tipoProcessador;

    public Processador(String tipo){
        this.tipoProcessador =  tipo;
    }
    
    public String getTipoProcessador() {
        return tipoProcessador;
    }

    public void trabalhar(){
        System.out.println("Meu processador é o "+tipoProcessador);
        System.out.println("Trabalhando...");
    }
}