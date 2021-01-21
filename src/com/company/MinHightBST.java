package com.company;

import java.util.ArrayList;
import java.util.List;

public class MinHightBST {
    public static BST minHeightBst(List<Integer> array) {

        return addFromMiddle(array, 0, array.size() - 1, null);
    }

    private static BST addFromMiddle(List<Integer> array, int min, int max, BST tree) {
        if (max < min) return null;
        int mid = (min + max)/2;
        if (tree == null){
            tree = new BST(array.get(mid));
        }else {
            tree.insert(array.get(mid));
        }
        addFromMiddle(array, min, mid - 1, tree);
        addFromMiddle(array, mid + 1, max, tree);
        return tree;
    }

    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
            left = null;
            right = null;
        }

        public void insert(int value) {
            if (value < this.value) {
                if (left == null) {
                    left = new BST(value);
                } else {
                    left.insert(value);
                }
            } else {
                if (right == null) {
                    right = new BST(value);
                } else {
                    right.insert(value);
                }
            }
        }
    }

}
