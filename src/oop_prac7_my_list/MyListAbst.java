package oop_prac7_my_list;

import java.util.Arrays;

public abstract class MyListAbst implements MyList {
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
        String[] arr = toArray();
        for (String s : arr) {
            System.out.print(s + " ");
        }
        System.out.println();
        return Arrays.hashCode(arr);
    }
}
