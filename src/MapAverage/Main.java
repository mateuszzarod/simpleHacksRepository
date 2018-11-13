package MapAverage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("mat", "Zar", "1234");
        Student student2 = new Student("mich", "Zar", "125434");
        Student student3 = new Student("ola", "mac", "12324");

        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(3);
        grades.add(4);
        grades.add(5);

        ArrayList<Integer> gradesTwo = new ArrayList<>();
        gradesTwo.add(3);
        gradesTwo.add(4);
        gradesTwo.add(5);

        ArrayList<Integer> gradesThree = new ArrayList<>();
        gradesThree.add(3);
        gradesThree.add(4);
        gradesThree.add(5);

        HashMap<Student, ArrayList<Integer>> studentInformation = new HashMap<>();
        studentInformation.put(student, grades);
        studentInformation.put(student2, gradesTwo);
        studentInformation.put(student3, gradesThree);

        for (Map.Entry<Student, ArrayList<Integer>> entry : studentInformation.entrySet()) {
            double sum = 0.0;
            double average = 0.0;
            for (Integer grade : entry.getValue()) {
                if (entry.getValue() != null) {
                    sum += grade;
                }
            }
            average = sum / entry.getValue().size();
            System.out.println(entry.getKey() + " " + "avergage" + " " + average);
        }
    }
}