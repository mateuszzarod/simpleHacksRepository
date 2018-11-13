import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

//write a function to remove duplicates
//wrzuć wszystko do seta
public class removeDuplicates {

    public static List<String> dupliocateRemoval(List<String> list){
        Set<String> set = new HashSet<>(list);
        List<String> listWithout = new ArrayList<>();
        listWithout.addAll(set);
        return listWithout;
    }

    public static void main(String[] args) {
        List<String> temp = new ArrayList<>();
        temp.add("whoa");
        temp.add("whoa");
        temp.add("Mati");
        temp.add("Mati");
        temp.add("ikea");

        System.out.println(dupliocateRemoval(temp));
    }
}
