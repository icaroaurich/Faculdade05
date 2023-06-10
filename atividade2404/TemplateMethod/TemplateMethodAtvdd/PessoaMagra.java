package TemplateMethodAtvdd;

public class PessoaMagra implements Dieta{

    @Override
    public void cafeDaManha() {
        System.out.println("Recomendação para café da manhã");
        System.out.println("    Café");
    }

    @Override
    public void almoco() {
        System.out.println("Recomendação para almoço");
        System.out.println("    feijão");
    }

    @Override
    public void jantar() {
        System.out.println("Recomendação para jantar");
        System.out.println("    Batata");
    }

    public void getAll(){
        cafeDaManha();
        almoco();
        jantar();
    }
    
}
