package oop_prac4;

public class Special extends Discount {
    @Override
    public int getDiscount(int price) {
        if (price > 250_000) return 6;
        return 0;
    }
}
