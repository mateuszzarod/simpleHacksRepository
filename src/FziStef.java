import java.util.Scanner;

//znajdź największą sumę liczb dodatnich w jednym ciągu intów,
// wynik - kasuje do zera i liczymy od nowa
public class FziStef {
    public static void main(String[] args) {
        int income = 0;
        int result = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        Scanner sc = new Scanner(System.in);
        int cityNumber = sc.nextInt();
        //weź liczbę zmiennych
        for (int i=0; i<cityNumber; i++){
            //przypisz do zmiennej przychód + -
            income = sc.nextInt();
            //zrób pętlę
            //dodaj go do wyniku
            result += income;
            //jeśli zejdzie poniżej zera to ustaw go na zero i licz od nowa
            if (result < 0){
                result=0;
            }
            //ale przy okazji jeśli resultat przekroczy max to do zmiennej max przypisz go
            if (result > max){
                max = result;
            }
        }
        System.out.println(max);
    }

}
