package oop_prac14_compar;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Schedule {
    private List<Event> events;

    public Schedule() {
        this.events = new ArrayList<>();
    }

    public Schedule(Event... events) {
        this.events = new ArrayList<>(Arrays.stream(events).toList());
    }

    public void addEvent(Event event) {
        LocalTime start = event.getStartTime();
        LocalTime end = start.plusMinutes(event.getDuration());
        if (events.size() == 0) {
            events.add(event);
        } else {
            for (Event e : events) {
                LocalTime startCurrent = e.getStartTime();
                LocalTime endCurrent = startCurrent.plusMinutes(e.getDuration());

                if (start.compareTo(startCurrent) < 0) {
                    if (end.compareTo(start) <= 0) events.add(event);
                    else break;
                } else if (start.compareTo(startCurrent) > 0) {
                    if (start.compareTo(endCurrent) >= 0) events.add(event);
                    else break;
                } else break;
            }
        }
    }

    public void printEvents() {
        for (Event e : events) {
            StringBuilder sb = new StringBuilder();
            sb.append(e.getName());
            sb.append(": ");
            sb.append(e.getStartTime());
            sb.append("-");
            sb.append(e.getStartTime().plusMinutes(e.getDuration()));
            System.out.println(sb);
        }
    }
}
