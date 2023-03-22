package builder;

public class Notebook{
    private Marca marca;
    private Processador processador;
    private String usuario;
    private int bateria;

    public Notebook(Marca marca, Processador processador, String usuario, int bateria){
        this.marca = marca;
        this.processador = processador;
        this.usuario = usuario;
        this.bateria = bateria;

    }


    public Marca getMarca() {
        return marca;
    }
    public String getProcessadorTipo() {
        return processador.getTipoProcessador();
    }
    public Processador getProcessador() {
        return processador;
    }
    public String getUsuario() {
        return usuario;
    }
    public int getBateria() {
        return bateria;
    }

    public void getAll(){
        System.out.println("Usuário: "+getUsuario());
        System.out.println("Processador: "+getProcessadorTipo());
        System.out.println("Marca: "+getMarca());
        System.out.println("Bateria: "+getBateria());
    }
    
}
