package ativ_prova_6;

public class Main {
    public static void main(String[] args){
        
        Lista list = new Lista();
        list.add_ordenado(120);
        list.add_ordenado(13);
        list.add_ordenado(11);
        list.add_ordenado(9);
        list.add_ordenado(1);
        list.add_ordenado(34);
        list.add_ordenado(4);
        System.out.println("Quantidade de números pares da lista: "+list.toString());

        
    }

}
