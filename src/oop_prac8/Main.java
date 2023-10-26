package oop_prac8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Contact c1 = new Contact("Name1", "87015555555", "Friend");
        Contact c2 = new Contact("Name2", "87015556768", "Fam");
        Contact c3 = new Contact("Name3", "87775556492", "Fam");
        Contact c4 = new Contact("Name3", "87775556492", "Fam");

        Phonebook phonebook = new Phonebook();
        phonebook.addContact(c1);
        phonebook.addContact(c2);
        phonebook.addContact(c3);
        phonebook.addContact(c4);

        System.out.println(phonebook);

        try {
            System.out.println(phonebook.findContact("0"));
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println(phonebook.quantityByGroup("-"));
    }
}
