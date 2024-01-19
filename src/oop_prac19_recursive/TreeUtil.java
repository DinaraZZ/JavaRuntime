package oop_prac19_recursive;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TreeUtil {
    private final File file;
    private final String filePath;

    public TreeUtil() {
        filePath = "./src/oop_prac19_recursive/text.txt";
        file = new File(filePath);
    }

    public void fillFileWithTree(TreeNode parentNode) {
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        try (FileWriter fileWriter = new FileWriter(filePath, false);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            fillFileWithTree(parentNode, "", bufferedWriter);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private void fillFileWithTree(TreeNode parentNode, String prefix, BufferedWriter bufferedWriter) throws IOException {
//        bufferedWriter.write(prefix + parentNode.getName() + "\n");

        TreeNode[] treeNodes = parentNode.getTreeNodes();
//        if (treeNodes.length > 0) {
        for (TreeNode treeNode : treeNodes) {
            bufferedWriter.write(prefix + treeNode.getName() + "\n");
            fillFileWithTree(treeNode, prefix + "- ", bufferedWriter);
        }
//        }
    }
}
