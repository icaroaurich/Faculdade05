package builder;

public class ComputadorBuilder implements Builder{
    private Marca modelo;
    private Processador processador;
    private String usuario;

    @Override
    public void setMarca(Marca modelo) {
        this.modelo = modelo;
    }

    @Override
    public void setProcessador(Processador processador) {
        this.processador = processador;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Computador getComputador(){
        return new Computador(modelo,processador,usuario);
    }
    
}
