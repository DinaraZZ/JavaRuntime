package oop_prac11_string;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*String text = "template liquid transaction";
        System.out.println(myIndexOf(text, "transaction"));*/

        String[] text = new String[]{"flower", "fork", "flight"};
        System.out.println(prefix(text));
    }

    private static int myIndexOf(String text, String target) {
        char[] textCh = text.toCharArray();
        char[] targetCh = target.toCharArray();

        int index = -1;
        boolean contains = false;

        for (int i = 0; i < textCh.length; i++) {
            int count = 0;
            int indexText = i;
            for (int j = 0; j < targetCh.length; j++) {
                if (textCh[indexText] == targetCh[j] && textCh.length - i >= targetCh.length) {
                    indexText++;
                    count++;
                    if (count == targetCh.length) {
                        index = i;
                        contains = true;
                        break;
                    }
                } else break;
            }
            if (contains) break;
        }

        return index;
    }

    private static String prefix(String[] text) {
        String prefixWord = "";
        if (text.length > 0) {
            /*String minWord = text[0];
            for (String word : text) {
                if (word.length() < minWord.length()) minWord = word;
            }

            int coincidence = 0;
            for (int i = 0; i < minWord.length(); i++) {
                int count = 0;
                for (String word : text) {
                    if (word.charAt(i) == minWord.charAt(i)) count++;
                }
                if (count != text.length) break;
                coincidence++;
            }

            for (int i = 0; i < coincidence; i++) prefixWord += minWord.charAt(i);*/

            Arrays.sort(text);
            String firstWord = text[0];
            String lastWord = text[text.length - 1];
            int minSize = firstWord.length() > lastWord.length() ? lastWord.length() : firstWord.length();

            for (int i = 0; i < minSize; i++) {
                if (firstWord.charAt(i) == lastWord.charAt(i)) prefixWord += firstWord.charAt(i);
                else break;
            }
        }
        return prefixWord;

    }
}
