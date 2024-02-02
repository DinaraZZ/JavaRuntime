package oop_prac20_regex;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main3Parser {
    public static void main(String[] args) {
        // 1
        /*String path = "https://vkgw/ha";
        UrlParser urlParser = new UrlParser(path);
        System.out.println(urlParser.getProtocol());
        System.out.println(urlParser.getHost());
        System.out.println(urlParser.getUri());*/

        // 2
        String number = "54759501.54";
        int count = 0;
        String leftNumbers = number;
        String fraction = "";
        String parsedNumber = "";
        Pattern pattern = Pattern.compile("^(\\d{1,2})?((\\d{3})*)(\\.\\d+)?$");
        Matcher matcher = pattern.matcher(number);
        if (matcher.find()) {
            if (matcher.group(1) != null) parsedNumber = matcher.group(1);
            leftNumbers = matcher.group(2);
            fraction = matcher.group(4);
        }
        for (int i = 0; i < leftNumbers.length(); i += 3) parsedNumber += " " + leftNumbers.substring(i, i + 3);
        if (count > 0) {
            if (fraction != null) {
                if (fraction.length() >= count + 1) parsedNumber += "," + fraction.substring(1, count + 1);
                else parsedNumber += "," + fraction.substring(1) + "0".repeat(count - fraction.length() + 1);
            } else {
                parsedNumber += "," + "0".repeat(count);
            }
        }
        System.out.println(parsedNumber.trim());

    }
}
