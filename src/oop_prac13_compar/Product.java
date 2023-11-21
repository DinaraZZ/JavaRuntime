package oop_prac13_compar;

public class Product {
    private final String category;
    private final String name;
    private final int price;

    public Product(String category, String name, int price) {
        this.category = category;
        this.name = name;
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(category);
        sb.append(":\t");
        sb.append(name);
        sb.append(" -\t");
        sb.append(price);
        return sb.toString();
    }
}
