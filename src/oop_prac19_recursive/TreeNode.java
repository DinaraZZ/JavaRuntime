package oop_prac19_recursive;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TreeNode {
    private final String name;
    private final List<TreeNode> treeNodes;

    public TreeNode(String name) {
        this(name, new ArrayList<TreeNode>());
    }

    public TreeNode(String name, List<TreeNode> treeNodes) {
        this.name = name;
        this.treeNodes = treeNodes;
    }

    public TreeNode(String name, TreeNode[] treeNodes) {
        this.name = name;
        this.treeNodes = new ArrayList<>();
        Collections.addAll(this.treeNodes, treeNodes);
    }

    public String getName() {
        return name;
    }

    public List<TreeNode> getTreeNodes() {
        return treeNodes;
    }
}
