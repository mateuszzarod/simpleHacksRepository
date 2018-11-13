//How would you find the greatest common divisor of two numbers?

public class GreatestCommonDivisior {
    //zacznij od 2
    //potem zwięszkaj podzielnik i dziel obie liczby
    //jeśli obie sa podzielne przez niego przypisz do maxa divisior
    //zwiększ podzielnik
    //zwróć max
    public static int divisior(int a, int b) {
        int div = 2;
        int greatest = 0;

        while (a >= div && b >= div) {
            if (a % div == 0 && b % 2 == 0) {
                greatest = div;
            }
            div++;
        }
        return greatest;
    }

    public static void main(String[] args) {
        System.out.println(divisior(69, 169));
    }

}
