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

        String text = "word apple pear test word pear pear";
        String word = "pear";

        int count = 0;
        int pos = 0;
        for (int i = 0; i < text.length(); i++) {
            if (i == 0) pos = text.indexOf(word, 0);
            else pos = text.indexOf(word, pos + 1);
            if (pos >= 0) count++;
            else break;
        }
        System.out.println(count);
    }
}
