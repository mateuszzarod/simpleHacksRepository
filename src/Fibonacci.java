import java.util.Scanner;


public class Fibonacci {

    //deklaracja i inicjalizacja zmienne i suma i licznik
    // do zmienne przypisz liczbkę, którą zaweira liczbę pętli
    //zacznij pętlęod 2 do wymaganej liczby
    // prinr n1 i n2
    //start loop from 2 do count
    //dodaj n1 i n2
    //podmień wartości
    ////print wynik
    // LUB
    // rekursja (fibonnaci-1) + (fibbonaci-2)

    public static long simpleFibonaci(int n) {
        int n1 = 0;
        int n2 = 1;
        int n3 = 0;
        int count = n;
        System.out.println(n1 + " " + n2);
        for (int i = 2; i < count; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.println(" " + n3);
        }
        return n;
    }

    public static long fibonacciRecursion(int n) {
        if (n <= 1) return n;
        else return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
    }

    public static void fibonacciNoRec(int number) {
        for (int i = 0; i <= number; i++) {
            System.out.println(getFibonacci(i) + " ");
        }
    }

    private static int getFibonacci(int n) {
        if (n == 0) return 0;
        if (n <= 1) return 1;

        int first = 0;
        int second = 1;
        int nth = 1;

        for (int i = 2; i <= n; i++) {
            nth = first + second;
            first = second;
            second = nth;
        }
        return nth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        /*for (int i=0; i<=n; i++){
            System.out.println(i + " " + fibonacci(i));
        }*/
        simpleFibonaci(20);
    }
}
