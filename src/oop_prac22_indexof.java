public class oop_prac22_indexof {
    public static void main(String[] args) {
        String text = "hello template liquid transaction template";

//        System.out.println(myIndexOf(text, "template"));
//        System.out.println(myIndexOf(text, "template", 33));
//        System.out.println(myLastIndexOf(text, "template"));

        String x = "abbbbcccaaaaaaazzzbb";

        maxConsecutiveChar(x);
    }


    public static int myIndexOf(String text, String substring) {
        return myIndexOf(text, substring, 0);
    }

    public static int myIndexOf(String text, String substring, int startIndex) {
        int index = -1;
        int substringLength = substring.length();
        int textLength = text.length();

        if (textLength - startIndex >= substringLength) {
            int count = 0;
            boolean isFound = false;

            for (int i = startIndex; i < textLength; i++) {
                int k = i;
                for (int j = 0; j < substringLength; j++) {
                    if (text.charAt(k) == substring.charAt(j)) {
//                    System.out.println(text.charAt(k) + " " + k);
                        k++;
                        if (++count == substringLength) {
                            isFound = true;
                            index = k - substringLength;
                            break;
                        }
                    } else {
                        count = 0;
                        break;
                    }
                }
                if (isFound) break;
            }
        }
        return index;
    }

    public static int myLastIndexOf(String text, String substring) {
        int index = -1;
        int substringLength = substring.length();
        int count = 0;
        boolean isFound = false;

        for (int i = text.length() - 1; i >= 0; i--) {
            int k = i;
            for (int j = substringLength - 1; j >= 0; j--) {
                if (text.charAt(k) == substring.charAt(j)) {
//                    System.out.println(text.charAt(k) + " " + k);
                    k--;
                    if (++count == substringLength) {
                        isFound = true;
                        index = k + 1;
                        break;
                    }
                } else {
                    count = 0;
                    break;
                }
            }
            if (isFound) break;
        }

        return index;
    }

    public static void maxConsecutiveChar(String text) {
        System.out.println(text);

        int maxCount = 1;
        char maxCharacter = text.charAt(0);
        int length = text.length();
        int count = 0;
        char character = text.charAt(0);

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == character) count++;
            else {
                character = text.charAt(i);
                count = 1;
            }

            if (count > maxCount) {
                maxCount = count;
                maxCharacter = character;
            }
        }

        System.out.println(maxCharacter + ": " + maxCount);
    }
}