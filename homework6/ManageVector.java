package homework6;

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

    public int findMaxRecursive(int[] numbers) {
        long startTime = System.nanoTime(); // Registro do tempo de início
        if (numbers.length == 0) {
            return Integer.MIN_VALUE;
        }
        int max = findMaxRecursiveHelper(numbers, 0, numbers.length - 1);
        long endTime = System.nanoTime(); // Registro do tempo de fim
        currentTime = endTime - startTime; // Cálculo da diferença de tempo
        return max;
    }

    private int findMaxRecursiveHelper(int[] numbers, int begin, int last) {
        long startTime = System.nanoTime(); // Registro do tempo de início
        if (begin == last) {
            long endTime = System.nanoTime(); // Registro do tempo de fim
            currentTime = endTime - startTime; // Cálculo da diferença de tempo
            return numbers[begin];
        } else {
            int middle = (begin + last) / 2;
            int max_1 = findMaxRecursiveHelper(numbers, begin, middle);
            int max_2 = findMaxRecursiveHelper(numbers, middle + 1, last);

            if (max_1 > max_2) {
                long endTime = System.nanoTime(); // Registro do tempo de fim
                currentTime = endTime - startTime; // Cálculo da diferença de tempo
                return max_1;
            }
            long endTime = System.nanoTime(); // Registro do tempo de fim
            currentTime = endTime - startTime; // Cálculo da diferença de tempo
            return max_2;
        }
    }

    public int findMaxIterative() {
        long start = System.currentTimeMillis();
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        long end = System.currentTimeMillis();
        currentTime = end - start;
        return max;
    }
}