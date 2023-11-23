package oop_prac14_compar;

import java.lang.reflect.Array;
import java.time.LocalTime;
import java.util.Arrays;

public class ScheduleMain {
    public static void main(String[] args) {
        Event e1 = new Event("E1", LocalTime.of(12, 0), 60);
        Event e2 = new Event("E2", LocalTime.of(13, 0), 60);
        Event e3 = new Event("E3", LocalTime.of(14, 30), 60);
        Event e4 = new Event("E4", LocalTime.of(10, 30), 50);
        Event e5 = new Event("E5", LocalTime.of(9, 0), 10);
        Event e6 = new Event("E6", LocalTime.of(9, 5), 10);
        Event[] events = new Event[]{e4, e2, e3, e1, e5, e6};

        Schedule sc = new Schedule(events);

        sc.printEvents();
        System.out.println();
        System.out.println(sc.nearestEvent(LocalTime.of(23, 10)));
    }
}
