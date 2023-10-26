package oop_prac5;

public class Manager extends Employee {
    private Employee[] employees;

    public Manager(String name, int salary, Employee... employees) {
        super(name, salary);
        this.employees = employees;
    }

    public int getTotalSalary() {
        int totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalaryMan();
        }
        totalSalary += getSalary();
        return totalSalary;
    }

    public int getAverageTotalSalary() {
        if (employees.length == 0) return 0;
        int totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getTotalSalary();
        }
        return totalSalary / employees.length;
    }

    public int averageSummary() {
        int summary = 0;
        int orders = 0;
        for (Employee employee : employees) {
            if (employee instanceof Trader trader) {
                summary += trader.getSummary();
                orders += trader.getOrderCount();
            }
        }
        if (orders > 0) return summary / orders;
        else return 0;
    }

    public int getSalaryMan() {
        return getSalary();
    }

    public Employee[] getEmployees() {
        return employees;
    }
}
