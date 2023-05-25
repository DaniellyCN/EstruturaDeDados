package ativ_prova_9;
// Lista Simplesmente Encadeada
public class LSE implements ILista {
    private Noh first;
    private int totalElements;
    public LSE(){
        this.first = null;
        totalElements = 0;
    }

    public void insertFirst(Object content){
        Noh newNoh = new Noh(content);
        if(first==null){
            first = newNoh;
        }else{
            newNoh.setNext(first);
            first = newNoh;
        }
        totalElements++;
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
        totalElements++;

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
            totalElements --;
            return false;
        }else{
            previous.setNext(aux);
            totalElements --;
            return true;
        }
        
        
    }
    public int size(){
        return totalElements;
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

    public Object getElementByIndex(int index){
        if (index < 0 || index >= totalElements) {
            throw new IndexOutOfBoundsException("Índice inválido!");
        }
        
        Noh aux = first;
        int actualIndex = 0;
        
        while (actualIndex != index) {
            aux = aux.getNext();
            actualIndex++;
        }
        
        return aux.getContent();
    }

    public void setElementById(Object content, int index) {
        if (index < 0 || index >= totalElements) {
            throw new IndexOutOfBoundsException("Índice inválido!");
        }
    
        Noh aux = first;
        int actualIndex = 0;
    
        while (actualIndex != index) {
            aux = aux.getNext();
            actualIndex++;
        }
    
        aux.setContent(content);
    }

}
