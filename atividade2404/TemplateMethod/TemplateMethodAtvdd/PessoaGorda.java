package TemplateMethodAtvdd;

public class PessoaGorda implements Dieta{

    @Override
    public void cafeDaManha() {
        System.out.println("Recomendação para café da manhã");
        System.out.println("    Nozes");
    }

    @Override
    public void almoco() {
        System.out.println("Recomendação para almoço");
        System.out.println("    Arroz integral");
    }

    @Override
    public void jantar() {
        System.out.println("Recomendação para jantar");
        System.out.println("    Nada");
    }
    
    public void getAll(){
        cafeDaManha();
        almoco();
        jantar();
    }
        
}
