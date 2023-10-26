package oop_prac7_my_list;

public interface MyList {
    void add(String str);

    void add(int index, String str);

    String get(int index);

    void set(int index, String str);

    void remove(int index);

    boolean contains(String str);

    int indexOf(String str);

    int lastIndexOf(String str);

    void sort();

    int size();

    String[] toArray();
}
