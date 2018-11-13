import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pa05Pot {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int rows = Integer.parseInt(reader.readLine());
        //ile zestawów danych włacz bufferdread parsuj wynik do inta
        //rozpocznij petle for na ilość danych
        //
        //zacznij pobieranie danyc
        for (int i = 0; i < rows; ++i) {
            //split tworzy tablicę wyrazów dzieli według podziałki (tutaj spacja)
            String[] str = reader.readLine().split(" ");
            //podstawa parsuj Int z pierwszej pozycji tablicy
            long podstawa = Integer.parseInt(str[0]);
            podstawa = podstawa % 10;
            //podstawa parsuj Int z drugiej pozycji tablicy np. 3 3
            long wykładnik = Integer.parseInt(str[1]);
            if (wykładnik > 0) {
                //1 1 1 1
                //2 4 8 6
                //2 4 8 6
                if (wykładnik % 4 == 0) {
                    wykładnik = 4;
                } else {
                    //wystarczą ostatnie 4 cyfry potęgi, żeby wiedzieć
                    wykładnik = wykładnik % 4;
                }
                //zmeń na long podstawę
                long wynik = podstawa;
                //zaczynamy od 1 bo nie wykonujemy pierwszego kroku (do potęgi 1)
                //następnie mnożymy podstawe tyle razy ile wykładnik (pętla for po wykkładniku)
                //wynik * podstawa
                for (int j = 1; j < wykładnik; j++) {
                    wynik = wynik * podstawa;
                }
                //daj nam tylko ostatnią cyfrę wyniki
                System.out.println(wynik % 10);
            }
            //jeśli jest mniejszy równy zero wykładni to na pewno zwróci 1
            else System.out.println(1);
        }
    }
}
