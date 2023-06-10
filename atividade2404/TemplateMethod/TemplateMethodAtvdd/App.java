package TemplateMethodAtvdd;

public class App{
    public static void main(String[] args) {
        Dieta dieta1 = new PessoaGorda();
            dieta1.getAll();
        Dieta dieta2 = new PessoaMagra();
            dieta2.getAll();
    }
}