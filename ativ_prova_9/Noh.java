package ativ_prova_9;

public class Noh {
    Noh next;
    Object content;

    public Noh(Object content){
        this.content = content;
        next = null;
    }

    public Object getContent(){return content;}
    public void setContent(Object content){this.content = content;}
    public Noh getNext(){return next;}
    public void setNext(Noh next){this.next = next;}
}
