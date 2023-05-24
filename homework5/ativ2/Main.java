package homework5.ativ2;

public class Main {
    public static void main(String[] args){
        
        Student student_1 = new Student("Danielly", 24, 8);
        Student student_2 = new Student("Eduardo", 22, 10);
        Student student_3 = new Student("Joaquim", 18, 4);

        ManageStudents students_list = new ManageStudents();

        students_list.insertBegin(student_1);
        students_list.insertBegin(student_2);
        students_list.insertBegin(student_3);
        
        
        System.out.println(students_list.sizeList());
        System.out.println("------- Lista de estudantes da frente para trás --------");
        System.out.println(students_list.toList());
    }
    
}
