package oop_prac2;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ashley", 1_500);
        Worker w1 = new Worker("Mark", 1_300, 50);
        Intern i1 = new Intern("Tom", 500, 7);
        Manager m1 = new Manager("Manager", 1_500, 8);

        Employee[] employees = new Employee[]{e1, w1, i1, m1};

        int salarySum = 0;
        for (Employee e : employees) {
            int salary = e.getSalary();
            System.out.print(e.getName() + ": ");

            if (e instanceof Worker w) {

            }
            if (e instanceof Manager m) {
                System.out.println(m.getSalary() + m.getBonus() + (m.getSalary() + m.getBonus()) * 1.15);
            } else if (e instanceof Worker w) {
                System.out.println(w.getSalary() + w.getBonus());
            } else {
                System.out.println(e.getSalary());
            }
        }
    }
}
