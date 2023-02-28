package atvdd_01;

public class Fabrica implements Aplicacao {
    
    Aluno aluno;
    
    @Override
    public Aluno criaAluno(){
        aluno = new AlunoNovo();
        return aluno;
    }
    
    public void novoAluno(){
      this.criaAluno();
      System.out.println("Aluno criado!");
    }
    
}