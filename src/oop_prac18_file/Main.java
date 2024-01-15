package oop_prac18_file;

public class Main {
    public static void main(String[] args) {
        FileUtil fileUtil = new FileUtil("./src/oop_prac18_file/text_files");
        var names = fileUtil.findFilesByName("file_1");
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println();

        names = fileUtil.findFilesByContent("info");
        for (String name : names) {
            System.out.println(name);
        }

    }
}
