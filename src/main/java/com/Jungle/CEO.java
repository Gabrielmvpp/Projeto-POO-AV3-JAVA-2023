package main.java.com.Jungle;

public class CEO extends Funcionario {
    public CEO(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void realizarTarefa() {
        System.out.println("Realizado tarefas do CEO");
    }

    public void distribuirDinheiro(Funcionario funcionario, double valor) {
        System.out.println("Distribuindo R$" + valor + " para " + funcionario.getNome());
    }

}
