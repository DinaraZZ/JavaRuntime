package oop_prac14_compar;

import java.lang.reflect.Array;
import java.time.LocalTime;
import java.util.Arrays;

public class ScheduleMain {
    public static void main(String[] args) {
        Event e1 = new Event("E1", LocalTime.of(12, 00), 60);
        Event e2 = new Event("E2", LocalTime.of(13, 00), 60);
        Event e3 = new Event("E3", LocalTime.of(14, 30), 60);
        Event e4 = new Event("E4", LocalTime.of(10, 30), 50);
        Event[] events = new Event[]{e1, e2, e3, e4};

        Schedule sc = new Schedule(events);

//        sc.printEvents();
//        sc.addEvent(e1);
//        sc.addEvent(e3);
//        sc.addEvent(e2);
//        sc.addEvent(e4);

        /*for (Event e: events) System.out.println(e);
        Arrays.sort(events, new EventComparator());
        System.out.println();
        for (Event e: events) System.out.println(e);*/


        sc.printEvents();
    }
}
