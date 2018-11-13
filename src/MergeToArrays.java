//take one array
//sort so that odd are on left
//return new array

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeToArrays {


    public static List<Integer> arraySorterIndexes(List<Integer> arg) {
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        for (int i = 0; i < arg.size(); i++) {
            if ((i & 1) == 0) {
                even.add(arg.get(i));
            } else odd.add(arg.get(i));
        }
        odd.addAll(even);
        System.out.println(odd);
        return odd;
    }

    public static List<Integer> arraySorter(int[] n) {

        List<Integer> arg = new ArrayList<>();
        for (Integer integer : n) {
            arg.add(Integer.valueOf(integer));
        }

        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        for (int order : arg) {
            if ((order & 1) == 1) {
                //nieparzyste bo bitowo zostawia 1
                odd.add(order);
            } else even.add(order);
        }
        Collections.sort(odd);
        Collections.sort(even);
        odd.addAll(even);
        return odd;
    }

    public static List<Integer> listSorter(List<Integer> n) {
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        for (int order : n) {
            if ((order & 1) == 1) {
                odd.add(order);
            } else even.add(order);
        }
        Collections.sort(odd);
        Collections.sort(even);
        odd.addAll(even);
        return odd;
    }

    public static void main(String[] args) {
        /*List<Integer> myList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            myList.add(i);
        }
        int[] myArray = new int[20];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i;
            System.out.println(i);
        }
        System.out.println(listSorter(myList));
        System.out.println(arraySorter(myArray));*/
        List<Integer> listOne = new ArrayList<>();
        listOne.add(2);
        listOne.add(5);
        listOne.add(2);
        listOne.add(5);
        listOne.add(2);
        arraySorterIndexes(listOne);

    }

}
