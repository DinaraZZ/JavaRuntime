package oop_prac16_generic;

import java.util.Comparator;

public interface MyList<T> {
    void add(T str);

    void add(int index, T str);

    Object get(int index);

    void set(int index, T str);

    void remove(int index);

    boolean contains(T str);

    int indexOf(T str);

    int lastIndexOf(T str);

    void sort(Comparator<T> comparator);

    int size();

    T[] toArray();
}
