import java.util.HashMap;

//znajdź pierwszy niepowtrzający sie element Stringa
//tworzysz mapę która jest tablicą wyniów bo key jest wyjątkowy, ale do walue przypisujesz wynik

public class FirstNonRepeating {
    public static char firstNonRepeat(String arg) {
        HashMap<Character, Integer> score = new HashMap<>();
        //pętla która iteruje stringa, pobiera jego literkę i przypisuje do zmiennej
        //jeśli zawiera to wydrukuj
        //else dodaj literkę i 1 w wyniku

        //umieść w mapie wyniki
        for (int i = 0; i < arg.length(); i++) {
            char c = arg.charAt(i);
            //albo informuje że taki wynik juz jest
            if (score.containsKey(c)) {
                System.out.println(score.get(c));
                //jeśli nie ma to go wrzuca w sztuk 1
            } else score.put(c, 1);
        }

        //druga pętla która interuje przez wyraz raz jeszcze
        //literę zapisuje do zmiennej
        //jeśli jeśli dana litera w mapie = 1
        //to ją zwraca
        for (int i = 0; i < arg.length(); i++) {
            char c = arg.charAt(i);
            if (score.get(c) == 1) {
                return c;
            }
        }
        throw new RuntimeException("Undefined behaviour");
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeat("mmatteeuussz"));
    }
}







