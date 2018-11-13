import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

class MyObject {
    int value = 0;

    //constructor
    public MyObject(int value) {
        this.value = value;
    }

    public boolean equals(Object o) {
        MyObject myObj = (MyObject) o;
        if (myObj.getValue() == value) {
            return true;
        } else {
            return false;
        }
    }

    //getters
    public int getValue() {
        return value;
    }
}

//start .iterator from List
//while (iterator.hasNext) returne false if comes to end of array
//you gent current object with =iterator.next (works lin foreach (variable)
//start second for loop inside while iterator
//prevent that objects are not the same (hashCode)
//of list.get(k) equals with current object (iterator.next)
//examinedObject method GETVALUE


public class CheckingForDuplicates {
    public static void main(String[] args) {
        LinkedList<MyObject> listOfNumbers = new LinkedList<MyObject>();
        Random theGenerator = new Random();
        //filling the list with random values
        for (int n = 0; n < 100; n++) {
            listOfNumbers.add(new MyObject(theGenerator.nextInt(100)));
        }
        //check for duplicates
        Iterator<MyObject> iterator = listOfNumbers.iterator();
        while (iterator.hasNext()) {
            //select interator current object and compare to every other next() method
            MyObject examinedObject = iterator.next();

            //comparing examinedObject with every element of list
            for (int k = 0; k < listOfNumbers.size(); k++) {
                //prevent that theye are not the same
                if (listOfNumbers.get(k).hashCode() != examinedObject.hashCode()) {
                    if (listOfNumbers.get(k).equals(examinedObject)) {
                        System.out.println("DUPLICATE!! " + examinedObject.getValue());
                    }
                }
            }
        }
    }
}
