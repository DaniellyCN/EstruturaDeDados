package ativ_prova_12;

public class RecursiveSum {
    public static int sum(int m, int n) {
        if (n > m) {
            return m + sum(m + 1, n);
        } else {
            return m;
        }
    }

    public static void main(String[] args) {
        int m = 1;
        int n = 10;
        int result = sum(m, n);
        System.out.println("Soma de " + m + " à " + n + ": " + result);
    }
}
