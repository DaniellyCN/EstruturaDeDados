package homework3;

public class Main {
    public static void main(String[] args){

        /* POR QUE DA FORMA RETORNA ERRO SLIDE 10?
        IManageStudents test1 = new ManageStudents(2);
        IManageStudents test2 = new NotOptimized(2);
        */

        ManageStudents test1 = new ManageStudents(2);
        NotOptimized test2 = new NotOptimized(2);

        System.out.println("Teste 1 "+ test1.size());
        System.out.println("Teste 2 "+ test2.size());
    }
}
