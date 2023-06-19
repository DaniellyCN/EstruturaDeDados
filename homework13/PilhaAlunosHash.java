package homework13;

public class PilhaAlunosHash{
    private static final double FATOR_CARGA_MAXIMO = 0.90;
    private Student[] pilha_Students;
    private int tamanho;

    public PilhaAlunosHash() {
        this.pilha_Students = new Student[20];
        this.tamanho = 0;
    }

    private int hash(int chave) {
        return chave % this.pilha_Students.length;
    }

    private void redimensionar() {
        int novoTamanho = this.pilha_Students.length * 2;
        Student[] novoVetor = new Student[novoTamanho];

        for (int i = 0; i < this.pilha_Students.length; i++) {
            if (this.pilha_Students[i] != null) {
                int novaHash = hash(this.pilha_Students[i].getAge()) % novoTamanho;
                int proximaPosicaoLivre = encontrarProximaPosicaoLivre(novoVetor, novaHash);
                novoVetor[proximaPosicaoLivre] = this.pilha_Students[i];
            }
        }

        this.pilha_Students = novoVetor;
    }

    private int encontrarProximaPosicaoLivre(Student[] vetor, int hash) {
        int proximaPosicao = hash;

        while (vetor[proximaPosicao] != null) {
            proximaPosicao = (proximaPosicao + 1) % vetor.length;
        }

        return proximaPosicao;
    }

    public void push(Student Student) throws Exception {
        int hash = hash(Student.getAge());
        int posicao = encontrarProximaPosicaoLivre(this.pilha_Students, hash);

        this.pilha_Students[posicao] = Student;
        this.tamanho++;

        double fatorCarga = (double) this.tamanho / this.pilha_Students.length;
        if (fatorCarga >= FATOR_CARGA_MAXIMO) {
            redimensionar();
        }
    }

    public Student pop() {
        int posicao = tamanho - 1;

        while (posicao >= 0) {
            if (this.pilha_Students[posicao] != null) {
                Student StudentRemovido = this.pilha_Students[posicao];
                this.pilha_Students[posicao] = null;
                this.tamanho--;
                return StudentRemovido;
            }
            posicao--;
        }

        System.out.println("A pilha está vazia");
        return null;
    }

    public Student top() {
        int posicao = tamanho - 1;

        while (posicao >= 0) {
            if (this.pilha_Students[posicao] != null) {
                return this.pilha_Students[posicao];
            }
            posicao--;
        }

        System.out.println("A pilha está vazia");
        return null;
    }

    public void imprimirPilha() {
        if (isEmpty()) {
            System.out.println("A pilha está vazia");
            return;
        }
        System.out.println("Elementos da pilha:");
        for (int i = tamanho - 1; i >= 0; i--) {
            System.out.println(pilha_Students[i]);
        }
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public int size() {
        return tamanho;
    }
}
