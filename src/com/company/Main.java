package com.company;

interface Employee {

    double calculateSalary();

}

class FixedSalaryEmployee implements Employee {

    private double salary;

    public FixedSalaryEmployee(double salary) {
        this.salary = salary;
    }

    public double calculateSalary() {
        return this.salary;
    }

}

class HourlySalaryEmployee {

    private double hours;
    private double hourlyPay;

    public HourlySalaryEmployee(double hours, double hourlyPay) {
        this.hours = hours;
        this.hourlyPay = hourlyPay;
    }

    public double calculateSalary() {
        return this.hourlyPay * this.hours;
    }

}

// Payout

abstract class SalaryPayout {

    private Employee employee;

    public SalaryPayout(Employee employee) {
        this.employee = employee;
    }

    //forces implementation
    protected abstract void payout();

    public void processPayout() {
        System.out.println("Creating payout for" + this.employee.calculateSalary() + "PLN");
        this.payout();
        System.out.println("DONE!");
    }

}

class SalaryPayoutProcessor extends SalaryPayout {

    private Employee employee;

    public SalaryPayoutProcessor(Employee employee) {
        super(employee);
    }

    @Override
    protected void payout() {
        System.out.println("sending money to employee");
    }
}


public class Main {

    public static void main(String[] args) {
        FixedSalaryEmployee fixedSalaryEmployee = new FixedSalaryEmployee(1000);
        SalaryPayoutProcessor salaryPayoutProcessor = new SalaryPayoutProcessor(fixedSalaryEmployee);
        salaryPayoutProcessor.processPayout();
}}
