package oop_prac2;

public class Manager extends Worker {
    private Employee[] employees;

    public Manager(String name, int salary, int bonus, Employee... employees) {
        super(name, salary, bonus);
        this.employees = employees;
    }

    /*private int employeeSalary(Employee e) {
        int totalSalary = 0;
        totalSalary += e.getSalary();
        if (e instanceof Worker w) totalSalary += w.getBonus();
        return totalSalary;
    }*/

    @Override
    public int getTotalSalary() {
        return (int) (super.getTotalSalary() * 1.15);
    }

    public int averageSalary() {
        int totalSalary = 0;
        int counter = 0;
        for (Employee e : employees) {
            if (!(e instanceof Manager)) {
                totalSalary += e.employeeSalary();
                counter++;
            }
        }
        return totalSalary / counter;
    }

    public Employee highPaidWorker() {
        int maxSalary = 0;
        Employee employee = null;
        for (Employee e : employees) {
            if (!(e instanceof Manager)) {
                if (e.employeeSalary() > maxSalary) {
                    maxSalary = e.employeeSalary();
                    employee = e;
                }
            }
        }
        return employee;
    }

    @Override
    public int getAllEmployeesTotalSalary() {
        int totalSalary = getSalary();
        for (Employee employee : employees) {
            totalSalary += employee.getAllEmployeesTotalSalary();
        }
        return totalSalary;
    }

    public Employee[] getEmployees() {
        return employees;
    }
}
