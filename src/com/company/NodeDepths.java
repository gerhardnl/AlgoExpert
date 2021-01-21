package com.company;

public class NodeDepths {
    static int depths = 0;
    public static int nodeDepths(BinaryTree root) {
        depths = 0;
        depths = nodeDepthsSearch(root, depths);
        return depths;
    }
    public static int nodeDepthsSearch(BinaryTree node, int depth) {
        if ( node == null )
            return 0;
        return depth + nodeDepthsSearch(node.left, depth + 1) +
                nodeDepthsSearch(node.right, depth + 1);
    }
    static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }

}
