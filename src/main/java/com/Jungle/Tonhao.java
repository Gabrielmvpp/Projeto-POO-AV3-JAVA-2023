package main.java.com.Jungle;


public class Tonhao extends Funcionario {
    public Tonhao(String nome, double salario) {
    
        super(nome, salario);
    }

    @Override
    

    public void realizarTarefa() {
    
    
    }

    public void enviarDinheiro(double valor) {
        System.out.println(getNome() + " enviou R$" + valor + " para a empresa.");

    }


}
