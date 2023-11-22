package oop_prac14_compar;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Schedule {
    private List<Event> events;

    public Schedule() {
        this.events = new ArrayList<>();
    }

    public Schedule(Event... events) {
        this.events = new ArrayList<>();
        for (Event e : events) addEvent(e);
        sortSchedule();
    }

    public void addEvent(Event event) {
        LocalTime start = event.getStartTime();
        LocalTime end = start.plusMinutes(event.getDuration());

        boolean accessible = true;

        for (Event e : events) {
            LocalTime startCurrent = e.getStartTime();
            LocalTime endCurrent = startCurrent.plusMinutes(e.getDuration());

            if ((start.compareTo(startCurrent) > 0 && start.compareTo(endCurrent) < 0) ||
                    (end.compareTo(startCurrent) > 0 && end.compareTo(endCurrent) < 0)) {
                accessible = false;
                break;
            }

            if (end.compareTo(startCurrent) <= 0) break;
        }

        if (accessible) {
            events.add(event);
            sortSchedule();
        }
    }

    public void printEvents() {
        for (Event e : events) {
            System.out.println(e);
        }
    }

    private void sortSchedule() {
        Collections.sort(events, new EventComparator());
    }
}
