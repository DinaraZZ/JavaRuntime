package oop_prac5;

public class Promoter extends Employee {
    private int days;

    public Promoter(String name, int salary, int days) {
        super(name, salary);
        this.days = days;
    }

    public int getSalaryMan() {
        return (int) (getDays() * getSalary() * 0.01);
    }

    public int getDays() {
        return days;
    }
}
