package oop_prac6;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product(new Category("Smartphones"), "Apple Iphone 12", 990, new Option("Производитель", "2"), new Option("3", "4"));
        Product p2 = new Product(new Category("Smartphones"), "Apple Iphone 15", 9990, new Option("Производитель", "Apple"), new Option("Производитель", "Apple"));
        Product[] products = new Product[]{p1, p2};
//        Product p2 = new Product(new Category("Smartphones"), "Apple Iphone 12", 990, new Option("1", "2"));
//        Product p2 = new Product(new Category("Smartphones"), "Apple Iphone 12", 990);

//        System.out.println(p1.equals(p2));
//        System.out.println(p1.hashCode() == p2.hashCode());

//        for (Product p : products) System.out.println(p.toString());

        /*for (Product p : products) {
            if (p.checkOpt("Производитель", "Apple")) System.out.println(p.toString());
        }*/


    }
}
