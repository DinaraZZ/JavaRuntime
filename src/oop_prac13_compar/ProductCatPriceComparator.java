package oop_prac13_compar;

import java.util.Comparator;

public class ProductCatPriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if (!o1.getCategory().equals(o2.getCategory())) return o1.getCategory().compareTo(o2.getCategory());
        return Integer.compare(o2.getPrice(), o1.getPrice());
    }
}
