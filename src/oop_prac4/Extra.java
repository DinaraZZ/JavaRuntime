package oop_prac4;

public class Extra extends Discount{
    @Override
    public int getDiscount (int price) {
        if (price > 200_000) return 7;
        else if (price > 150_000) return 5;
        else if (price > 100_000) return 3;
        return 0;
    }
}
