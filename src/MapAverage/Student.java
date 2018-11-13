package MapAverage;

import java.util.Objects;

public class Student {
    private String name;
    private String surname;
    private String peselId;

    public Student(String name, String surname, String peselId) {
        this.name = name;
        this.surname = surname;
        this.peselId = peselId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) &&
                Objects.equals(surname, student.surname) &&
                Objects.equals(peselId, student.peselId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, surname, peselId);
    }
}
