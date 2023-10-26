package ne_oop;

public class MyArrays {
    public static void main(String[] args) {
        /*
        int[] array = new int[]{1, -2, 3, -4, 5, -6, 7,-8};
//        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7,8};

        System.out.print("1: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.print("2: ");
        for (int i = 1; i < array.length-1; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.print("3: ");
        for (int i = 1; i < array.length; i+=2) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.print("4: ");
        for (int i = 0; i < array.length/2; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.print("5: ");
        for (int i = array.length/2; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.print("6: ");
        for (int i = array.length - 3; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.print("7: ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int negNum = 0;
        System.out.print("8: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) negNum++;
        }
        System.out.println("Количество отрицательных чисел: " + negNum);

        negNum = 0;
        int posNum = 0;
        System.out.print("9: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) negNum++;
            else if (array[i] > 0) posNum++;
        }
        System.out.println("\tКоличество отрицательных чисел: " + negNum);
        System.out.println("\tКоличество положительных чисел: " + posNum);
        if (posNum > negNum) System.out.println("\tПоложительных чисел больше");
        else if (posNum < negNum) System.out.println("\tОтрицательных чисел больше");
        else System.out.println("\tКоличество положительных и отрицательных чисел равно");

        int temp;
        System.out.print("10: ");
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i-1]) {
                    temp = array[i];
                System.out.print(temp + " ");
            }
        }
        System.out.println();

        boolean flag = true;
        System.out.print("11: ");
        for (int i = 1; i < array.length; i++) {
            if (array[i] <= array[i-1]) {
                flag = false;
                break;
            }
        }
        if (flag) System.out.println("Массив возрастающий");
        else System.out.println("Массив не возрастающий");
*/

/////////////////
        /*
        int[] num1 = {1, 2, 3, 54, 54, 87};
        int[] num2 = {98, 22, 4, 5};
        int[] num3 = new int[num1.length/2 + num2.length/2];

//        int min = num1[0];

        *//*for(int i = 0, j = num2.length/2; i < num3.length; i++) {
            if(i < num1.length/2) num3[i] = num1[i];
            else {
                num3[i] = num2[j];
                j++;
            }
        }*//*
        int num3Pos = 0;

        for (int i = 0; i < num1.length/2; i++) {
            num3[num3Pos++] = num1[i];
        }

        for (int i = num2.length / 2; i < num2.length; i++) {
            num3[num3Pos++] = num2[i];
        }

        for (int i = 0; i < num3.length; i++) System.out.print(num3[i] + " ");


        ///////////////// int[] num1 = {1, 2, 3, 54, 32, 87};
        int min = num1[0];
        int max = num1[0];
        int minPos = 0;
        int maxPos = 0;
        for(int i = 1; i < num1.length; i++) {
            if (num1[i] < min) {
                min = num1[i];
                minPos = i;
            }
            if (num1[i] > max) {
                max = num1[i];
                maxPos = i;
            }
        }
        System.out.println();
        System.out.println(min + " " + max + " " + minPos + " " + maxPos);
        /////////////////
        num1[minPos] = max;
        num1[maxPos] = min;

        for (int i = 0; i < num1.length; i++) System.out.print(num1[i] + " ");
*/
        /////////////////
        /*int[] num1 = {87, 2, 3, 54, 4, 87};
        boolean uniqueArr = true;

        for (int i = 0; i < num1.length - 1; i++) {
            if (!uniqueArr) break;
            for (int j = i + 1; j < num1.length; j++) {
                if (num1[i] == num1[j]) {
                    uniqueArr = false;
                    break;
                }
            }
        }

        System.out.println();
        System.out.println(uniqueArr);*/

        //////////////////////////
/*

        int[] nums = new int[]{1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1};

        int maxOne = 0;
        int temp = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                temp++;
                if (i == nums.length - 1) { maxOne = temp;}
            } else {
                System.out.println(maxOne + ", " + temp);
                if (temp > maxOne) { maxOne = temp; }
                temp = 0;
            }
        }
        System.out.println(maxOne);
*/


//////////////////////////

        /*
        int[] num1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] tempArr = new int[num1.length];

        for (int i = 0; i < num1.length; i++) {
            tempArr[i] = num1[i];
        }

        for (int i = 0, j = num1.length - 1; i < num1.length; i++, j--) {
            num1[i] = tempArr[j];
        }

        for (int i = 0; i < num1.length; i++) System.out.print(num1[i] + " ");
*/







    }
}













