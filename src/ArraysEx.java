import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


//Use Map.Entry when dealing with foreach loop
//implement hashCode fe. by ID or pesel
class Employee {
    private String firstName;
    private String lastName;
    private String peselID;

    public Employee(String firstName, String lastName, String peselID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.peselID = peselID;
    }

    @Override
    public boolean equals(Object o) {
        final Employee e = (Employee) o;
        return this.firstName.equals(e.firstName)
                && this.lastName.equals(e.lastName)
                && this.peselID.equals(e.peselID);
    }

    @Override
    public int hashCode() {
        return Integer.parseInt(peselID.substring(0, 2));
    }
}

class SalaryParameters {
    Double baseSalary;
    Double regulatedBonus;
    Double chefBonus;
    Double functionAddSalary;


    public SalaryParameters(Double baseSalary, Double regulatedBonus, Double chefBonus, Double functionAddSalary) {
        this.baseSalary = baseSalary;
        this.regulatedBonus = regulatedBonus;
        this.chefBonus = chefBonus;
        this.functionAddSalary = functionAddSalary;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "baseSalary=" + baseSalary +
                ", regulatedBonus=" + regulatedBonus +
                ", chefBonus=" + chefBonus +
                ", functionAddSalary=" + functionAddSalary +
                '}';
    }
}

public class ArraysEx {
    public static void main(String[] args) {

        Employee employee = new Employee("Mati", "Zaród", "213");
        Employee employee2 = new Employee("Mati", "Zaród", "213");
        System.out.println(employee.equals(employee2))
        ;
        ArrayList<String> library = new ArrayList<String>();
        library.add("50 shades of Grey");
        library.add("Sherlock Holmes");
        library.add("The Last Mohikan");

        Employee worker2 = new Employee("Sarah", "Taylor", "12345612345");
        Employee worker3 = new Employee("Laura", "Pinelli", "12345698765");
        Employee worker4 = new Employee("Laura", "Pinelli", "12345045678");

        SalaryParameters params1 = new SalaryParameters(5000.0, 3000.0, 0.0, 0.0);
        SalaryParameters params2 = new SalaryParameters(4000.0, 2000.0, 1000.0, 0.0);
        SalaryParameters params3 = new SalaryParameters(4500.0, 3500.0, 0.0, 0.0);

        Map<Employee, SalaryParameters> paymentParameters = new HashMap<>();
        paymentParameters.put(worker2, params1);
        paymentParameters.put(worker3, params2);
        paymentParameters.put(worker4, params3);


        for (Map.Entry<Employee, SalaryParameters> entry : paymentParameters.entrySet()) {
            if (entry.getValue().baseSalary >= 4500) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }

        for (int i = 0; i < library.size(); i++) {
            System.out.println(i + " " + library.get(i));
        }
        for (String lib : library) {
            System.out.println(lib);
        }

    }
}
