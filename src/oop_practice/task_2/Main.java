package oop_practice.task_2;
import oop_practice.task_1.Person;
//import oop_practice.task_1.*; - все классы пакета без вложенных

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("P1", 100, true);

        Product p2 = new Product("P2", 100, true);

        Order o1 = new Order(10, new Product[]{p1, p2});

//        System.out.println(o1.getDiscount());
//        System.out.println(o1.getProducts()[0].getName());
        System.out.println(o1.cost());
    }






}