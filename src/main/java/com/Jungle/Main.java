// src/main/java/com/jungle/Main.java
package main.java.com.Jungle;

public class Main {
    public static void main(String[] args) {
        CEO ceo = new CEO("Alice", 50000);
        DesenvolvedorJunior devJunior = new DesenvolvedorJunior("Sergio", 30000);
        DesenvolvedorJunior devJunior2 = new DesenvolvedorJunior("Marinex", 50000);

        Secretaria secretaria = new Secretaria("Isis", 25000);
        Tonhao tonhao = new Tonhao("Frank", 100000);

        tonhao.enviarDinheiro(20000);
        ceo.distribuirDinheiro(devJunior, 5000);
        ceo.distribuirDinheiro(devJunior2, 15000);
        devJunior.adicionarTarefa("Corrigir bug que sarlim pediu");
        devJunior.listarTarefas();
        


      
    }
}