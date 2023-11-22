package oop_prac14_compar;

import java.time.LocalTime;

public class Event {
    private String name;
    private LocalTime startTime;
    private int duration;

    public Event(String name, LocalTime startTime, int duration) {
        this.name = name;
        this.startTime = startTime;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getName());
        sb.append(": ");
        sb.append(getStartTime());
        sb.append("-");
        sb.append(getStartTime().plusMinutes(getDuration()));

        return sb.toString();
    }
}
