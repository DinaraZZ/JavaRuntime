package oop_prac16_generic;

import java.util.Comparator;

public interface MyList<T> {
    void add(T value);

    void add(int index, T value);

    Object get(int index);

    void set(int index, T value);

    void remove(int index);

    boolean contains(T value);

    int indexOf(T value);

    int lastIndexOf(T value);

    void sort(Comparator<T> comparator);

    int size();

    T[] toArray();
}
