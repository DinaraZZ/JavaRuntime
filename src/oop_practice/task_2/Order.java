package oop_practice.task_2;

public class Order {
    private int discount;
    private Product[] products;

    public Order (int discount, Product[] products) {
        this.discount = discount;
        this.products = products;
    }

    public double cost() {
        double sum = 0;
        for (Product x : products) {
            if (x.getAvailable())
                sum += x.getPrice();
        }
        sum *= (100.0 - discount) / 100;
        return sum;
    }

    public int getDiscount() {
        return discount;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
}