package ne_oop;

public class Cycles {
    public static void main(String[] args) {
//        for (int i = 77; i < 80; i++) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//
//        for (int i = -25; i > -28; i--) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//
//        for (int i = 100; i < 301; i+=100) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//
//        for (int i = 999; i > 994; i-=2) {
//            System.out.print(i + " ");
//        }
//        System.out.println();

//        int result = 0;
//        for (int i = 2; i < 11; i++) {
//            result = i * i;
//            System.out.println(i + " * " + i + " = " + result);
//        }

//        int sum = 0;
//        for (int i = 1; i < 21; i++) {
//            sum += i;
//        }
//        System.out.println(sum);

//        int start = 13;
//        int end = 7;
//        if (end >= start) {
//            for (int i = start; i <= end; i++) {
//                System.out.print(i + " ");
//            }
//        } else {
//            for (int i = start; i > end - 1; i--) {
//                System.out.print(i + " ");
//            }
//        }

        int n1 = 2;
        int n2 = 3;
        int temp;
        for (int i = 0; i < 20; i++) {
            temp = n1 + n2;
            n1 = n2;
            n2 = temp;
            // if (i%2 == 0) n1 = temp;
            // else n2 = temp;
            System.out.print(temp + " ");
        }

    }
}
