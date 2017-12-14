package test.BinaryTree;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        BSTree bSTree = new BSTree();
        bSTree.add("One", 1);
        bSTree.add("Two", 2);
        bSTree.add("Two", 3);
        System.out.println(bSTree);
    }
}
