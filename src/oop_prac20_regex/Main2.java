package oop_prac20_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main2 {
    public static void main(String[] args) {
        String text;
        Pattern pattern;
        Matcher matcher;

        // 1
        /*text = "25 text 17 5 liquid 120 22 1 map";

        pattern = Pattern.compile("\\d+");
        matcher = pattern.matcher(text);

        int sum = 0;
        while (matcher.find()) {
            sum += Integer.parseInt(matcher.group());
        }
        System.out.println(sum);*/

        // 2
        text = "z 5 2 1 b 6 7 c 8 9 z 6 2 b 1 z 3";

        pattern = Pattern.compile("z((\\s\\d+)+)");
        matcher = pattern.matcher(text);

        int sum = 0;
        while (matcher.find()) {
            Pattern pattern1 = Pattern.compile("\\d+");
            Matcher matcher1 = pattern1.matcher(matcher.group(1));
            while (matcher1.find()) sum += Integer.parseInt(matcher1.group());
        }
        System.out.println(sum);
    }
}
