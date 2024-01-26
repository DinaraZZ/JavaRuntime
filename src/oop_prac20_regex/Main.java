package oop_prac20_regex;

public class Main {
    public static void main(String[] args) {
        String ip = "23.7.115.26";
        boolean match = ip.matches("^(\\d{1,3}\\.){3}\\d{1,3}$");
        System.out.println(match);
        //matches проверяет всю строку, ^$ по умолчанию

        String phone = "+7 (707) 282-86-89";
        match = phone.matches("^\\+\\d\\s\\(\\d{3}\\)\\s\\d{3}-\\d{2}-\\d{2}$");
        System.out.println(match);
    }
}
