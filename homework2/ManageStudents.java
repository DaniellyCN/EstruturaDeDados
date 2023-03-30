package homework2;
import java.util.ArrayList;

public class ManageStudents{
    private ArrayList<Student> students;
    private int totalStudents = 0;

    public ManageStudents(){
        this.students = new ArrayList<Student>();
    }

    /* return the size of students array */
    public int sizeList(){
        return this.totalStudents;
    }

    /* Verify if exists a student in students array and return true if exists */
    public boolean haveStudent(Student student){
        for(int count = 0; count < this.students.size();count++){
            if(this.students.get(count).getName().equals(student.getName())){
                return true;
            }
        }
        return false;
    }

    /* add a new student in students array */
    public void addStudent(Student student){
        this.students.add(student);
        this.totalStudents++;
    }
}