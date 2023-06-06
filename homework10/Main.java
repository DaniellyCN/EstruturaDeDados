package homework10;

public class Main {
    public static void main(String[] args) throws Exception {
        FilaVector fila_vector = new FilaVector(5);
        fila_vector.add(1);
        fila_vector.add("Dado Donabella");
        fila_vector.add(7.4f);
        fila_vector.add("Telefonista");
        fila_vector.add(100);

        fila_vector.printFila();
    }
}
