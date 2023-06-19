package homework11;

// Lista Duplamente encadeada
public class FilaLista implements InterfaceLista{
    private Noh begin;
    private Noh last;

    public FilaLista(){
        begin = null;
        last = null;
    }

    public boolean add(int content){
        Noh newNoh = new Noh(content);

        if(isEmpty()){
            begin = newNoh;
        }else{
            last.setNext(newNoh);
        }
        last = newNoh;
        return true;
    }

    public boolean isEmpty(){ 
        if(begin==null){
            return true;
        }
        return false;
    }

    public boolean remove(int content){
        if (!isEmpty()){
            if (begin == last) {
                begin = null;
                last = null;
            }else{
                begin = begin.getNext();
            }
            return true;
        }
        return false;

    }

    public int size() {
        int count = 0;
        Noh current = begin;

        while (current != null) {
            count++;
            current = current.getNext();
        }

        return count;
    }

    public void print() {
    if (isEmpty()) {
        System.out.println("A fila está vazia.");
        return;
    }

    Noh current = begin;

    System.out.print("Fila: ");
    while (current != null) {
        System.out.print(current.getContent() + " ");
        current = current.getNext();
    }
    System.out.println();
}

}
