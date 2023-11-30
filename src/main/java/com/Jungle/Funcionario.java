// src/main/java/com/jungle/Funcionario.java
package main.java.com.Jungle;

public abstract class Funcionario {
    private String nome;
    private double salario;
    private String[] tarefas;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract void realizarTarefa();
}
