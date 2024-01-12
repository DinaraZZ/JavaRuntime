package oop_prac17_input_stream;

import java.io.*;
import java.util.Arrays;

import static oop_prac17_input_stream.Main.*;

public class Main3Nums {
    public static void main(String[] args) {
        fillTarget();
    }

    private static final String filePath1 = "./src/files/data_1.txt";
    private static final String filePath2 = "./src/files/data_2.txt";
    private static final String filePathTarget = "./src/files/target.txt";

    private static void fillTarget() {
        try (FileReader fileReader1 = new FileReader(filePath1);
             BufferedReader bufferedReader1 = new BufferedReader(fileReader1);
             FileReader fileReader2 = new FileReader(filePath2);
             BufferedReader bufferedReader2 = new BufferedReader(fileReader2);
             FileWriter fileWriter = new FileWriter(filePathTarget, false);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            String str1 = new String();
            String str2 = new String();

            do {
                str1 = readLine(bufferedReader1);
                str2 = readLine(bufferedReader2);
                System.out.println("str1: " + str1);
                System.out.println("str2: " + str2);

                int num1 = 0;
                int num2 = 0;

                    try {
                        if (str1 != null && !str1.isEmpty()) {
                            num1 = Integer.parseInt(str1);
                        }

                        num2 = Integer.parseInt(str2.trim());
                    } catch (NumberFormatException e) {
                        bufferedWriter.write("err");
                    }

                Integer num3 = num1 + num2;
                System.out.println("num1: " + num1);
                System.out.println("num2: " + num2);
                System.out.println("num3: " + num3);
                bufferedWriter.write(num3.toString() + "\n");

            } while (str1 != null || str2 != null);

        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
