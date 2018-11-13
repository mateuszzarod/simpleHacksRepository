package AbstractClass;

public class HourlySalaryEmployee implements Employee{
    private double hours;
    private double hourlPayl;

    public HourlySalaryEmployee(double hours) {
        this.hours = hours;
    }

    @Override
    public double calculateSalary() {
        return this.hours * this.hourlPayl;
    }
}
