package homework10;

public class FilaVector implements IFila {
    private int index_begin; // start index
    private int count_elements;
    private Object[] vector;

    public FilaVector(int size) {
            this.index_begin = 0;
            this.count_elements = 0;
            this.vector = new Object[size];
    }

    // diferente de length
    public int size() {
        return this.count_elements;
    }

    public boolean isEmpty() {
        return this.count_elements == 0;
    }

    public boolean add(Object element) throws Exception {
        if(size() ==  vector.length) {
            throw new Exception("A fila está cheia.");
        }
        int end = (index_begin + count_elements) % vector.length;
        vector[end] = element;        // add at the end of vector
        
        count_elements ++;
        return true;
    }

    public boolean remove() throws Exception {
        if(isEmpty()) {
            throw new Exception("A fila está vazia.");
        }
        index_begin = (index_begin + 1) % vector.length;

        count_elements --;
        return true;
    }

    public void printFila() throws Exception{
        if (isEmpty()) {
            throw new Exception("A fila está vazia.");
        }
    
        int currentIndex = index_begin;
        for (int i = 0; i < count_elements; i++) {
            System.out.println(vector[currentIndex]);
            currentIndex = (currentIndex + 1) % vector.length;
        }
    }
}
