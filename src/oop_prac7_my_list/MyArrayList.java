package oop_prac7_my_list;

// shift + f6
public class MyArrayList extends MyListAbst {
    private String words[];
    private int size;
    private int arraySize;

    public MyArrayList() {
        arraySize = 5;
        words = new String[arraySize];
        size = 0;
    }

    private void newArray() {
        arraySize *= 2;
        String[] newWords = new String[arraySize];
        for (int i = 0; i < words.length; i++) {
            newWords[i] = words[i];
        }
        words = newWords;
    }

    public void add(String str) {
        if (size == words.length) {
            newArray();
        }
        words[size++] = str;
    }

    public void add(int index, String str) {
        if (index >= 0 && index <= size) {
            if (size == words.length) {
                newArray();
            }
            for (int i = size; i >= index + 1; i--) {
                words[i] = words[i - 1];
            }
            words[index] = str;
            size++;
        } else {
            System.out.println("Error");
        }
    }

    public String get(int index) {
        if (index < size && index >= 0) {
            return words[index];
        } else {
            return "Error";
        }
    }

    @Override
    public void set(int index, String str) {
        if (index > 0 && index <= size - 1) {
            words[index] = str;
        }
    }

    public void remove(int index) {
        if (index < size && index >= 0) {
            for (int i = index; i < size - 1; i++) {
                words[i] = words[i + 1];
            }
            words[size - 1] = null;
            size--;
        } else {
            System.out.println("Error");
        }
    }

    public boolean contains(String str) {
        if (str != null) {
            for (int i = 0; i < size; i++) {
                if (words[i].equals(str)) return true;
            }
            return false;
        }
        return false;
    }

    public int indexOf(String str) {
        for (int i = 0; i < size; i++) {
            if (words[i].equals(str)) return i;
        }
        return -1;
    }

    public int lastIndexOf(String str) {
        for (int i = size - 1; i >= 0; i--) {
            if (words[i].equals(str)) return i;
        }
        return -1;
    }

    @Override
    public void sort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = size - 1; j > i; j--) {
                if (words[j].compareTo(words[j-1]) < 0) {
                    String temp = words[j];
                    words[j] = words[j-1];
                    words[j-1] = temp;
                }
            }
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String[] toArray() {
        String[] array = new String[size];
        for (int i = 0; i < size; i++) {
            array[i] = words[i];
        }
        return array;
    }

    @Override
    public String toString() {
        String str = "[";
        for (int i = 0; i < size; i++) {
            if (i == size - 1) str += words[i] + "]";
            else str += words[i] + ", ";
        }
        return str;
    }

    public void arrayDem() {
        for (String s : words) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

}
