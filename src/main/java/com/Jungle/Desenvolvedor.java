package main.java.com.Jungle;

import java.util.ArrayList;
import java.util.List;

public abstract class Desenvolvedor extends Funcionario implements ITarefa {
    private List<String> tarefas;

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
        this.tarefas = new ArrayList<>();
    }

    @Override
    public void adicionarTarefa(String tarefa) {
        tarefas.add(tarefa);
    }

    @Override
    public void listarTarefas() {
        System.out.println("Tarefas de " + getNome() + ":");
        for (String tarefa : tarefas) {
            System.out.println(tarefa);
        }
    }

    @Override
    public abstract void realizarTarefa();
}

