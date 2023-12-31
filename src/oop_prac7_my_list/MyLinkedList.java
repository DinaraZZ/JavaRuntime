package oop_prac7_my_list;

public class MyLinkedList extends MyListAbst {

    private Node first;
    private Node last;
    private int size;

    private Node getNodeByIndex(int index) {
//        if (index < 0 || index >= size) return null;
        Node n = first;
        for (int i = 0; i < index; i++) {
            n = n.getNext();
        }
        return n;
    }

    @Override
    public void add(String str) {
        if (size == 0) {
            Node n = new Node(null, null, str);
            first = n;
            last = n;
        } else {
            Node n = new Node(last, null, str);
            last.setNext(n);
            last = n;
        }
        size++;
    }

    @Override
    public void add(int index, String str) {
        if (index < 0 || index > size) return;
        Node n = new Node(null, null, str);
        if (index == 0) {
            n.setNext(first);
            first.setPrev(n);
            first = n;
        } else if (index == size) {
            n.setPrev(last);
            last.setNext(n);
            last = n;
        } else {
            Node p = getNodeByIndex(index);
            /*for (int i = 0; i < index; i++) {
                p = p.getNext();
            }*/
            n.setPrev(p.getPrev());
            n.setNext(p);
            p.getPrev().setNext(n);
            p.setPrev(n);
        }
        size++;
    }

    @Override
    public String get(int index) {
        if (index < 0 || index >= size) return "Error";
        Node n = getNodeByIndex(index);
        /*for (int i = 0; i < index; i++) {
            n = n.getNext();
        }*/
        return n.getValue();
    }

    @Override
    public void set(int index, String str) {
        if (index < 0 || index >= size) return;
        else {
            Node n = getNodeByIndex(index);
            /*for (int i = 0; i < index; i++) {
                n = n.getNext();
            }*/
            n.setValue(str);
        }
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= size) return;
        if (index == 0) {
            first = first.getNext();
            first.setPrev(null);
        } else if (index == size - 1) {
            last = last.getPrev();
            last.setNext(null);
        } else {
            Node n = getNodeByIndex(index);
            /*for (int i = 0; i < index; i++) {
                n = n.getNext();
            }*/
            Node prev = n.getPrev();
            Node next = n.getNext();
            prev.setNext(next);
            next.setPrev(prev);
        }
        size--;
    }

    @Override
    public boolean contains(String str) {
        Node n = first;
        for (int i = 0; i < size; i++) {
            if (n.getValue().equals(str)) return true;
            n = n.getNext();
        }
        return false;
    }

    @Override
    public int indexOf(String str) {
        Node n = first;
        for (int i = 0; i < size; i++) {
            if (n.getValue().equals(str)) return i;
            n = n.getNext();
        }
        return -1;
    }

    @Override
    public int lastIndexOf(String str) {
        Node n = last;
        for (int i = size - 1; i >= 0; i--) {
            if (n.getValue().equals(str)) return i;
            n = n.getPrev();
        }
        return -1;
    }

    @Override
    public void sort() {
        Node n = last;
        for (int i = 0; i < size - 1; i++) {
            for (int j = size - 1; j > i; j--) {
                if (n.getValue().compareTo(n.getPrev().getValue()) < 0) {
                    String temp = n.getValue();
                    n.setValue(n.getPrev().getValue());
                    n.getPrev().setValue(temp);
                }
                n = n.getPrev();
            }
            n = last;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String[] toArray() {
        String[] arr = new String[size];
        Node n = first;
        for (int i = 0; i < size; i++) {
            arr[i] = n.getValue();
            n = n.getNext();
        }
        return arr;
    }

    @Override
    public String toString() {
        String str = "[";
        Node n = first;
        do {
            if (n == last) str += n.getValue() + "]";
            else str += n.getValue() + ", ";
            n = n.getNext();
        } while (n != null);
        return str;
    }
}