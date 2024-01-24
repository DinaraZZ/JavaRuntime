package oop_prac19_recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import static oop_prac17_input_stream.Main.readLine;

import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
/*        TreeNode parent = new TreeNode("Parent", new TreeNode[]{
                new TreeNode("Комплектующие", new TreeNode[]{
                        new TreeNode("Процессоры", new TreeNode[]{
                                new TreeNode("Intel"),
                                new TreeNode("AMD")
                        }),
                        new TreeNode("ОЗУ")
                }),
                new TreeNode("Аудиотехника", new TreeNode[]{
                        new TreeNode("Наушники"),
                        new TreeNode("Колонки")
                })
        });*/
//
        TreeUtil treeUtil = new TreeUtil();
//        treeUtil.fillFileWithTree(parent);
        TreeNode node = treeUtil.createTreeFromFile();
//        treeUtil.fillFileWithTree(node);

        String category = new String();
        try (InputStreamReader systemReader = new InputStreamReader(System.in)) {
            System.out.print("Введите категорию: ");
            category = readLine(systemReader);
        } catch (IOException e) {
        }
        treeUtil.subnodesByCategory(node, category.trim());
    }
}
