package homework12;

public class Main {
    public static void main(String[] args) {
        MapaHashVetor mapa = new MapaHashVetor();

        // Criando alguns alunos
        Student student1 = new Student("João", 20, 7.5f);
        Student student2 = new Student("Maria", 19, 8.0f);
        Student student3 = new Student("Pedro", 21, 6.8f);

        // Inserindo alunos no mapa
        mapa.put(student1.getAge(), student1);
        mapa.put(student2.getAge(), student2);
        mapa.put(student3.getAge(), student3);

        // Obtendo alunos do mapa
        System.out.println(mapa.get(student1.getAge())); 
        System.out.println(mapa.get(student2.getAge())); 
        System.out.println(mapa.get(student3.getAge())); 

        // Removendo um aluno do mapa
        Student studentRemovido = mapa.remove(student2.getAge());
        System.out.println(studentRemovido); 
        System.out.println(mapa.get(student2.getAge())); 
    }
}
