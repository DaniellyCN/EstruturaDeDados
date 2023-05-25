package ativ_prova_5;
// Lista Duplamente encadeada
public class Lista implements InterfaceLista{
    private Noh begin;
    private Noh last;
    private int totalElements = 0;

    public Lista(){
        begin = null;
        last = null;
    }

    public void insertBegin(int content){
        //como quero inserir um conteudo na lista e a lista é composta de nohs, logo crio um noh e adiciono 
        //esse conteudo nele e dai manipula o noh criado com os metodos dessa classe, lista
        Noh newNoh = new Noh(content);
        //se não tiver item na lista, o noh é inserido com o inicio e fim apontam para esse noh
        if(begin==null){
            begin = newNoh;
            last = newNoh;
        }else{
            newNoh.setNext(begin);
            begin.setPrevious(newNoh);
            begin = newNoh;
        }
        totalElements ++;
    }

    public void insertLast(int content){
        Noh newNoh = new Noh(content);

        if(last==null){
            begin = newNoh;
            last = newNoh;
        }else{
            last.setNext(newNoh);
            newNoh.setPrevious(last);
            last = newNoh;
        }
        totalElements ++;
    }

    public boolean isEmpty(){
        // a comparação com null poderia ser feita com o last ou begin 
        if(begin==null){
            return true;
        }
        return false;
    }

    public boolean remove(int content){
        Noh aux = begin;
        // estou usando um auxiliar e nao o proprio begin pq dentro do while eu mudo o valor de begin e não é isso que quero
        // pq, por exemplo, se eu for utilizar outro método dessa classe, o valor real de begin vai estar errado já que havia
        //sido alterado nesse método. Por isso, use uma variavel auxiliar
        while(aux != null && aux.getContent() != content){
            aux = aux.getNext();
        }
        //aqui no while achei o noh que contem a informaçao procurada, agora posso comparar ele para ver em qual posição está.
        if(aux==null){
            return false; // caso nao tenha achado o noh que tenha a info desejada, content
        }
        if(aux==begin){
            begin = aux.getNext();
            if(begin != null){ // havia pelo menos 2 nohs na lista
                begin.setPrevious(null);// o primeiro da lista sempre aponta para o noh anterior para null, já que nao tem
            }else{
                last = null; // daí havia apenas 1 noh na lista e por isso o novo begin é null e portanto o fim também deve ser
            }
        }else if(aux==last){// é o ultimo
            aux.getPrevious().setNext(null);
            last = aux.getPrevious();
        }else{
            aux.getNext().setPrevious(aux.getPrevious());
            aux.getPrevious().setNext(aux.getNext());
        }
        totalElements --;
        return true;
    }

    public int sizeList(){
        return totalElements;
    }

    public Object getElementByIndex(int index){
        if (index < 0 || index >= totalElements) {
            throw new IndexOutOfBoundsException("Índice inválido!");
        }
        
        Noh aux = begin;
        int actualIndex = 0;
        
        while (actualIndex != index) {
            aux = aux.getNext();
            actualIndex++;
        }
        
        return aux.getContent();
    }
    
    //countEvenNumbers
    public int nroPares() {
        Noh aux = begin;
        int count = 0;
    
        while (aux != null) {
            if (aux.getContent() % 2 == 0) {
                count++;
            }
            aux = aux.getNext();
        }
    
        return count;
    }

}
