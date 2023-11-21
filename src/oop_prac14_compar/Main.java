package oop_prac14_compar;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> citytoCount = new LinkedHashMap<>();
        citytoCount.put("Москва", 12_100_000);
        citytoCount.put("Астана", 1_300_000);
        citytoCount.put("Киев", 5_700_000);
        citytoCount.put("Алмата", 2_200_000);

        List<String> values = new LinkedList<>(citytoCount.keySet().stream().toList());

        System.out.println(citytoCount.values().stream().toList().getClass());

        Collections.sort(values, new CountComparator(citytoCount));
        System.out.println(values);
    }
}
