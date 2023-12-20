package oop_prac17_input_stream;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.CharBuffer;

public class Main {
    public static void main(String[] args) {
        /*InputStream inputStream = System.in;
        InputStreamReader streamReader = new InputStreamReader(inputStream);
        int code;
        code = streamReader.read();
        System.out.println(code);*/

        try {
            String str = readLine();
            System.out.println(str);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    private static String readLine() throws IOException {
        InputStream inputStream = System.in;
        InputStreamReader streamReader = new InputStreamReader(inputStream);
        StringBuilder sb = new StringBuilder();
//        String text = "";
        int code;
        do {
            code = streamReader.read();
            sb.append((char) code);
//            text += (char) code;
        } while (code != '\n');

        return sb.toString();
    }
}
