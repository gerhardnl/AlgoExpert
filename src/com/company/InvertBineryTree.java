package com.company;

public class InvertBineryTree {
    public static void invertBinaryTree(BinaryTree tree) {
        if(tree != null){
            BinaryTree temp = tree.left;
            tree.left = tree.right;
            tree.right = temp;

            invertBinaryTree(tree.left);
            invertBinaryTree(tree.right);
        }
    }

    static class BinaryTree {
        public int value;
        public BinaryTree left;
        public BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
        }
    }
}
