package builder;
public class App {
    public static void main(String[] args) {
        Director director = new Director();

        ComputadorBuilder builderComputador = new ComputadorBuilder();
        NotebookBuilder builderNotebook = new NotebookBuilder();

        director.constructComputador(builderComputador,"Icaro");
        director.constructNotebook(builderNotebook,"Teste",97);

        Computador computador = builderComputador.getComputador();
        Notebook notebook = builderNotebook.getNotebook();

        //computador.getAll();
        //notebook.getAll();
        computador.getProcessador().trabalhar();
    }
}