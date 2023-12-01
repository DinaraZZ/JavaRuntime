package oop_prac14_compar;

import java.lang.reflect.Array;
import java.time.LocalTime;
import java.util.Arrays;

public class ScheduleMain {
    public static void main(String[] args) {
        Event e1 = new Event("E1", LocalTime.of(12, 0), 10);
        Event e2 = new Event("E2", LocalTime.of(13, 0), 16);
        Event e3 = new Event("E3", LocalTime.of(14, 30), 56);
        Event e4 = new Event("E4", LocalTime.of(10, 30), 50);
        Event e5 = new Event("E5", LocalTime.of(9, 0), 10);
        Event e6 = new Event("E6", LocalTime.of(9, 5), 10);
        Event[] events = new Event[]{e1, e2, e3, e4, e5, e6};

        Schedule sc = new Schedule(events);

        sc.printEvents();
        /*System.out.println();
        System.out.println(sc.nearestEvent(LocalTime.of(23, 10)));
        System.out.println(sc.findClosestEvent(LocalTime.of(23, 30)));
        System.out.println();*/

        System.out.println();
        /*Event[] longest = sc.threeLongestEvents();
        if (longest != null) {
            for (Event e : longest) {
                StringBuilder builder = new StringBuilder();
                builder.append(e.getName());
                builder.append(": ");
                builder.append(e.getDuration());
                builder.append(" minutes");
                System.out.println(builder.toString());
            }
        } else System.out.println(longest);*/

        try {
            sc.checkFreeTimeFor(new Event("C1", LocalTime.of(12, 0), 10),
                    new Event("C2", LocalTime.of(9, 3), 5),
                    new Event("C3", LocalTime.of(16, 0), 50));
        } catch (NoFreeTimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
