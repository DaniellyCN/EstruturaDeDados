package ativ_prova_7;
// Lista Simplesmente Encadeada
public class LSE implements ILista {
    private Noh first;
    public LSE(){
        this.first = null;
    }

    public void insertFirst(Object content){
        Noh newNoh = new Noh(content);
        if(first==null){
            first = newNoh;
        }else{
            newNoh.setNext(first);
            first = newNoh;
        }
    }

    public void insertLast(Object content){
        Noh newNoh = new Noh(content);
        if(first==null){
            first = newNoh;
        }else{
            Noh last = null;
            for(Noh i = newNoh; i != null; i=i.getNext()){
                last = i;
            }
            last.setNext(newNoh);
        }

    }

    public boolean isEmpty(){
        if(first == null){
            return true;
        }
        return false;
    }
// ver método
    public boolean remove(Object content){
        Noh aux = first;
        Noh previous = new Noh(content);

        while(aux != null && aux.getContent() != content){
            previous = aux;
            aux = aux.getNext();
        }
        if(aux == null){
            return false;
        }else{
            previous.setNext(aux);
            return true;
        }
        
    }
    public int size(){
        int cont = 0;
        Noh aux = first;
        if(first==null){
            return 0;
        }
        while(aux!=null){
            aux = aux.getNext();
            cont+=1;
        }
        return cont;
    }

    public void imprimeRec() {
        printRecursiveHelper(first);
    }
    
    private void printRecursiveHelper(Noh current) {
        if (current == null) {
            return;
        }
        
        System.out.println(current.getContent());
        printRecursiveHelper(current.getNext());
    }

}
