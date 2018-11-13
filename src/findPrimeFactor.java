import java.util.ArrayList;
import java.util.List;

//to take prime you have to divide a nubrem throug all numbers between n = 2 till n > 2

public class findPrimeFactor {
    public static List<Integer> primeFactors(int n){
        List<Integer> primeFactors = new ArrayList<>();
        int divisior = 2;

        while (n > 2){

            if (n % divisior == 0 ){
                primeFactors.add(divisior);
                n =  n / divisior;
            } else divisior++;
        }
        return primeFactors;
    }

    public static void main(String[] args) {
        System.out.println(primeFactors(30));

    }
}
