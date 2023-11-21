package oop_prac14_compar;

import java.time.LocalTime;

public class ScheduleMain {
    public static void main(String[] args) {
        Event e1 = new Event("E1", LocalTime.of(12, 00), 60);
        Event e2 = new Event("E2", LocalTime.of(13, 00), 60);
        Event e3 = new Event("E3", LocalTime.of(13, 30), 60);
        Event[] events = new Event[]{e1, e2, e3};

        Schedule sc = new Schedule();

        sc.printEvents();
        sc.addEvent(e1);
        sc.addEvent(e2);

        sc.printEvents();
    }
}
