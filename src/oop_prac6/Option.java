package oop_prac6;

import java.util.Objects;

public class Option {
    private String str1;
    private String str2;

    public Option(String str1, String str2) {
        this.str1 = str1;
        this.str2 = str2;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Option option = (Option) obj;
        return str1.equals(option.str1) && str2.equals(option.str2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(str1, str2);
    }

    @Override
    public String toString() {
        return str1 + ": " + str2 + "\n";
    }

    public String getStr1() {
        return str1;
    }

    public String getStr2() {
        return str2;
    }
}
