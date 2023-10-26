package oop_prac2;

public class Structure2 {
    public static void main(String[] args) {

        Employee e1 = new Employee("Ashley", 1_500);
        Worker w1 = new Worker("Mark", 1_300, 50);
        Intern i1 = new Intern("Tom", 500, 7);
        Manager m2 = new Manager("m", 1_500, 8);

        Manager m1 = new Manager("Manager", 1_500, 8, m2, e1, w1, i1);

        Employee[] employees = null;
        /*for (Employee employee : employees) {
            System.out.println(employee.getTotalSalary());
        }*/
//        System.out.println("Average salary: " + m1.averageSalary());
//        System.out.println(e1.getTotalSalary());
//        System.out.println(m1.highPaidWorker().getName());
        /*System.out.println(e1.getClass().getSimpleName());
        System.out.println(employees.getClass().getSimpleName());*/

//        Worker w2 = (Worker) e1;
        System.out.println(employees.length);
        /*Manager bill = new Manager("Bill", 1_100, 600, new Employee[]{
                new Manager("Jeff", 850, 250, new Employee[]{
                        new Manager("Alex", 1_000, 200, new Employee[]{
                                new Intern("John", 300, 50)
                        }),
                        new Intern("Nick", 220, 30)
                }),
                new Worker("Mick", 500, 120),
                new Worker("Max", 600, 100)
        });
        System.out.println(bill.getAllEmployeesTotalSalary());*/
    }
}
