package oop_prac6;

import java.util.Arrays;
import java.util.Objects;

public class Product {
    private Category category;
    private final String name;
    private final int price;
    private Option[] options;

    public Product(Category category, String name, int price, Option... options) {
        this.category = category;
        this.name = name;
        this.price = price;
        this.options = options;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Product product = (Product) obj;
        return category.equals(product.category) && name.equals(product.name) && price == product.price
                && Arrays.equals(options, product.options);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, name, price, Arrays.hashCode(options));
    }

    @Override
    public String toString() {
        String optionsStr = new String();
        for (Option op : options) optionsStr += op.toString();
        return category.toString() +
                "Название: " + name + "\n" +
                "Стоимость: " + price + "\n" +
                optionsStr;
    }

    public Boolean checkOpt (String op1, String op2) {
        for (Option op : getOptions()) {
            if (op.getStr1().equals(op1) && op.getStr2().equals(op2)) {
                return true;
            }
        }
        return false;
    }

    public Category getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public Option[] getOptions() {
        return options;
    }
}