package oop_prac2;

public class Worker extends Employee {
    private final int bonus;

    public Worker(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public int getTotalSalary() {
        return super.getTotalSalary() + getBonus();
    }


    public int getBonus() {
        return bonus;
    }
}
