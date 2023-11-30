package main.java.com.Jungle;



public class DesenvolvedorJunior extends Desenvolvedor {
    public DesenvolvedorJunior(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void realizarTarefa() {
        System.out.println(getNome() + " está realizando uma tarefa de nível Junior.");
    }
    

}

