package homework12;

public class MapaHashVetor {
    private static final double FATOR_CARGA_MAXIMO = 0.90;
    private Student[] vetor;
    private int tamanho;

    public MapaHashVetor() {
        this.vetor = new Student[20];
        this.tamanho = 0;
    }

    private int hash(int chave) {
        return chave % this.vetor.length;
    }

    private void redimensionar() {
        int novoTamanho = this.vetor.length * 2;
        Student[] novoVetor = new Student[novoTamanho];

        for (int i = 0; i < this.vetor.length; i++) {
            if (this.vetor[i] != null) {
                int novaHash = hash(this.vetor[i].getAge()) % novoTamanho;
                int proximaPosicaoLivre = encontrarProximaPosicaoLivre(novoVetor, novaHash);
                novoVetor[proximaPosicaoLivre] = this.vetor[i];
            }
        }

        this.vetor = novoVetor;
    }

    private int encontrarProximaPosicaoLivre(Student[] vetor, int hash) {
        int proximaPosicao = hash;

        while (vetor[proximaPosicao] != null) {
            proximaPosicao = (proximaPosicao + 1) % vetor.length;
        }

        return proximaPosicao;
    }

    public Student get(int chave) {
        int hash = hash(chave);
        return this.vetor[hash];
    }

    public void put(int chave, Student valor) {
        int hash = hash(chave);
        int posicao = encontrarProximaPosicaoLivre(this.vetor, hash);

        this.vetor[posicao] = valor;
        this.tamanho++;

        double fatorCarga = (double) this.tamanho / this.vetor.length;
        if (fatorCarga >= FATOR_CARGA_MAXIMO) {
            redimensionar();
        }
    }

    public Student remove(int chave) {
        int hash = hash(chave);
        int posicao = hash;

        while (this.vetor[posicao] != null) {
            if (this.vetor[posicao].getAge() == chave) {
                Student studentRemovido = this.vetor[posicao];
                this.vetor[posicao] = null;
                this.tamanho--;
                return studentRemovido;
            }
            posicao = (posicao + 1) % this.vetor.length;
        }

        return null;
    }
}
