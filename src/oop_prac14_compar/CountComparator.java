package oop_prac14_compar;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;

public class CountComparator implements Comparator<String> {

    private Map<String, Integer> cities;

    public CountComparator(Map<String, Integer> cities) {
        this.cities = cities;
    }

    @Override
    public int compare(String o1, String o2) {
        return Integer.compare(cities.get(o2), cities.get(o1));
    }
}
