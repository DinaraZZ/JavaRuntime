package oop_prac19_recursive;

import com.sun.source.tree.Tree;

public class TreeNode {
    private final String name;
    private final TreeNode[] treeNodes;

    public TreeNode(String name) {
        this(name, new TreeNode[0]);
    }

    public TreeNode(String name, TreeNode[] treeNodes) {
        this.name = name;
        this.treeNodes = treeNodes;
    }

    public String getName() {
        return name;
    }

    public TreeNode[] getTreeNodes() {
        return treeNodes;
    }
}
