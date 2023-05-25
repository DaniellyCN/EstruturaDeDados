package ativ_prova_1;

public class Vector {
    private int[] numbers;
    private int total_numbers = 0;

    public Vector(int[] vector) {
        numbers = vector;
    }

    public Vector(int col) {
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

    public int getElement(int index) {
        if (index >= 0 && index < total_numbers) {
            return this.numbers[index];
        } else {
            throw new IndexOutOfBoundsException("Índice fora dos limites do vetor.");
        }
    }

    public String toString() {
        String list = "";
        for(int i = 0; i < size(); i++){
            list += String.valueOf(getElement(i)) + " ";
        }
        return list.trim();
    }

    
}