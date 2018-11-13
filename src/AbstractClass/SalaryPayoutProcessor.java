package AbstractClass;

public class SalaryPayoutProcessor extends SalaryPayout {

    //nieużywany bo przecież dziedziczy z klasy abstrakcyjnej salaryPayout w której jest to pole
    private Employee employee;

    public SalaryPayoutProcessor(Employee employee) {
        super(employee);
    }

    @Override
    protected void payout() {
        System.out.println("sending money to employee");
    }
}
