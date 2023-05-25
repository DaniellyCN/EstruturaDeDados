package ativ_prova_8;

public class Main {
    public static void main(String[] args){
        
        Lista list1 = new Lista();
        list1.add_ordenado(120);
        list1.add_ordenado(13);
        list1.add_ordenado(11);
        list1.add_ordenado(9);
        list1.add_ordenado(1);
        list1.add_ordenado(34);
        list1.add_ordenado(4);

        Lista list2 = new Lista();
        list2.add_ordenado(77);
        list2.add_ordenado(1);

        concat(list1, list2);

        
    }

    public static void concat(Lista list1, Lista list2) {
        Lista aux = new Lista();
    
        for (int i = 0; i < list1.sizeList(); i++) {
            int content = (int) list1.getElementByIndex(i);
            aux.insertBegin(content);
        }
    
        for (int i = 0; i < list2.sizeList(); i++) {
            int content = (int) list2.getElementByIndex(i);
            aux.insertBegin(content);
        }
    
        System.out.println(aux.toString());
    }

}
