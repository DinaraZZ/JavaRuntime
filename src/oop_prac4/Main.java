package oop_prac4;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Fixed f1 = new Fixed();
        Fixed f2 = new Fixed();
        Special s1 = new Special();
        Extra e1 = new Extra();

        Order o1 = new Order(100_000, f1, f1, f1, f1, new Fixed());
        Order o2 = new Order(260_000, s1, e1);
        Order o3 = new Order(20_000, f1, e1);
        Order[] orders = new Order[]{o1, o2, o3};
        /*for (Order o : orders) {
            System.out.println(o.getTotalWithDiscount());
        }*/
        for (Order o : orders) {
            if (o.getDiscounts().contains(new Fixed())) System.out.println(o.getPrice());
        }
    }
}
