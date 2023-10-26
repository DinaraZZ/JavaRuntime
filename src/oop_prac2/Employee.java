package oop_prac2;

public class Employee {
    private final String name;
    private final int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public int employeeSalary() {
        int totalSalary = 0;
        totalSalary += this.getSalary();
        if (this instanceof Worker w) totalSalary += w.getBonus();
        return totalSalary;
    }

    public int getAllEmployeesTotalSalary() {
        return getSalary();
    }

    public int getTotalSalary() {
        return getSalary();
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}
