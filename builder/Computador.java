package builder;

public class Computador{
    private Marca marca;
    private Processador processador;
    private String usuario;

    public Computador(Marca marca, Processador processador, String usuario){
        this.marca = marca;
        this.processador = processador;
        this.usuario = usuario;

    }

    public Marca getMarca() {
        return marca;
    }
    public Processador getProcessador() {
        return processador;
    }
    public String getProcessadorTipo() {
        return processador.getTipoProcessador();
    }
    public String getUsuario() {
        return usuario;
    }

    public void getAll(){
        System.out.println("Usuário: "+getUsuario());
        System.out.println("Processador: "+getProcessadorTipo());
        System.out.println("Marca: "+getMarca());
    }
    
}
