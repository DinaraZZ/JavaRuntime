package oop_prac5;

public class Trader extends Employee {
    private int summary; // salary + 10%summary
    private int orderCount;

    public Trader(String name, int salary, int summary, int orderCount) {
        super(name, salary);
        this.summary = summary;
        this.orderCount = orderCount;
    }

    public int getSalaryMan() {
        return (int) (getSummary() * 0.15);
    }

    public int getTotalSalary() {
        return (int) (getSalary() + getSummary() * 0.1);
    }

    public int getSummary() {
        return summary;
    }

    public int getOrderCount() {
        return orderCount;
    }
}
