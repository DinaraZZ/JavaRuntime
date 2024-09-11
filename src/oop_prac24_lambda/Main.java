package oop_prac24_lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        // 1
        String word = "hELLo world";
        WordEditor wordEditor = text -> {
            text = text.toLowerCase();
            String firstLetter = text.substring(0, 1);
            return firstLetter.toUpperCase() + text.substring(1);
        };
        String result = wordEditor.capitalize(word);
        System.out.println(result);

        // 2
        MathLambda mathLambda = (num1, num2, num3) -> Math.max(num1, Math.max(num2, num3));
        // Collections.max

        // 3
        List<String> words = List.of("JavaScript", "Java", "Haskell", "Php", "Python");
        Predicate<String> overSix = (String word1) -> word1.length() > 6;
        UnaryOperator<List<String>> filter = (List<String> orgList) -> {
            List<String> resultList = new ArrayList<>();
            for (String s : words) {
                if (overSix.test(s)) resultList.add(s);
            }
            return resultList;
        };

        // 4
        Function<List<String>, List<Integer>> wordsToLength = (List<String> orgList) -> {
            List<Integer> resultList = new ArrayList<>();
            for (String s : orgList) {
                resultList.add(s.length());
            }
            return resultList;
        };
    }
}

interface WordEditor {
    String capitalize(String text);
}

interface MathLambda {
    int max(int num1, int num2, int num3);
}