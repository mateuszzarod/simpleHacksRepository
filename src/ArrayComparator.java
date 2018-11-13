import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//compare arrays for common element
//iterate through 1st
//you can use Interator while(hasnext) and compare interator.next with inside loop
//be sure that it doesen't compare with each other (if i.hashcode != j.hashcode) when dealing with maps
//isEmpty when dealing with list
//inside loop
//take element on i
//compare to every other element on j
//if (they match)
//add it to second list
public class ArrayComparator {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 5, 5, 8, 9, 7, 10};
        int[] array2 = {1, 0, 6, 15, 6, 4, 7, 0};
        List<Integer> compareList = new ArrayList<>();

        Arrays.toString(array1);
        Arrays.toString(array2);


        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    compareList.add(array1[i]);
                }
            }
        }
        System.out.println(compareList);
    }
}

