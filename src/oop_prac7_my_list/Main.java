package oop_prac7_my_list;

public class Main {
    public static void main(String[] args) {
        MyList myList = new MyLinkedList();

        myList.add("5");
        myList.add("4");
        myList.add("a");
        myList.add("$");
        myList.add("7");

        MyList myList2 = new MyArrayList();
        myList2.add("5");
        myList2.add("4");
        myList2.add("a");
        myList2.add("$");
        myList2.add("7");

        System.out.println(myList.equals(myList2));
        System.out.println(myList.hashCode());
        System.out.println(myList2.hashCode());
    }
}
