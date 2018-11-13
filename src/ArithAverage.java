import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//initialize sum
//foreach loop thorugh every element
//add every element (m) to sum
//return sum from

public class ArithAverage {
    public static double getAverage(List<Integer> arg) {
        Integer sum = 0;
        double average = 0.0;
        if (!arg.isEmpty()) {
            for (Integer m : arg) {
                sum += m;
            }
            average = sum.doubleValue() / arg.size();
        }
        System.out.println(sum);
        return average;
    }

    public static void main(String[] args) {
        int number = 3;
        int[] numbers = new int[number];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < number; i++) {
            System.out.println("enter a integer");
            numbers[i] = sc.nextInt();
        }

        //we don't have to change type
        //java makes autoboxing
        List<Integer> newListofInteger = new ArrayList<>();
        for (int i : numbers) {
            newListofInteger.add(Integer.valueOf(i));
        }

        List<Integer> newList2 = new ArrayList<>();
        newList2.add(10);
        newList2.add(10);
        newList2.add(10);
        System.out.println(getAverage(newList2));
    }
}
