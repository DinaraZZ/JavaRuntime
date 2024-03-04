package oop_prac21_arrays;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, int[]> map = new HashMap<>();
        map.put("a", new int[]{6112});
        map.put("b", new int[]{41, 15, 6056});
        map.put("c", new int[]{7, 98, 29, 100});

        // вывести внутренние отсортированные массивы
        /*Collection<int[]> arrays = map.values();
        for (int[] array : arrays) {
            Arrays.sort(array);
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }*/

        // вывести общую отсортированную последовательность
        /*List<Integer> array = new ArrayList<>();
        for (int[] arr : arrays) {
            for (int i = 0; i < arr.length; i++) {
                array.add(arr[i]);
            }
        }
        Collections.sort(array);
        System.out.println(array);*/

        // определить ключи, у которых наиб сумма массива
        Set<String> keys = map.keySet();
        Map<String, Integer> sums = new HashMap<>();
        for (String key : keys) {
            int sum = 0;
            for (int arr : map.get(key)) {
                sum += arr;
            }
            sums.put(key, sum);
        }

        List<String> max = new ArrayList<>();
        int maxNum = Integer.MIN_VALUE;
        var keySet = sums.keySet();
        for (String key : keySet) {
            int sum = sums.get(key);
            if (sum == maxNum) {
                max.add(key);
            } else if (sum > maxNum) {
                max.clear();
                max.add(key);
                maxNum = sum;
            }
        }

        for (String key : max) {
            System.out.println(key + ": " + sums.get(key));
        }
    }
}
