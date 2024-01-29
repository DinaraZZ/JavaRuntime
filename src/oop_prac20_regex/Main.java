package oop_prac20_regex;

public class Main {
    public static void main(String[] args) {
        String ip = "23.7.115.26";
        String regex = "^(\\d{1,3}\\.){3}\\d{1,3}$";
        System.out.println(ip.matches(regex));
        //matches проверяет всю строку, ^$ по умолчанию

        String phone = "+7 (707) 282-86-89";
        regex = "^\\+\\d\\s\\(\\d{3}\\)\\s\\d{3}-\\d{2}-\\d{2}$";
        System.out.println(phone.matches(regex));

        String dateTime = "2024/01/23 14:15";
        regex = "^\\d{4}/[0-1]\\d/[1-3]\\d\\s[0-2]\\d(:[0-5]\\d){1,2}$";
        System.out.println(dateTime.matches(regex));
        dateTime = "2024/01/23 14:15:13";
        System.out.println(dateTime.matches(regex));

        String login = "_login";
        regex = "^[a-z_]\\w{4,}$";
        System.out.println(login.matches(regex));

        String text = "template    liquid        application";
        regex = "\\s+";
        text = text.replaceAll(regex, " ");
        System.out.println(text);

        text = "exodus liquid xenon sleep tax map matrix";
        regex = "[a-z]*x[a-z]*";
        text = text.replaceAll(regex, "!");
        System.out.println(text);

        text = "teliquid terminate map template letter";
        regex = "(^|\\s)te[a-z]*"; // начало строки или пробел
        text = text.replaceAll(regex, " !").trim();
        System.out.println(text);

        String path = "http://google.com";
        regex = "https?://[a-z\\d-]+\\.com(/[a-z\\d-]+)*";
        System.out.println(path.matches(regex));
        path = "https://vk.com/gw/ha";
        System.out.println(path.matches(regex));
    }
}
