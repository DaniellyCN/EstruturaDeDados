package homework2;

public class Main {
    public static void main(String[] args){
        
        Student firstStudent = new Student("Gabriel", 22, 7.5f);
        ManageStudents list = new ManageStudents(5);
        list.addStudent(firstStudent);
        System.out.println("Tamanho da lista de estudantes: " + list.sizeList());
        System.out.println("O estudante " + firstStudent.getName() +" está na lista? "+ list.haveStudent(firstStudent) );


        Student secondStudent = new Student("Nathalia", 21, 10f);
        list.addStudent(secondStudent);
        System.out.println("Tamanho da lista de estudantes: " + list.sizeList());
        System.out.println("O estudante " + secondStudent.getName() +" está na lista? "+ list.haveStudent(secondStudent) );
    }
}
