package ativ_prova_1;

public class Main {
    public static void main(String[] args){
        Vector vector1 = new Vector(6);
        vector1.add(1);
        vector1.add(7);
        vector1.add(0);
        vector1.add(9);
        vector1.add(3);
        vector1.add(5);

        Vector vector2 = new Vector(6);
        vector2.add(6);
        vector2.add(7);
        vector2.add(0);
        vector2.add(2);
        vector2.add(3);
        vector2.add(11);
        
        
        try{
            ManageVector vector = new ManageVector(6);
            Vector intersection_vector = vector.findIntersection(vector1, vector2);
            System.out.println(intersection_vector.toString());

            
        }catch(Exception error){
            System.out.println("Ocorreu um erro: " + error.getMessage());
        }

    }

    
}
