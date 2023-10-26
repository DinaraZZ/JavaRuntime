package ne_oop;

public class ArrayClass {

    public static void main(String[] args) {
        System.out.println(
                arrayEquals(new int[]{}, new int[]{})
        );

    }

    private static boolean arrayEquals(int[] array, int[] array2) {
        if (array.length == array2.length) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] != array2[i]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }


}