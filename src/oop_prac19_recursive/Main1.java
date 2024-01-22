package oop_prac19_recursive;

import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
//        TreeNode parent = new TreeNode("Parent", new TreeNode[]{
//                new TreeNode("Комплектующие", new TreeNode[]{
//                        new TreeNode("Процессоры", new TreeNode[]{
//                                new TreeNode("Intel"),
//                                new TreeNode("AMD")
//                        }),
//                        new TreeNode("ОЗУ")
//                }),
//                new TreeNode("Аудиотехника", new TreeNode[]{
//                        new TreeNode("Наушники"),
//                        new TreeNode("Колонки")
//                })
//        });
//
        TreeUtil treeUtil = new TreeUtil();
//        treeUtil.fillFileWithTree(parent);
        TreeNode node = treeUtil.createTreeFromFile();
        treeUtil.fillFileWithTree(node);
    }
}
