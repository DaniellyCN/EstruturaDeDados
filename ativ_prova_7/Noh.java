package ativ_prova_7;

public class Noh {
    Noh next;
    Object content;

    public Noh(Object content){
        this.content = content;
        next = null;
    }

    public Object getContent(){return content;}
    public Noh getNext(){return next;}
    public void setNext(Noh next){this.next = next;}
}
