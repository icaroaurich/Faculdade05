package builder;

public class Director {
    public void constructComputador(ComputadorBuilder builder, String nome){
        builder.setMarca(Marca.DELL);
        builder.setProcessador(new Processador("Ryzen"));
        builder.setUsuario(nome);
    }

    public void constructNotebook(NotebookBuilder builder,String nome, int bateria){
        builder.setMarca(Marca.SAMSUNG);
        builder.setProcessador(new Processador("Intel"));
        builder.setBateria(bateria);
        builder.setUsuario(nome);
    }
}
