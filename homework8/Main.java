package homework8;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ManageVector list_numbers = new ManageVector(1000);

        Random k = new Random();

        for (int i = 0; i < 1000; i++) {
            int intNumber = k.nextInt();
            list_numbers.add(intNumber);
        }

        list_numbers.bubble_sort();
        System.out.println("Bubble Sort: " + list_numbers.toString());
        System.out.println("Tempo de execução do Bubble Sort: " + list_numbers.getCurrentTime());

        list_numbers.selection_sort();
        System.out.println("Selection Sort: " + list_numbers.toString());
        System.out.println("Tempo de execução do Selection Sort: " + list_numbers.getCurrentTime());

        list_numbers.insertion_sort();
        System.out.println("Insertion Sort: " + list_numbers.toString());
        System.out.println("Tempo de execução do Insertion Sort: " + list_numbers.getCurrentTime());
    }
}
