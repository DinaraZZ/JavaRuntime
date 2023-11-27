package oop_prac14_compar;

import java.util.Comparator;

public class EventDurationComparator implements Comparator<Event> {
    @Override
    public int compare(Event o1, Event o2) {
        return Integer.compare(o2.getDuration(), o1.getDuration());
    }
}
