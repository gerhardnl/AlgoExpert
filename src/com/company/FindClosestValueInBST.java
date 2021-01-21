package com.company;

public class FindClosestValueInBST {
    static int result = Integer.MAX_VALUE;
    public static int findClosestValueInBst(BST tree, int target) {
        if(tree != null){
            if(Math.abs(tree.value - target) <  Math.abs(result - target) ){
                result = tree.value;
            }
            findClosestValueInBst(tree.left, target);
            findClosestValueInBst(tree.right, target);
        }
        return result;
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
