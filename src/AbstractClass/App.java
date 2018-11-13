package AbstractClass;

public class App {
    public static void main(String[] args) {
        FixedSalaryEmployee employee = new FixedSalaryEmployee(2000);
        SalaryPayoutProcessor salaryPayoutProcessor = new SalaryPayoutProcessor(employee);
        salaryPayoutProcessor.processPayout();
    }
}
