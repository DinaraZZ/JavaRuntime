package oop_prac16_generic;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Comparator<Integer> stringComparator = Comparator.naturalOrder();

        MyList<Integer> myList2 = new MyArrayList<>();
        myList2.add(5);
        myList2.add(4);
        myList2.add(3);
        myList2.add(899);
        myList2.add(0);
        myList2.sort(stringComparator);

        System.out.println(myList2);
    }
}
