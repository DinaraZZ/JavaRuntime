package oop_prac14_compar;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Schedule {
    private List<Event> events;

    public Schedule() {
        this.events = new ArrayList<>();
    }

    public Schedule(Event... events) {
        this.events = new ArrayList<>();

        for (Event e : events)
            try {
                addEventAnother(e);
            } catch (DeclinedEventException exception) {
                System.out.println(exception.getMessage());
            }

//        sortSchedule();
    }

    public void addEvent(Event event) {
        // event to add start
        LocalTime start = event.getStartTime();
        // event to add end
        LocalTime end = start.plusMinutes(event.getDuration());

        boolean accessible = true;

        for (Event e : events) {
            LocalTime startCurrent = e.getStartTime();
            LocalTime endCurrent = startCurrent.plusMinutes(e.getDuration());

            // event to add -> 12:00 - 14:00
            // current event -> 11:00 - 12:10
            // 12:00 > 11:00 && 12:00 < 12:10 -> true

            // event to add -> 12:00 - 14:00
            // current event -> 13:50 - 14:30
            // 12:00 > 13:50 && 12:00 < 14:30 -> false
            // 14:00 > 13:50 && 14:00 < 14:30 -> true

            if ((start.compareTo(startCurrent) >= 0 && start.compareTo(endCurrent) < 0) ||
                    (end.compareTo(startCurrent) > 0 && end.compareTo(endCurrent) <= 0)) {
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

    public void addEventAnother(Event event) throws DeclinedEventException {
        // event to add start
        LocalTime start = event.getStartTime();
        // event to add end
        LocalTime end = start.plusMinutes(event.getDuration());

        boolean declined = false;

        if (events.size() == 0) events.add(event);
        else if (events.size() == 1) {
            if (end.compareTo(events.get(0).getStartTime()) <= 0) events.add(0, event);
            else if (start.compareTo(events.get(0).getStartTime().plusMinutes(events.get(0).getDuration())) >= 0)
                events.add(event);
            else declined = true;
        } else {
            for (int i = 0; i < events.size(); i++) {
                LocalTime startCurrent = events.get(i).getStartTime();
                LocalTime endCurrent = startCurrent.plusMinutes(events.get(i).getDuration());
                if (i == 0) {
                    if (end.compareTo(startCurrent) <= 0) {
                        events.add(0, event);
                        break;
                    } else declined = true;
                } else {
                    LocalTime startPrevios = events.get(i - 1).getStartTime();
                    LocalTime endPrevios = startPrevios.plusMinutes(events.get(i - 1).getDuration());

                    if (i == events.size() - 1) {
                        if (start.compareTo(endCurrent) >= 0) {
                            events.add(event);
                            break;
                        }
                    }
                    if (end.compareTo(startCurrent) <= 0 && start.compareTo(endPrevios) >= 0) {
                        events.add(i, event);
                        break;
                    } else declined = true;
                }
            }
        }
        if (declined) throw new DeclinedEventException(event);
    }

    public Event nearestEvent(LocalTime time) {
        for (Event e : events) {
            if (e.getStartTime().compareTo(time) >= 0) return e;
        }
        return null;
    }

    public Event findClosestEvent(LocalTime time) {
        if (events.size() == 0) return null;

        Event closestEvent = events.get(0);
        long minMinutes = Math.abs(Duration.between(closestEvent.getStartTime(), time).toMinutes());

        for (Event e : events) {
            long duration = Math.abs(Duration.between(e.getStartTime(), time).toMinutes());
            if (duration < minMinutes) {
                closestEvent = e;
                minMinutes = duration;
            }
        }

        return closestEvent;
    }

    public Event[] threeLongestEvents() {
        int size = events.size();
        if (size == 0) return null;

        Event[] longestEvents;
        List<Event> tempEvents = new ArrayList<>(events);
        tempEvents.sort(new EventDurationComparator());

        if (size >= 3) {
            longestEvents = new Event[3];
            for (int i = 0; i < 3; i++) longestEvents[i] = tempEvents.get(i);
        } else if (size == 1) {
            longestEvents = new Event[1];
            longestEvents[0] = events.get(0);
        } else {
            longestEvents = new Event[size];
            for (int i = 0; i < size; i++) longestEvents[i] = tempEvents.get(i);
        }
        return longestEvents;
    }

    public void checkFreeTimeFor(Event... checkEvents) {
        boolean free = true;
        List<Event> notFreeEvents = new ArrayList<>();

        for (Event e : checkEvents) {
            Event rightEvent = nearestEvent(e.getStartTime());
            int index = events.indexOf(rightEvent);

            LocalTime endTime = e.getStartTime().plusMinutes(e.getDuration());

            if (rightEvent != null) {
                if (index == 0) {
                    if (endTime.compareTo(rightEvent.getStartTime()) > 0) {
                        free = false;
                        notFreeEvents.add(e);
                    }
                } else {
                    Event leftEvent = events.get(index - 1);
                    LocalTime endLeft = leftEvent.getStartTime().plusMinutes(leftEvent.getDuration());
                    if (e.getStartTime().compareTo(endLeft) < 0 || endTime.compareTo(rightEvent.getStartTime()) > 0) {
                        free = false;
                        notFreeEvents.add(e);
                    }
                }
            }
        }

        if (!free) {
            throw NoFreeTimeException.of(notFreeEvents);
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
