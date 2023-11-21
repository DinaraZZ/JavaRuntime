package oop_prac12_string_builder;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        //        System.out.println(startTime);
        //        System.out.println(Long.MAX_VALUE);

        /*String str = new String();
        for (int i = 0; i < 400_000; i++) str += "-";*/
        /*StringBuilder str = new StringBuilder();
        for (int i = 0; i < 5_000_000; i++) str.append("-");*/


        /*List<String> stringList = new ArrayList<>();
        for (int i = 0; i < 2_000_000; i++)
            stringList.add("-");*/

        // A: 3163, L: 11
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < 200_000; i++)
            stringList.add("-");

        // A: 361, L: 2575 - только если в начало
        for (int i = 0; i < 50_000; i++) {
            int size = stringList.size();
            stringList.add(size / 2, "-");
        }

        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}
