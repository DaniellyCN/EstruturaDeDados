package homework5.ativ2;

public class ManageStudents extends Lista{
    private Lista students;

    
    public ManageStudents() {
        students = new Lista();
    }


    public String toList() {
        String list = "";
        for(int i = 0; i < students.sizeList(); i++){
            Object obj  = students.getElementByIndex(i);
            if(obj instanceof Student){
                Student student = (Student) obj;
                list+= student.toString();
            }
        }
        return list;
    }

}