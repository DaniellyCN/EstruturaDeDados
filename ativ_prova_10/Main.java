package ativ_prova_10;

public class Main {
    public static void main(String[] args) {
        int[] vector = {3, 7, 1, 4, 9, 2};

        System.out.println("Vetor original: ");
        toString(vector);
        bubbleSort(vector);
        selectionSort(vector);
        insertionSort(vector);
    }

    public static void bubbleSort(int[] numbers) {
        System.out.println("\nBubble Sort:");
        boolean change;

        for(int i = 0; i < numbers.length; i++) {
            change = false;
            for(int j = 0; j < numbers.length - 1; j++) {
                int aux = numbers[j];
                if(numbers[j] > numbers[j+1]){
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = aux;
                    change = true;
                }
            }

            if (change) {
                toString(numbers);
            }
        }
        
        System.out.println("Vetor ordenado: ");
        toString(numbers);
    }

    public static void selectionSort(int[] numbers) {
        System.out.println("\nSelection Sort:");

        for(int i=0; i < numbers.length; i++){
            int smaller = i;
            for(int j= i + 1; j < numbers.length; j++){
                if(numbers[j] < smaller){
                    smaller = j;
                }
                int aux = numbers[i]; 
                numbers[i] = numbers[smaller];
                numbers[smaller] = aux;

            }
            if (smaller != i) {
                trocarElementos(numbers, i, smaller);
                toString(numbers);
            }        
        }


        System.out.println("Vetor ordenado: ");
        toString(numbers);
    }


    public static void insertionSort(int[] numbers) {
        System.out.println("\nInsertion Sort:");
        
        for (int i = 1; i < numbers.length; i++) {
            int aux = numbers[i];
            int j = i - 1;
            while (j >= 0 && aux < numbers[j]) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j + 1] = aux;
            toString(numbers);
        }

        System.out.println("Vetor ordenado: ");
        toString(numbers);
    }

    public static void trocarElementos(int[] vetor, int i, int j) {
        int temp = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = temp;
    }

    public static void toString(int[] vetor) {
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}