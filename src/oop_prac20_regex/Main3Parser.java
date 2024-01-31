package oop_prac20_regex;

public class Main3Parser {
    public static void main(String[] args) {
        String path = "https://vkgw/ha";
        UrlParser urlParser = new UrlParser(path);
        System.out.println(urlParser.getProtocol());
        System.out.println(urlParser.getHost());
        System.out.println(urlParser.getUri());
    }
}
