package oop_prac9_map;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {

        /*String[] strArr = new String[]{"Tom", "Bill", "Adele",
                "Tom", "Amanda", "Troy", "Bill", "Max", "Bill", "Max", "Max", "Max"};

        Map<String, Integer> strMap = new HashMap<>();
        for (String str : strArr) {
            int count = 1;
            if (strMap.containsKey(str)) {
                count = strMap.get(str);
                count++;
            }
            strMap.put(str, count);
        }
        System.out.println(strMap);
*/
        Product p1 = new Product("iPhone", 5_000, "Smartphone");
        Product p2 = new Product("Dell", 15_000, "Computer");
        Product p3 = new Product("Galaxy S5", 4_400, "Smartphone");
        Product p4 = new Product("Galaxy S6", 4_400, "Smartphone");
        Product[] products = new Product[]{p1, p2, p3, p4};

        /*Map<String, Integer> prMap = new HashMap<>();
        for (Product pr : products) {
            String category = pr.getCategory();
            int count = 1;
            if (prMap.containsKey(category)) {
                count = prMap.get(category);
                count++;
            }
            prMap.put(category, count);
        }
        System.out.println(prMap);*/

        /*Map<String, List<String>> catMap = new HashMap<>();
        for (Product pr : products) {
            String category = pr.getCategory();
            List<String> arr = new LinkedList<>();
            arr.add(pr.getName());
            if (catMap.containsKey(category)) {
                arr = catMap.get(category);
                arr.add(pr.getName());
            }
            catMap.put(category, arr);
        }*/

        /*Map<String, Integer[]> avrPrice = new HashMap<>();
        for (Product pr : products) {
            String category = pr.getCategory();
            if (!avrPrice.containsKey(category)) {
                int count = 1;
                int sum = pr.getPrice();
                Integer[] arr = new Integer[]{count, sum};
                avrPrice.put(category, arr);
            } else {
                Integer[] arr = avrPrice.get(category);
                arr[0]++;
                arr[1] += pr.getPrice();
            }
        }
        Set<String> keys = avrPrice.keySet();
        for (String key : keys) {
            System.out.println(key + ": " + avrPrice.get(key)[1] / avrPrice.get(key)[0]);
        }*/

        Map<String, List<Product>> avrPrice2 = new HashMap<>();
        for (Product pr : products) {
            String category = pr.getCategory();
            if (!avrPrice2.containsKey(category)) {
                List<Product> prList = new LinkedList<>();
                prList.add(pr);
                avrPrice2.put(category, prList);
            } else {
                List<Product> prList = avrPrice2.get(category);
                prList.add(pr);
            }
        }

        Set<String> keys2 = avrPrice2.keySet();
        for (String key : keys2) {
            System.out.print(key + ": ");
            List<Product> prList = avrPrice2.get(key);
            for (Product pr : prList) {
                System.out.print(pr.getName());
                if (pr != prList.get(prList.size() - 1))
                    System.out.print(", ");
            }
            System.out.println();
        }
        System.out.println();
        for (String key : keys2) {
            int sum = 0;
            List<Product> prList = avrPrice2.get(key);
            for (Product pr : prList) sum += pr.getPrice();
            System.out.println(key + ": " + sum / prList.size());
        }
    }
}
