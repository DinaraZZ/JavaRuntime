package oop_prac16_generic;

import java.util.Comparator;

// shift + f6
public class MyArrayList<T> extends MyListAbst<T> {
    private T values[];
    private int size;
    private int arraySize;

    public MyArrayList() {
        arraySize = 5;
        Object[] array = new Object[arraySize];
        values = (T[]) array;
        size = 0;
    }

    private void newArray() {
        arraySize *= 2;
        Object[] newValues = new Object[arraySize];
        for (int i = 0; i < values.length; i++) {
            newValues[i] = values[i];
        }
        values = (T[]) newValues;
    }

    public void add(T str) {
        if (size == values.length) {
            newArray();
        }
        values[size++] = str;
    }

    public void add(int index, T str) {
        if (index >= 0 && index <= size) {
            if (size == values.length) {
                newArray();
            }
            for (int i = size; i >= index + 1; i--) {
                values[i] = values[i - 1];
            }
            values[index] = str;
            size++;
        } else {
            System.out.println("Error");
        }
    }

    public T get(int index) {
        if (index < size && index >= 0) {
            return (T) values[index];
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public void set(int index, T value) {
        if (index > 0 && index <= size - 1) {
            values[index] = value;
        }
    }

    public void remove(int index) {
        if (index < size && index >= 0) {
            for (int i = index; i < size - 1; i++) {
                values[i] = values[i + 1];
            }
            values[size - 1] = null;
            size--;
        } else {
            System.out.println("Error");
        }
    }

    public boolean contains(T str) {
        if (str != null) {
            for (int i = 0; i < size; i++) {
                if (values[i].equals(str)) return true;
            }
            return false;
        }
        return false;
    }

    public int indexOf(T value) {
        for (int i = 0; i < size; i++) {
            if (values[i].equals(value)) return i;
        }
        return -1;
    }

    public int lastIndexOf(T value) {
        for (int i = size - 1; i >= 0; i--) {
            if (values[i].equals(value)) return i;
        }
        return -1;
    }

    @Override
    public void sort(Comparator<T> comparator) {
        for (int i = 0; i < size - 1; i++) {
            for (int j = size - 1; j > i; j--) {
                if (comparator.compare((T) values[j], (T) values[j - 1]) < 0) {
                    T temp = values[j];
                    values[j] = values[j - 1];
                    values[j - 1] = temp;
                }
            }
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T[] toArray() {
        Object[] array = new Object[size];
        for (int i = 0; i < size; i++) {
            array[i] = values[i];
        }
        return (T[]) array;
    }

    @Override
    public String toString() {
        String str = "[";
        for (int i = 0; i < size; i++) {
            if (i == size - 1) str += values[i] + "]";
            else str += values[i] + ", ";
        }
        return str;
    }

    public void arrayDem() {
        for (T s : values) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

}
