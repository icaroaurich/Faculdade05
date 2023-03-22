package builder;

public class NotebookBuilder implements Builder{
    private Marca modelo;
    private Processador processador;
    private String usuario;
    private int bateria;

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
    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public Notebook getNotebook(){
        return new Notebook(modelo,processador,usuario,bateria);
    }
    
}
