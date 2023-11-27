package oop_prac14_compar;

public class Main2 {

    public static void main(String[] args) {
        int[] nums = new int[]{
                7, -5, -6, 11, -9, 22, -13, -8, 3
        };

        // Вывести последние 3 торицательных числа с сохранением их порядка в массиве nums.
        // Ожидаемый результат: -9, -13, -8

        int count = 0;
        int index = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < 0) {
                count++;
                index = i;
            }
            if (count == 3) break;
        }

        for (int i = index; i < nums.length; i++)
            if (nums[i] < 0) System.out.print(nums[i] + " ");


        /*int[] negativeNums;

        if (nums.length >= 3) {
            negativeNums = new int[3];
            int count = 0;
            for (int i = nums.length - 1, j = 0; i >= 0; i--) {
                if (nums[i] < 0) {
                    negativeNums[j] = nums[i];
                    count++;
                    j++;
                }
                if (count == 3) break;
            }
            if (count < 3) {
                int[] tempNegativeNums = new int[count]; // 3, 2
                for (int i = negativeNums.length - 1, j = 0; i >= negativeNums.length - count)
                    tempNegativeNums[j]
            }

        } else if (nums.length > 0) {
            negativeNums = new int[nums.length];
        }

        for (int i = negativeNums.length - 1; i >= 0; i--) System.out.print(negativeNums[i] + " ");*/

    }
}
