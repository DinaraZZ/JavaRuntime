package oop_prac19_recursive;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TreeUtil {
    private final File file;
    private final String filePath;

    public TreeUtil() {
        filePath = "./src/oop_prac19_recursive/text_2.txt";
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

        List<TreeNode> treeNodes = parentNode.getTreeNodes();
//        if (treeNodes.length > 0) {
        for (TreeNode treeNode : treeNodes) {
            bufferedWriter.write(prefix + treeNode.getName() + "\n");
            fillFileWithTree(treeNode, prefix + "- ", bufferedWriter);
        }
//        }
    }

    public TreeNode createTreeFromFile() {
        TreeNode parentNode = new TreeNode("Parent");

        try (FileReader fileReader = new FileReader("./src/oop_prac19_recursive/text.txt");
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line = new String();
            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split("- ");

                String name = new String();
                for (String part : parts) {
                    if (!part.equals("- ")) name += part;
                }

                List<TreeNode> nodes = parentNode.getTreeNodes();
                for (int i = 0; i < parts.length - 1; i++) {
                    nodes = nodes.get(nodes.size() - 1).getTreeNodes();
                }

                nodes.add(new TreeNode(name));
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return parentNode;
    }

    public void subnodesByCategory(TreeNode parent, String category) {
        List<TreeNode> treeNodes = parent.getTreeNodes();
        for (TreeNode treeNode : treeNodes) {
            if (treeNode.getName().equals(category)) {
                System.out.println(treeNode.getName());
                printNodes(treeNode, "- ");
            }
            else subnodesByCategory(treeNode, category);
        }
    }

    private void printNodes(TreeNode parentNode, String prefix) {
        List<TreeNode> treeNodes = parentNode.getTreeNodes();
        for (TreeNode treeNode : treeNodes) {
            System.out.println(prefix + treeNode.getName());
            printNodes(treeNode, prefix + "- ");
        }
    }
}
