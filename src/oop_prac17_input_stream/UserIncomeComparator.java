package oop_prac17_input_stream;

import java.util.Comparator;

public class UserIncomeComparator implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        return Integer.compare(Integer.parseInt(o1.income), Integer.parseInt(o2.income));
    }
}
