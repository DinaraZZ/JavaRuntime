package oop_prac20_regex;

public class IncorrectPathException extends RuntimeException {
    @Override
    public String getMessage() {
        return "Неверный адрес";
    }
}
