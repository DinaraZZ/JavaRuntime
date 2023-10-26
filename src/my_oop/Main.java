package my_oop;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.name = "Bread";
        p1.price = 150;
        p1.count = 5;

        p1.sell(-3);
        p1.sell(3);
        p1.sell(2);
        p1.sell(0);
    }
}
