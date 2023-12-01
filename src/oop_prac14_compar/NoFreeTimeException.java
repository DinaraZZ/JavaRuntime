package oop_prac14_compar;

import java.util.List;

public class NoFreeTimeException extends RuntimeException {
    private NoFreeTimeException(String message, List<Event> events) {
        super(message);
    }

    public static NoFreeTimeException of(List<Event> events) {
        StringBuilder sb = new StringBuilder();
        sb.append("Нет свободного времени в расписании для событий: ");
        for (Event e : events) {
            if (events.indexOf(e) != events.size() - 1) {
                sb.append(e.getName() + ", ");
            } else sb.append(e.getName());
        }
        return new NoFreeTimeException(sb.toString(), events);
    }
}
