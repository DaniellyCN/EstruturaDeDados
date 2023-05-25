package ativ_prova_7;

public class Main {
    public static void main(String[] args){
        LSE lista = new LSE();
        lista.insertFirst(12);
        lista.insertFirst(144);
        lista.insertFirst(9);
        lista.insertFirst(239);
        lista.insertFirst(61);
        
        lista.imprimeRec();
    }
}
