package oop_practice.task_1;

public class OopPracticeTask1 {
    public static void main(String[] args) {

        Person p1 = new Person("P1", 15);

        Person p2 = new Person("P2", 30);

        Person p3 = new Person("P3", 25);

//        City c1 = new City("C1", new Person[]{p1, p2, p3});
        City c1 = new City("C1", new Person[]{});
        System.out.println(c1.adultNumber());
        System.out.println(c1.adultAverageAge());
    }
}
