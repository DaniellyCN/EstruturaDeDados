package homework15;

public class ABB {
    
    private NohArvore raiz;
    private long tempo_atual;

    public ABB(){
        raiz = null;
    }

    public ABB(NohArvore raiz) {
        this.raiz = raiz;
    }

    public boolean vazio() {
        if (raiz == null){
            return true;
        }
        return false;
    }

    public void adiciona(int elemento) {
        if (vazio()){
            this.raiz = new NohArvore(elemento);
        }else {
            NohArvore auxiliar = this.raiz;
            while (auxiliar != null) {
                if (elemento < auxiliar.getConteudo()) {
                    if (auxiliar.getEsquerda() == null) {
                        NohArvore newNoh = new NohArvore(elemento);
                        auxiliar.setEsquerda(newNoh);
                        newNoh.setPai(auxiliar);
                        return;
                    }
                    auxiliar = auxiliar.getEsquerda();
                } else {
                    if (auxiliar.getDireita() == null) {
                        NohArvore newNoh = new NohArvore(elemento);
                        auxiliar.setDireita(newNoh);
                        newNoh.setPai(auxiliar); 
                        return;
                    }
                    auxiliar = auxiliar.getDireita();
                } 
            }
        } 
    } 

    // método recursivo
    public void adicionarRecursivo(int elemento) {
        if (vazio()){
            this.raiz = new NohArvore(elemento);
        } else {
            adicionarRecursivo(this.raiz, elemento);
        }
    }

    private void adicionarRecursivo(NohArvore node, int elemento) {
        if (elemento < node.getConteudo()) {
            if (node.getEsquerda() == null) {
                NohArvore novoNode = new NohArvore(elemento);
                node.setEsquerda(novoNode);
                novoNode.setPai(node);
                return;
            }
            adicionarRecursivo(node.getEsquerda(), elemento);
        
        } else {
            if (node.getDireita() == null) {
                NohArvore novoNode = new NohArvore(elemento);
                node.setDireita(novoNode);
                novoNode.setPai(node);
                return;
            }
            adicionarRecursivo(node.getDireita(), elemento);
        }
    }


    public boolean contem(int elemento) {
        if (vazio()) {
            return false;
        }
        NohArvore auxiliar = raiz;
        while (auxiliar != null) {
            if (auxiliar.getConteudo() == elemento) {
                return true;
            } else if (elemento < auxiliar.getConteudo()) {
                auxiliar = auxiliar.getEsquerda();
            } else {
                auxiliar = auxiliar.getDireita();
            }
        }
        return false;
    }

    public double getTempoAtual() {
        return tempo_atual;
    }



    public void imprimirArvore() {
        imprimirArvoreRecursivo(raiz);
    }

    private void imprimirArvoreRecursivo(NohArvore noh) {
        if (noh != null) {
            imprimirArvoreRecursivo(noh.getEsquerda());
            System.out.println(noh.getConteudo()); 
            imprimirArvoreRecursivo(noh.getDireita());
        }
    }


     public void imprimirEmOrdem() {
          long startTime = System.nanoTime();

        imprimirEmOrdemRecursivo(raiz);

        long endTime = System.nanoTime();
        tempo_atual = endTime - startTime;
    }

    private void imprimirEmOrdemRecursivo(NohArvore noh) {
        if (noh != null) {
            imprimirEmOrdemRecursivo(noh.getEsquerda());
            System.out.println(noh.getConteudo()); 
            imprimirEmOrdemRecursivo(noh.getDireita());
        }
    }


    public void remover(int elemento) {
        raiz = removerRecursivo(raiz, elemento);
    }
    
    private NohArvore removerRecursivo(NohArvore noh, int elemento) {
        if (noh == null) {
            return null;
        }
    
        if (elemento < noh.getConteudo()) {
            noh.setEsquerda(removerRecursivo(noh.getEsquerda(), elemento));
        } else if (elemento > noh.getConteudo()) {
            noh.setDireita(removerRecursivo(noh.getDireita(), elemento));
        } else {
            //Caso 1:O nó a ser removido é uma folha
            if (noh.getEsquerda() == null && noh.getDireita() == null) {
                if (noh == raiz) {
                    raiz = null; // Nó a ser removido é a raiz
                } else {
                    NohArvore pai = noh.getPai();
                    if (pai.getEsquerda() == noh) {
                        pai.setEsquerda(null);
                    } else {
                        pai.setDireita(null);
                    }
                }
            }
            //Caso 2:O nó a ser removido tem apenas um filho
            else if (noh.getEsquerda() == null) {
                if (noh == raiz) {
                    raiz = noh.getDireita(); // Nó a ser removido é a raiz
                    raiz.setPai(null);
                } else {
                    NohArvore pai = noh.getPai();
                    if (pai.getEsquerda() == noh) {
                        pai.setEsquerda(noh.getDireita());
                    } else {
                        pai.setDireita(noh.getDireita());
                    }
                    noh.getDireita().setPai(pai);
                }
            } else if (noh.getDireita() == null) {
                if (noh == raiz) {
                    raiz = noh.getEsquerda(); // Nó a ser removido é a raiz
                    raiz.setPai(null);
                } else {
                    NohArvore pai = noh.getPai();
                    if (pai.getEsquerda() == noh) {
                        pai.setEsquerda(noh.getEsquerda());
                    } else {
                        pai.setDireita(noh.getEsquerda());
                    }
                    noh.getEsquerda().setPai(pai);
                }
            }
            //Caso 3:O nó a ser removido tem dois filhos
            else {
                NohArvore sucessor = encontrarMenor(noh.getDireita());
                noh.setConteudo(sucessor.getConteudo());
                noh.setDireita(removerRecursivo(noh.getDireita(), sucessor.getConteudo()));
            }
        }
    
        return noh;
    }
    
    private NohArvore encontrarMenor(NohArvore noh) {
        while (noh.getEsquerda() != null) {
            noh = noh.getEsquerda();
        }
        return noh;
    }
    
    
}
