package oop_prac14_compar;

public class DeclinedEventException extends Exception {
    DeclinedEventException() {
        super("Событие не добавлено в расписание");
    }

    DeclinedEventException(Event e) {
        super("Событие %s не добавлено в расписание".formatted(e.getName()));
    }
}
