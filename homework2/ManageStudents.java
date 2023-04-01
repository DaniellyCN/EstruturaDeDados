package homework2;

public class ManageStudents{
    private Student[] students;
    private int totalStudents = 0;

    public ManageStudents(int col){
        this.students = new Student[col];
    }

    /* return the size of students array. the real size*/
    public int sizeList(){
        return this.totalStudents;
    }

    /* Verify if exists a student in students array and return true if exists */
    public boolean haveStudent(Student student){
        for(int count = 0; count < this.totalStudents;count++){
            if(this.students[count].getName().equals(student.getName())){
                return true;
            }
        }
        return false;
    }

    /* add a new student in students array */
    public void addStudent(Student student){
        if(totalStudents == this.students.length){
            return;
        }
        this.students[totalStudents] = student;
        this.totalStudents++;
    }
}