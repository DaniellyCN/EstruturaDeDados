package homework4;
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

    public boolean remove(Object content){
        
    }

}
