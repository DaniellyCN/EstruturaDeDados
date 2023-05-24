package homework8;

public class ManageVector {
    private int[] numbers;
    private int total_numbers = 0;
    private long currentTime;

    public ManageVector(int col) {
        this.numbers = new int[col];
    }

    public int size() {
        return this.total_numbers;
    }

    public void setVector(int[] numbers) {
        this.numbers = numbers;
    }

    public boolean have(int number) {
        for (int count = 0; count < numbers.length; count++) {
            if (this.numbers[count] == number) {
                return true;
            }
        }
        return false;
    }

    public void add(int number) {
        if (total_numbers == this.numbers.length) {
            return;
        }
        this.numbers[total_numbers] = number;
        this.total_numbers++;
    }

    public int[] getList() {
        return this.numbers.clone();
    }

    public double getCurrentTime() {
        return currentTime / 1000.0;
    }

    public String toString() {
        String list = "";
        for(int i = 0; i < this.size(); i++){
            list+= " " + Integer.toString(getList()[i]);
        }
        return list;
    }

    public void bubble_sort() {
        long startTime = System.nanoTime(); 

        for(int i = 0; i < size(); i++) {
            for(int j = 0; j < size() - 1; j++) {
                int aux = numbers[j];
                if(numbers[j] > numbers[j+1]){
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = aux;
                }
            }
        }
        long endTime = System.nanoTime(); 
        currentTime = endTime - startTime; 
    }

    public void selection_sort(){
        long startTime = System.nanoTime(); 
        for(int i=0; i < size(); i++){
            int smaller = i;
            for(int j= i + 1; j < size(); j++){
                if(numbers[j] < smaller){
                    smaller = j;
                }
                int aux = numbers[i]; 
                numbers[i] = numbers[smaller];
                numbers[smaller] = aux;

            }        
        }

        long endTime = System.nanoTime(); 
        currentTime = endTime - startTime; 
    }

    public void insertion_sort(){
        long startTime = System.nanoTime(); 
        for (int i = 1; i < size(); i++) {
            int aux = numbers[i];
            int j = i - 1;
            while (j >= 0 && aux < numbers[j]) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j + 1] = aux;
        }
        long endTime = System.nanoTime(); 
        currentTime = endTime - startTime;             

    }

}
