package oop_prac9_map;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> cityToCount = new LinkedHashMap<>();
        cityToCount.put("Москва", 12_100_000);
        cityToCount.put("Астана", 1_300_000);
        cityToCount.put("Киев", 5_700_000);
        cityToCount.put("Алмата", 2_200_000);

        /*Collection<Integer> values = cityToCount.values();
        for (Integer v : values) {
            if (v > 5_000_000) {
                System.out.println(cityToCount.);
            }
        }*/

        Set<String> keys = cityToCount.keySet();

        for (String key : keys) {
            if (cityToCount.get(key) > 5_000_000) System.out.println(key);
        }

        int maxPopulation = 0;
        String maxCity = "";
        for (String key : keys) {
            int value = cityToCount.get(key);
            if (value > maxPopulation) {
                maxPopulation = value;
                maxCity = key;
            }
        }
        System.out.println(maxCity + ": " + maxPopulation);
    }
}
