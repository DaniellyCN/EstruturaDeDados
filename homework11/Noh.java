package homework11;

public class Noh {
    private int content;
    private Noh previous;
    private Noh next;

    public Noh(int content){
        this.content = content;
        previous = null;
        next = null;
    }
    public int getContent() {return content;}
    public Noh getNext() {return next;}
    public void setNext(Noh n) { this.next = n; }
    public Noh getPrevious() {return previous;}
    public void setPrevious(Noh n) { this.previous = n; }

}
