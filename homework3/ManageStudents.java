package homework3;

public class ManageStudents implements IManageStudents{
    private Student[] students;
    private int totalStudents = 0;

    public ManageStudents(int col){
        this.students = new Student[col];
    }

    /* return the size of students array. the real size*/
    public int size(){
        return this.totalStudents;
    }

  

    /* Verify if exists a student in students array and return true if exists */
    public boolean have(Object student){
        for(int count = 0; count < this.totalStudents;count++){
            if(student instanceof Student){
                if(this.students[count].getName().equals(((Student)student).getName())){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean full(){
        if(totalStudents == this.students.length){
            return true;
        }
        return false;
    }

    /* add a new student in students array */
    public void add(Object student){
        this.secureSpace();
        this.students[totalStudents] = (Student) student;
        this.totalStudents++;
    }

    public void secureSpace(){
        if(this.full()){
            Student[] newStudents = new Student[students.length *2];
            for(int i = 0; i < students.length; i++)
                newStudents[i] = students[i];
            students = newStudents;
        }
    }

    public boolean remove(Object student){
        int count = -1;
        for(int i = 0; i < totalStudents; i++) 
            if (((Student)student).getName().equals(students[i].getName())){
                count = i; break;
            }
        if (count != -1){ //found out element
            for(int i = count; i < (totalStudents-1); i++)
                students[i] = students[i+1];
            totalStudents--;
            return true;
        }
        return false;
    }


}