package AbstractClass;

abstract class SalaryPayout {

    //przyjmuje tutaj każdą implementację tego itnefejsu
    //zwraca różne metody
    //ta klasa przyjmuje w konstruktorze klasę pracownika, opakowuje ją swoimi metodami
    //w metodzie process payout jest też metoda payout i dodakowe jakieś printliny

    private Employee employee;

    public SalaryPayout(Employee employee) {
        this.employee = employee;
    }

    protected abstract void payout();

    //metoda którą muszą odziedziczyć inne klasy
    public void processPayout() {
        //zwraca każda implementacje interfejsu z z jego implementacją metody calculateSalary
        System.out.println("Creating payout for" + this.employee.calculateSalary() + "PLN");
        this.payout();
        System.out.println("DONE!");
    }
}
