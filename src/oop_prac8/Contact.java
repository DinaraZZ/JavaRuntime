package oop_prac8;

import java.util.Objects;

public class Contact {
    private String name;
    private String phone;
    private String group;

    public Contact(String name, String phone, String group) {
        this.name = name;
        this.phone = phone;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(name, contact.name) && Objects.equals(phone, contact.phone) && Objects.equals(group, contact.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone, group);
    }

    @Override
    public String toString() {
        return name + ": " + phone + " (" + group + ")";
    }
}
