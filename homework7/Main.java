package homework7;

import java.util.Random;

//------------------RECURSão-------------------
public class Main {
    public static void main(String[] args) throws Exception {
        
        ManageVector vector = new ManageVector(7);
      
        Random k = new Random();

        //for (int i = 0; i < 10; i++) {
        //    int intNumber = k.nextInt();
        //    vector.add(intNumber);
        //}
        
        //Testando o método recursive_binary_search
        int[] list = {12,5,9,11,8,1,4};
        vector.setList(list);
        
        System.out.println("terceiro elemento: " + list[2]);
        int target = vector.recursive_binary_search(11,1,vector.size() - 1);
        System.out.println("recursive_binary_search: " + target);
        //System.out.println("Tempo de execução (Iterativo): " + vetor.getCurrentTime() );
        
       
    }
}
