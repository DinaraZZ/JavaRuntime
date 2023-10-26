package oop_prac4;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Order {
    private int price;
    private Set<Discount> discounts;

    public Order(int price, Discount... discounts) {
        this.price = price;
        this.discounts = new HashSet<>();
        Collections.addAll(this.discounts, discounts);
        /*for(Discount d : discounts) {
            this.discounts.add(d);
        }*/
    }

    public int getPrice() {
        return price;
    }

    public int getTotalWithDiscount() {
        int totalDiscount = 0;
        for (Discount discount : discounts) {
            totalDiscount += discount.getDiscount(price);
//            totalDiscount += price * discount.getDiscount(price) / 100;
        }
        if (totalDiscount > 12) return (int) (price - (price * 12 / 100.0));
        return (int) (price - (price * totalDiscount / 100.0));
    }

    public Set<Discount> getDiscounts() {
        return discounts;
    }
}
