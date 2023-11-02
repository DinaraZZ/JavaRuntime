package oop_prac10_string;

public class Main {
    public static void main(String[] args) {

        /*String text = "application template liquid";
        String word = "template";

        if (text.contains(word)) System.out.println("Слово содержится");
        else System.out.println("Слово не содержится");

        if (text.indexOf(word) >= 0) System.out.println("Слово содержится");
        else System.out.println("Слово не содержится");*/

        /*String text = "template application liquid task";
        int pos1 = text.indexOf(" ");
        int pos2 = text.indexOf(" ", pos1 + 1);
        String firstWord = text.substring(0, pos1);
        String secondWord = text.substring(pos1 + 1, pos2);
        System.out.println(firstWord + ", " + secondWord);

        int pos3 = 0;
        int pos4 = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                pos3 = i;
                break;
            }
        }
        for (int i = text.length() - 1; i > pos3; i--) {
            if (text.charAt(i) == ' ') {
                pos4 = i;
                break;
            }
        }
        String firstWord2 = text.substring(0, pos3);
        String secondWord2 = text.substring(pos4 + 1);
        System.out.println(firstWord2 + ", " + secondWord2);*/



        /*String text = "word apple pear test word pear pear";
        String word = "pear";

        int count = 0;
        int pos = 0;
        for (int i = 0; i < text.length(); i++) {
            if (i == 0) pos = text.indexOf(word, 0);
            else pos = text.indexOf(word, pos + 1);
            if (pos >= 0) count++;
            else break;
        }
        System.out.println(count);*/

        /*String text = "template application template template task template";
        String word = "template";
        String newWord = "";
        for (int i = 0; i < word.length(); i++) {
            newWord += "-";
        }
        *//*System.out.println(newWord);
        text = text.replace(word, newWord);
        System.out.println(text);*//*
        System.out.println(text);
//        System.out.println(text.length() - word.length());

        String newText = "";
        int pos = 0;
        int prevPos = 0;
        for (int i = 0; i < text.length(); i++) {
            if (i == 0) pos = text.indexOf(word, 0);
            else {
                prevPos = pos;
                pos = text.indexOf(word, pos + 1);
            }
//            System.out.print(pos + " ");
            if (pos >= 0) {
                if (pos == 0) newText += newWord;
                else if (pos > 0) {
                    if (i == 0) {
                        newText += text.substring(0, pos);
                    }

                    int wordStart = text.indexOf(" ", prevPos);
                    int wordFinish = text.indexOf(" ", wordStart + 1);
                    String sub = text.substring(wordStart, wordFinish + 1);
                    if (!word.equals(sub.trim())) {
                        newText += sub;
                        newText += newWord + " ";
                    } else newText += newWord;
                } else if (pos == text.length() - word.length()) {
                    newText += newWord;
                }

            } else {
                String sub = text.substring(prevPos);
                if (!word.equals(sub.trim())) {
                    System.out.println("1");
                    int wordStart = text.indexOf(" ", prevPos);
                    newText += text.substring(wordStart);
                }
                break;
            }
        }
        text = newText;
        System.out.println(text);*/


        /*String text = "liquid   template    application    text";
        System.out.println(text);
//        text = text.replaceAll("\\s+", " ");
//        System.out.println(text);
        text = text.trim();
        int firstSpace = 0;
        boolean found = false;
        for (int space = text.indexOf(" "); space < text.length(); space = text.indexOf(" ", space + 1)) {
            if (text.charAt(space + 1) == ' ') {
                if (found == false) {
                    firstSpace = space;
                    found = true;
                }
            } else {
                if (space >= 0) {
                    text = text.substring(0, firstSpace) + text.substring(space);
                    found = false;
                } else break;
            }
        }
        System.out.println(text);*/

    }
}
