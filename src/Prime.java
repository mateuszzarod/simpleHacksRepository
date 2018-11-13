public class Prime {


    public static boolean isPrimeTwo(int n) {
        int counter = 2;

        //musi podzielić przez wszystkie liczby między 2 a 9
        // petla while n > counter
        //jeśli wyjdzie że przez żadną nie da się podzielić (jest reszta z dzielenia) return false
        //zwiększa counter
        //w każdym innym wypadku zwraca true;
        //można też podać coś innego a pry okazji ustawić flagę i ustawić ją na true jeśli znajdzie ;)

        while (n > counter) {
            if (n % counter == 0) {
                return false;
            }
            counter++;
        }
        return true;
    }

    public static boolean isPrime(int n) {
        int divisior = 2;
        while (n > divisior) {
            if (n % divisior == 0) {
                return false;
            }
            divisior++;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(10));
    }


}
