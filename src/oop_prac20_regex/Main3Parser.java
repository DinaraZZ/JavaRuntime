package oop_prac20_regex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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
        /*String number = "54759501.54";
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
        System.out.println(parsedNumber.trim());*/

        // 3
        /*String[] array = {
                "-4.5", "liquid", "22", "7.5", "tax", "122$"
        };
        double sum = 0;
        Pattern pattern = Pattern.compile("(-?\\d+(\\.\\d+)?)");
        Matcher matcher;
        for (String value : array) {
            matcher = pattern.matcher(value);
            if (matcher.find()) sum += Double.parseDouble(matcher.group(1));
        }
        System.out.println(sum);*/

        // 4
        /*try (FileReader fileReader = new FileReader("./src/oop_prac20_regex/data.txt");
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            String regex = "^[А-Я]{1}[а-я]+\\s[А-Я]{1}[а-я]+,\\s\\d{1,3}\\sлет,\\semail:\\s\\w+@\\w+(\\.\\w+)*\\.com$";
            while ((line = bufferedReader.readLine()) != null) {
                if(line.matches(regex)) System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }*/

        // 5
        String text = "teliquid terminate map template letter";
        String regex = "(^|\\s)(te[a-z]*)"; // начало строки или пробел
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) System.out.println(matcher.group(2));
    }
}
