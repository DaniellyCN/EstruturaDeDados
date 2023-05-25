package ativ_prova_9;

public class Main {
    public static void main(String[] args){
        LSE list = new LSE();
        list.insertFirst(12);
        list.insertFirst(144);
        list.insertFirst(9);
        list.insertFirst(239);
        list.insertFirst(61);
        
        list.imprimeRec();

        bubble_sort(list);
        
        System.out.println("Lista ordenada pelo método Bublle Sort:");
        list.imprimeRec();
    }

    public static void bubble_sort(LSE list) {
        for(int i = 0; i < list.size(); i++) {
            for(int j = 0; j < list.size() - 1; j++) {
                int element1 = (int) list.getElementByIndex(j);
                int element2 = (int) list.getElementByIndex(j + 1);
                
                if(element1 > element2) {
                    Object temp = list.getElementByIndex(j);
                    list.setElementById(element2, j);
                    list.setElementById(temp, j + 1);
                }
            }
        }

    }
}
