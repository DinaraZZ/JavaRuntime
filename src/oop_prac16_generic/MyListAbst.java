package oop_prac16_generic;

import java.util.Arrays;

public abstract class MyListAbst<T> implements MyList<T> {
    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (!(obj instanceof MyList)) return false;
        MyList myList = (MyList) obj;
        if (size() != myList.size()) return false;
        for (int i = 0; i < size(); i++) {
            if (!get(i).equals(myList.get(i))) return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        T[] arr = toArray();
        for (T s : arr) {
            System.out.print(s + " ");
        }
        System.out.println();
        return Arrays.hashCode(arr);
    }
}
