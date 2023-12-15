package oop_prac16_generic;


import java.util.Comparator;

public class MyLinkedList<T> extends MyListAbst<T> {

    private Node<T> first;
    private Node<T> last;
    private int size;

    private Node<T> getNodeByIndex(int index) {
//        if (index < 0 || index >= size) return null;
        Node<T> n = first;
        for (int i = 0; i < index; i++) {
            n = n.getNext();
        }
        return n;
    }

    @Override
    public void add(T value) {
        if (size == 0) {
            Node<T> n = new Node<>(null, null, value);
            first = n;
            last = n;
        } else {
            Node<T> n = new Node<>(last, null, value);
            last.setNext(n);
            last = n;
        }
        size++;
    }

    @Override
    public void add(int index, T value) {
        if (index < 0 || index > size) return;
        Node<T> n = new Node<>(null, null, value);
        if (index == 0) {
            n.setNext(first);
            first.setPrev(n);
            first = n;
        } else if (index == size) {
            n.setPrev(last);
            last.setNext(n);
            last = n;
        } else {
            Node<T> p = getNodeByIndex(index);
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
    public T get(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        Node<T> n = getNodeByIndex(index);
        /*for (int i = 0; i < index; i++) {
            n = n.getNext();
        }*/
        return n.getValue();
    }//////////

    @Override
    public void set(int index, T value) {
        if (index < 0 || index >= size) return;
        else {
            Node<T> n = getNodeByIndex(index);
            /*for (int i = 0; i < index; i++) {
                n = n.getNext();
            }*/
            n.setValue(value);
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
            Node<T> n = getNodeByIndex(index);
            /*for (int i = 0; i < index; i++) {
                n = n.getNext();
            }*/
            Node<T> prev = n.getPrev();
            Node<T> next = n.getNext();
            prev.setNext(next);
            next.setPrev(prev);
        }
        size--;
    }

    @Override
    public boolean contains(T value) {
        Node<T> n = first;
        for (int i = 0; i < size; i++) {
            if (n.getValue().equals(value)) return true;
            n = n.getNext();
        }
        return false;
    }

    @Override
    public int indexOf(T value) {
        Node<T> n = first;
        for (int i = 0; i < size; i++) {
            if (n.getValue().equals(value)) return i;
            n = n.getNext();
        }
        return -1;
    }

    @Override
    public int lastIndexOf(T value) {
        Node<T> n = last;
        for (int i = size - 1; i >= 0; i--) {
            if (n.getValue().equals(value)) return i;
            n = n.getPrev();
        }
        return -1;
    }

    @Override
    public void sort(Comparator<T> comparator) {
        Node<T> n = last;
        for (int i = 0; i < size - 1; i++) {
            for (int j = size - 1; j > i; j--) {
                if (comparator.compare(n.getValue(), n.getPrev().getValue()) < 0) {
                    T temp = n.getValue();
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
    public T[] toArray() {
        Object[] arr = new Object[size];
        Node<T> n = first;
        for (int i = 0; i < size; i++) {
            arr[i] = n.getValue();
            n = n.getNext();
        }
        return (T[]) arr;
    }

    @Override
    public String toString() {
        String str = "[";
        Node<T> n = first;
        do {
            if (n == last) str += n.getValue() + "]";
            else str += n.getValue() + ", ";
            n = n.getNext();
        } while (n != null);
        return str;
    }
}