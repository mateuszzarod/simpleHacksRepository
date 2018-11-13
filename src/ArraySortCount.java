
import java.util.ArrayList;
import java.util.List;


//sort array so that elements on even place are added and on odd are multiplied
//initialize start and empty string
//start for loop

//start empty string
//compare - every element wiht i index i if i index i%2==0 add + operarion
//else * operation
//same time build empty string with String.valueOf(arg.get(i);
//  you can do may operations in loop f.e. change boolean flag;

public class ArraySortCount {
    public static int arrayCount(List<Integer> arg) {

        int start = 0;
        String result = "";

        for (int i = 0; i < arg.size(); i++) {
            if ((i % 2) == 0) {
                result = result + " + " + String.valueOf(arg.get(i));
                start = start + arg.get(i);
            } else {
                start = start * arg.get(i);
                result = result + " * " + String.valueOf(arg.get(i));
            }
        }
        System.out.println(result);
        System.out.println(start);
        return start;
    }

    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<>();
        ls.add(2);
        ls.add(2);
        ls.add(3);
        ls.add(2);
        arrayCount(ls);
    }
}
