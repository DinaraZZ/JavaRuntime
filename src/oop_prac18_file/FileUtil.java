package oop_prac18_file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileUtil {
    private String parentDirectory;
    private File parentFile;

    public FileUtil(String parentDirectory) {
        this.parentDirectory = parentDirectory;
        parentFile = new File(parentDirectory);
    }

    public List<String> findFilesByName(String name) {
        List<String> fileNames = new ArrayList<>();
        File[] files = parentFile.listFiles();
        return findFilesByName(name, files, fileNames);
    }

    private List<String> findFilesByName(String name, File[] files, List<String> fileNames) {
        File[] files2 = files;
        for (File file : files2) {
            File[] files3 = file.listFiles();
            if (files3 != null) {
                findFilesByName(name, files3, fileNames);
            }
            String fileName = file.getName();
            if (fileName.contains(name) && file.isFile()) fileNames.add(fileName);
        }
        return fileNames;
    }

    public List<String> findFilesByContent(String content) {
        List<String> fileNames = new ArrayList<>();
        File[] files = parentFile.listFiles();
        return findFilesByContent(content, files, fileNames);
    }

    private List<String> findFilesByContent(String content, File[] files, List<String> fileNames) {
        File[] files2 = files;
        for (File file : files2) {
            File[] files3 = file.listFiles();
            if (files3 != null) {
                findFilesByContent(content, files3, fileNames);
            }
            if (file.isFile()) {
                String filePath = file.getAbsolutePath();
                if (fileContains(filePath, content)) fileNames.add(file.getName());
            }
        }
        return fileNames;
    }

    private boolean fileContains(String path, String text) {
        try (FileReader fileReader = new FileReader(path);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line = bufferedReader.readLine();
            while (line != null) {
                if (line.contains(text)) return true;
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
}
