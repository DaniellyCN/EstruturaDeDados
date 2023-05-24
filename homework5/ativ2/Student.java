package homework5.ativ2;

public class Student{
    private String name;
    private int age;
    private float grades;

    public Student(String name, int age, float grades){
        this.name = name;
        this.age = age;
        this.grades = grades;
    }

    public Student(){
        name = this.getName();
        age = this.getAge();
        grades = this.getGrades();
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public float getGrades(){
        return grades;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setGrades(float grades){
        this.grades = grades;
    }

    public String toString(){
        return "Nome: " + getName() + " Idade: " + getAge() + " Nota:" + getGrades() + "\n";
    }
}
