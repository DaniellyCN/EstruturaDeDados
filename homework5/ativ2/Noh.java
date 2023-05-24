package homework5.ativ2;

public class Noh {
    private Object content;
    private Noh previous;
    private Noh next;

    public Noh(Object content){
        this.content = content;
        previous = null;
        next = null;
    }
    public Object getContent() {return content;}
    public Noh getNext() {return next;}
    public void setNext(Noh n) { this.next = n; }
    public Noh getPrevious() {return previous;}
    public void setPrevious(Noh n) { this.previous = n; }

}
