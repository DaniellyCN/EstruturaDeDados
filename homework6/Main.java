package homework6;

import java.util.Random;

//------------------RECURSão-------------------
public class Main {
    public static void main(String[] args) {
        int[] vetor = {1, 5, 7, 2, 9, 4, 6, 3, 8};
        ManageVector manage = new ManageVector(vetor.length);
        
        //Adicionando os elementos ao objeto manage
        for (int i = 0; i < vetor.length; i++) {
            manage.add(vetor[i]);
        }
        
        //Testando o método findMaxIterative()
        int maxIterative = manage.findMaxIterative();
        System.out.println("Máximo (Iterativo): " + maxIterative);
        System.out.println("Tempo de execução (Iterativo): " + manage.getCurrentTime() + " segundos");
        
        //Testando o método findMaxRecursive()
        int maxRecursive = manage.findMaxRecursive(manage.getList());
        System.out.println("Máximo (Recursivo): " + maxRecursive);
        System.out.println("Tempo de execução (Recursivo): " + manage.getCurrentTime() + " segundos");
    }
}
