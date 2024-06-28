package oop_prac23_files;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main2 {
    public static void main(String[] args) throws Exception {
        String[] filesName = {"file1.txt", "file2.txt", "file3.txt"};
        System.out.println(sumFiles(filesName));
    }

    public static int sumFiles(String... files) throws Exception {
        int sum = 0;

        String pathBeginning = "./src/oop_prac23_files/";

        for (String file : files) {
            List<String> lines = Files.readAllLines(Path.of(pathBeginning + file));
            for (String line : lines) {
                sum += Integer.parseInt(line);
            }
        }

        return sum;
    }
}
