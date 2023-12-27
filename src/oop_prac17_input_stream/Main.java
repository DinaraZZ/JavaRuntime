package oop_prac17_input_stream;

import java.io.*;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*InputStream inputStream = System.in;
        InputStreamReader streamReader = new InputStreamReader(inputStream);
        int code;
        code = streamReader.read();
        System.out.println(code);*/

/////////////////////////////////////////////////////////////////////////////////////////////

        /*InputStreamReader systemReader = new InputStreamReader(System.in);
        try (FileReader fileReader = new FileReader("./text.txt")) {
            String str = readLine(fileReader);
            System.out.println(str);
            str = readLine(fileReader);
            System.out.println(str);
            str = readLine(fileReader);
            System.out.println(str);
            str = readLine(fileReader);
            System.out.println(str);
            str = readLine(fileReader);
            System.out.println(str);
        } catch (IOException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }*/

/////////////////////////////////////////////////////////////////////////////////////////////

//        List<String> names2 = new ArrayList<>();
//        names2.add("sdga");
//        names2.add("sdwdrqw");
//        System.out.println(names2);

        /*List<String> names = new ArrayList<>();

        try (FileReader fileReader = new FileReader("./names.txt")) {
            String str = readLine(fileReader);
            while (str != null) {
                names.add(str);
                str = readLine(fileReader);
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        for (String n : names) {
            if (n.startsWith("a")) System.out.println(n);
        }

        System.out.println(names);*/

/////////////////////////////////////////////////////////////////////////////////////////////

        // false = перезаписывает, true = продолжает запись (фолс по ум)
//        FileWriter fileWriter = new FileWriter("./text.txt");

        /*try (FileReader fileReader = new FileReader("./file_1.txt");
             FileWriter fileWriter = new FileWriter("./file_2.txt")) {
            int line = 1;
            String str = readLine(fileReader);
            while (str != null) {
                if (line % 2 != 0) {
                    System.out.println(line);
                    fileWriter.write(str);
                }
                line++;
                str = readLine(fileReader);
            }
        } catch (IOException e) {
            System.out.println(e);
        }*/

/////////////////////////////////////////////////////////////////////////////////////////////
    }

    public static String readLine() throws IOException {
        InputStream inputStream = System.in;
        InputStreamReader streamReader = new InputStreamReader(inputStream);
        StringBuilder sb = new StringBuilder();
        int code;
        do {
            code = streamReader.read();
            sb.append((char) code);
        } while (code != '\n');

        return sb.toString();
    }

    public static String readLine(Reader reader) throws IOException {
        StringBuilder sb = new StringBuilder();
        int code = reader.read();
        while (code != '\n') {
            if (code == -1) {
                if (sb.length() == 0) return null;
                else break;
            }
            sb.append((char) code);
            code = reader.read();
        }
        return sb.toString();
    }
}
