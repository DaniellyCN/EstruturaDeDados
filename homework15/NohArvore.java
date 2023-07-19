package homework15;

public class NohArvore {
    
    private int valor;
    private NohArvore esquerda;
    private NohArvore direita;
    private NohArvore pai;

    public NohArvore(int valor) {
        this.valor = valor;
    }

    public int getConteudo() {return valor;}
    public void setConteudo(int valor) {this.valor = valor;}
    public NohArvore getEsquerda() {return esquerda;}
    public void setEsquerda(NohArvore n) { this.esquerda = n; }
    public NohArvore getDireita() {return direita;}
    public void setDireita(NohArvore n) { this.direita = n; }
    public NohArvore getPai() {return pai;}
    public void setPai(NohArvore n) { this.pai = n; }


}
