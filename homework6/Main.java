package homework6;

import java.util.Random;

//------------------RECURSão-------------------
public class Main {
    public static void main(String[] args) {
        
        ManageVector vetor = new ManageVector(1000);
      
        Random k = new Random();

        for (int i = 0; i < 1000; i++) {
            int intNumber = k.nextInt();
            vetor.add(intNumber);
        }
        
        //Testando o método findMaxIterative()
        int maxIterative = vetor.findMaxIterative();
        System.out.println("Máximo (Iterativo): " + maxIterative);
        System.out.println("Tempo de execução (Iterativo): " + vetor.getCurrentTime() );
        
        //Testando o método findMaxRecursive()
        int maxRecursive = vetor.findMaxRecursive(vetor.getList());
        System.out.println("Máximo (Recursivo): " + maxRecursive);
        System.out.println("Tempo de execução (Recursivo): " + vetor.getCurrentTime() );
    }
}
