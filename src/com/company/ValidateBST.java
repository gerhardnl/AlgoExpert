package com.company;

public class ValidateBST {
    public static BST prev;
    public static boolean validateBst(BST tree) {
        return isBSTUtil(tree);
        //return isBST(tree, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
     public static boolean isBST(BST node, int min, int max) {
        if (node == null)
            return true;

        if (node.value < min || node.value >= max)
            return false;

        return (isBST(node.left, min, node.value) &&
                isBST(node.right, node.value, max));
    }
    static boolean isBSTUtil(BST node)
    {
        if (node != null)
        {
            if (!isBSTUtil(node.left))
                return false;
            if (prev != null && node.value <= prev.value)
                return false;

            prev = node;

            return isBSTUtil(node.right);
        }
        return true;
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }
    }
}
