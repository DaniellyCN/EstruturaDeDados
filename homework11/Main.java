package homework11;

public class Main {
    public static void main(String[] args) {
        FilaLista fila = new FilaLista();

        fila.add(10);
        fila.add(20);
        fila.add(30);
        
        fila.print();

        int tamanho = fila.size();
        System.out.println("Tamanho da fila: " + tamanho);

        fila.remove(10);
        fila.print();

        boolean vazia = fila.isEmpty();
        System.out.println("Fila está vazia? " + vazia);
    }
}

