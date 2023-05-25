package ativ_prova_5;

public class Main {
    public static void main(String[] args){
        
        Lista list = new Lista();
        list.insertBegin(120);
        list.insertBegin(13);
        list.insertBegin(11);
        list.insertBegin(9);
        list.insertBegin(1);
        list.insertBegin(34);
        list.insertBegin(4);
        System.out.println("Quantidade de números pares da lista: "+list.nroPares());

        
    }

}
