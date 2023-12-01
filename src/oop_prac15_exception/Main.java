package oop_prac15_exception;

public class Main {
    public static void main(String[] args) {
        System.out.println(average(new int[]{11, 15, 19}));
        System.out.println(average(new int[]{}));
        System.out.println(average(new int[]{15, 5}));
    }

    private static int average(int[] array) {
        int sum = 0;
        for (int num : array) sum += num;
        try {
            return sum / array.length;
        } catch (ArithmeticException e) {
            return -1;
        }
    }
}
