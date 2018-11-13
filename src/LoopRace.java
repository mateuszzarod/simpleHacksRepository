import java.util.Random;

public class LoopRace {
    public static void main(String[] args) {
        int sumA = 1000;
        int sumB = 0;
        int numer = 0;

        Random random = new Random();

        while (sumA > sumB){
            numer++;
            sumA += random.nextInt(10);
            sumB += random.nextInt(50);

            System.out.println("przebieg petlI " + numer);
            System.out.println("suma " + sumA);
            System.out.println("sumb " + sumB);
        }
        System.out.println("skończyłem! a przekroczyło b" + sumA + " " + sumB);
    }
}
