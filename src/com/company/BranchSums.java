package com.company;

import java.util.ArrayList;
import java.util.List;

public class BranchSums {
    static int number = 0;
    static List<Integer> result = new ArrayList<>();
    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public static List<Integer> branchSums(BinaryTree root) {
        result.clear();
        recursiveSums(root);
        return result;

    }
    public static List<Integer> recursiveSums(BinaryTree node){
        if( node != null){

            number += node.value;
            recursiveSums(node.left);
            recursiveSums(node.right);

            if(node.left == null && node.right == null){
                result.add(number);
            }

            number -= node.value;

        }
        return result;
    }
}
