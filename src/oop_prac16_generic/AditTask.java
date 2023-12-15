package oop_prac16_generic;

import oop_prac14_compar.Event;
import oop_prac14_compar.EventComparator;
import oop_prac14_compar.EventDurationComparator;

import java.lang.reflect.Array;
import java.time.LocalTime;
import java.util.*;

public class AditTask {

    public static void main(String[] args) {
        // sort(array -> любой тип) -> сортировка при условии что есть Comparable.
        // sort(array -> любой тип, comparator) -> сортировка по правилу Comparator.

        /*// Integer[] arr = new Integer[]{57, 1, 60, 3, 4};
        String[] arr = new String[]{"afs", "zkioas", "pekg", "bdwhk"};
        sort(arr);
        for (var a : arr)
            System.out.print(a + " ");
        System.out.println();

        Event e = new Event("e1", LocalTime.of(20, 5), 40);
        Event e2 = new Event("e2", LocalTime.of(15, 5), 6);
        Event e3 = new Event("e3", LocalTime.of(11, 0), 60);
        Event[] eArr = new Event[]{e, e3, e2};
        sort(eArr, new EventDurationComparator());
        for (var a : eArr)
            System.out.println(a + ": " + a.getDuration() + " mins");*/


        /*Integer[] arr = new Integer[]{57, 1, 60, 3, 4};
        System.out.println(maxValue(arr));

        Event e = new Event("e1", LocalTime.of(20, 5), 40);
        Event e2 = new Event("e2", LocalTime.of(15, 5), 6);
        Event e3 = new Event("e3", LocalTime.of(11, 0), 60);
        Event[] eArr = new Event[]{e, e3, e2};
        System.out.println(maxValue(eArr, new EventComparator()));*/

        /*
        Integer[] arr = new Integer[]{57, 1, 60, 3, 4};
        System.out.println(arr);
        Integer[] copy = arrayCopy(arr);
        System.out.println(copy);
        */

//        Object[] arr1 = new Object[3];
//        String[] arr2 = (String[]) arr1;

//        String[] array = (String[]) Array.newInstance(String.class, 3);

        /*Integer[] arr = new Integer[]{57, 1, 60, 3, 4};
        Integer[] copy = arrayCopy(arr);
        for (Integer c : copy) System.out.print(c + " ");*/

        /*Object[] arrr = new String[]{"a", "fwse"};
        String[] copyArrr = (String[]) arrr;*/


        /*Integer[] arr1 = {1, 2, 3, 4, 5, 1, 1};
        Integer[] arr2 = {2, 3, 1, 5, 1, 1, 6};
        Integer[] same = sameValues(arr1, arr2);
        for (Integer i : same) System.out.print(i + " ");*/

        Integer[] arr2 = {2, 3, 1, 5, 1, 1, 6, 6};
        Map<Integer, Integer> arrMap = amountOfNum(arr2);
        var values = arrMap.values().toArray();
        var keys = arrMap.keySet().toArray();
        for (int i = 0; i < arrMap.size(); i++) System.out.println(keys[i] + ": " + values[i]);
    }

    private static <T extends Comparable<T>> void sort(T[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j].compareTo(array[j - 1]) < 0) {
                    T temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
//        Arrays.sort(array);
    }

    private static <T> void sort(T[] array, Comparator<T> comparator) {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (comparator.compare(array[j], array[j - 1]) < 0) {
                    T temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
//        Arrays.sort(array, comparator);
    }

    private static <T extends Comparable<T>> T maxValue(T[] array) {
        if (array.length > 0) {
            T maxValue = array[0];

            for (int i = 1; i < array.length; i++) {
                maxValue = array[i].compareTo(maxValue) > 0 ? array[i] : maxValue;
            }

            return maxValue;
        }
        return null;
    }

    private static <T> T maxValue(T[] array, Comparator<T> comparator) {
        if (array.length > 0) {
            T maxValue = array[0];

            for (int i = 1; i < array.length; i++) {
                maxValue = comparator.compare(array[i], maxValue) > 0 ? array[i] : maxValue;
            }

            return maxValue;
        }
        return null;
    }

    private static <T> T[] arrayCopy(T[] array) {
        /*Integer[] newArray = (Integer[]) new Object[array.length];
        System.out.println(newArray.getClass());
        for (int i = 0; i < array.length; i++) {
//            newArray[i] = array[i];
        }
        return array;*/
        System.out.println(array.getClass().componentType()); //значение элемента
        Class<?> type = array.getClass().componentType();
        T[] cope = (T[]) Array.newInstance(type, array.length);
        for (int i = 0; i < array.length; i++) cope[i] = array[i];
        return cope;
    }

    @SuppressWarnings("unchecked")
    private static <T> T[] sameValues(T[] arr1, T[] arr2) {
        int minLength = arr1.length <= arr2.length ? arr1.length : arr2.length;
        int maxLength = minLength == arr1.length ? arr2.length : arr1.length;
        Class<?> arrayType = arr1.getClass().componentType();
        List<T> sameValuesList = new ArrayList<>();

        T[] minArr;
        T[] maxArr;
        if (minLength == arr1.length) {
            minArr = arr1;
            maxArr = arr2;
        } else {
            minArr = arr2;
            maxArr = arr1;
        }

        for (int i = 0; i < minLength; i++) {
            if (!sameValuesList.contains(minArr[i])) {
                for (int j = 0; j < maxLength; j++) {
                    if (minArr[i].equals(maxArr[j])) {
                        sameValuesList.add(minArr[i]);
                        break;
                    }
                }
            }
        }

        T[] copy = (T[]) Array.newInstance(arrayType, sameValuesList.size());
        return sameValuesList.toArray(copy);
        // return (T[]) sameValuesList.toArray();
    }

    private static <T> Map<T, Integer> amountOfNum(T[] array) {
        Map<T, Integer> arrMap = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            /*int counter = 1;
            if (!arrMap.containsKey(array[i])) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i].equals(array[j])) {
                        counter++;
                    }
                }
                arrMap.put(array[i], counter);
            }*/

            T key = array[i];
            if (arrMap.containsKey(key)) {
                int counter = arrMap.get(key);
                arrMap.put(key, ++counter);
            } else arrMap.put(key, 1);
        }

        return arrMap;
    }
}