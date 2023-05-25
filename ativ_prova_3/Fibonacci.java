package ativ_prova_3;

public class Fibonacci {
    public static void main(String[] args){
        System.out.println("Teste para o sétimo termo da sequeência de Fibonacci: "+fibonacciCalc(6));
    }

    public static int fibonacciCalc(int n){
        if(n < 2){
            return n;
        }else{
            return fibonacciCalc(n - 1 )+ fibonacciCalc(n - 2);
        }

    }
}
