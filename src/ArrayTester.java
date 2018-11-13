// Napisałeś program, w którym posiadasz listę wypełnioną liczbami. Chciałbyś
//teraz przekazać tę listę do metody innej klasy, która wyświetli na ekranie konsoli tylko te elementy listy,
//które zawierają wartości parzyste. Spójrz na program:

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Stream;


//foreach loop
//every number compare and print if it is even

public class ArrayTester {
    public static void printEven(ArrayList<Integer> theList) {
        for (Integer number : theList)
            if (number % 2 == 0) {
                System.out.println(number);
            }
    }

    public static void printEvenStream(ArrayList<Integer> theList){
        // Metoda ta tworzy strumień obiektów typu Integer, o wartości początkowej
        //określonej przez argument seed. Wartości kolejnych obiektów w strumieniu wyznaczane są przez
        //wyrażenie lambda f (lub referencję do metody). Wyrażenie to otrzymuje jeden argument
        //wejściowy - aktualną wartość obiektu w strumieniu - a jego zadaniem jest zwrócenie wartości
        //kolejnej. W naszym przykładzie, wyrażenie lambda inkrementuje otrzymany argument, więc
        //kolejne obiekty w strumieniu będą miały wartość o jeden większą od poprzedniego:
        //n -> n + 1
        theList.stream()
                .filter(n -> n%2 == 0)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        Random rn = new Random();
        ArrayList<Integer> theBigList = new ArrayList<>();
        for (int n = 0; n < 100; n++) {
            theBigList.add(rn.nextInt(200));
        }
       printEven(theBigList);
       printEvenStream(theBigList);
    }
}
