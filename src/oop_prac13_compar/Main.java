package oop_prac13_compar;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        /*String words[] = new String[] {
                "liquid", "text", "template", "hi", "application"
        };

        Comparator<String> c1 = new LettersQuantityComparator();
        Arrays.sort(words, c1.reversed());

        for (String w : words) System.out.println(w);*/

        Product p1 = new Product("Смартфоны", "Apple Iphone 12", 459_000);
        Product p2 = new Product("Ноутбуки", "Apple Macbook Air", 569_000);
        Product p5 = new Product("Ноутбуки", "Apple Macbook Air", 59_000);
        Product p3 = new Product("Смартфоны", "Samsung Galaxy S22", 329_000);
        Product p4 = new Product("Наушники", "Samsung Galaxy Buds 2", 117_000);
        Product[] products = new Product[]{p1, p2, p3, p4,p5};

//        Comparator<Product> c2 = new ProductCategoryComparator();
//        Arrays.sort(products, new ProductPriceComparator().reversed());
        Arrays.sort(products, new ProductCatPriceComparator());
        for (Product p : products) System.out.println(p.getCategory() + "\t" + p.getName() + "\t\t" + p.getPrice());
    }
}
