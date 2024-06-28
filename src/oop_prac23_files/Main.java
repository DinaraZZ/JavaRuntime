package oop_prac23_files;

import java.io.*;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class Main {
    public static void main(String[] args) throws Exception {
        sameNumsFile("./src/oop_prac23_files/file1.txt", "./src/oop_prac23_files/file2.txt");
    }

    public static void sameNumsFile(String firstPath, String secondPath) throws Exception {
        String thirdPath = "./src/oop_prac23_files/file3.txt";
        File thirdFile = new File(thirdPath);
        if (!thirdFile.exists()) thirdFile.createNewFile();

        StringBuilder sb = new StringBuilder();

        /*int size = (int) Files.size(Path.of(firstPath));
        ByteBuffer buffer = ByteBuffer.allocate(size);*/

        try (FileReader fileReader = new FileReader(firstPath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line = bufferedReader.readLine();
            while (line != null) {
                sb.append(line);
                line = bufferedReader.readLine();
            }
        } catch (Exception e) {
        }

        try (FileReader fileReader = new FileReader(secondPath);
             BufferedReader bufferedReader = new BufferedReader(fileReader);
             FileWriter fileWriter = new FileWriter(thirdPath);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            String line = bufferedReader.readLine();
            while (line != null) {
                if (sb.indexOf(line) >= 0) {
                    bufferedWriter.write(line + "\n");
//                    buffer.put(line.getBytes());
                }
                line = bufferedReader.readLine();
            }
        } catch (Exception e) {
        }

//        System.out.println(sb);
    }
}
