package oop_prac8;

import java.util.ArrayList;
import java.util.List;

public class Phonebook {
    private List<Contact> contacts;

    public Phonebook() {
        this.contacts = new ArrayList<>();
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void addContact(Contact contact) {
        if (!contacts.contains(contact)) contacts.add(contact);
    }

    public List<Contact> findContact(String phoneStr) throws ContactsNotFoundException {
        List<Contact> contactList = new ArrayList<>();
        for (Contact c : contacts) {
            if (c.getPhone().contains(phoneStr)) contactList.add(c);
        }
        if (contactList.size() > 0) return contactList;
        throw new ContactsNotFoundException("ContactsNotFoundException");
    }

    public int quantityByGroup(String group) {
        int num = 0;
        for (Contact c : contacts) {
            if (c.getGroup().equals(group)) num++;
        }
        return num;
    }

    @Override
    public String toString() {
        String str = "";
        for (Contact c : contacts) {
            str += c.getName() + ": " + c.getPhone() + " (" + c.getGroup() + ")\n";
        }
        return str;
    }
}
