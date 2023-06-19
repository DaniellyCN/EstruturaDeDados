package homework13;

public class Main {
    public static void main(String[] args) {
        try {
            PilhaAlunosHash pilha = new PilhaAlunosHash();

            Student aluno1 = new Student("João", 20, 8.5f);
            Student aluno2 = new Student("Maria", 19, 9.0f);
            Student aluno3 = new Student("Pedro", 21, 7.8f);

            pilha.push(aluno1);
            pilha.push(aluno2);
            pilha.push(aluno3);

            System.out.println("Tamanho da pilha: " + pilha.size());

            System.out.println("Elemento no topo da pilha: " + pilha.top());

            System.out.println("Removendo o topo da pilha: " + pilha.pop());

            System.out.println("Tamanho da pilha após remoção: " + pilha.size());

            System.out.println("Elemento no topo da pilha após remoção: " + pilha.top());

            pilha.imprimirPilha();
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

