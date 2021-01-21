package com.company;

public class BSTConstruction {
    static class BST {
        public int value;
        public BST left;
        public BST right;

        public BST(int value) {
            this.value = value;
        }

        public BST insert(int value) {
            if (value < this.value) {
                if (this.left == null) {
                    BST newBST = new BST(value);
                    this.left = newBST;
                } else {
                    this.left.insert(value);
                }
            } else {
                if (this.right == null) {
                    BST newBST = new BST(value);
                    this.right = newBST;
                } else {
                    this.right.insert(value);
                }
            }
            return this;
        }

        public boolean contains(int value) {
            if (value < this.value) {
                if (this.left == null) {
                    return false;
                }
                return this.left.contains(value);
            } else if (value > this.value) {
                if (this.right == null) {
                    return false;
                }
                return this.right.contains(value);
            } else {
                return true;
            }
        }

        public BST remove(int value) {
            remove(value, null);
            return this;
        }

        public void remove(int value, BST parent) {
            if (value < this.value) {
                if (this.left != null) {
                    this.left.remove(value, this);
                }
            } else if (value > this.value) {
                if (this.right != null) {
                    this.right.remove(value, this);
                }
            } else {
                if (this.left != null && this.right != null) {
                    this.value = this.right.getMinValue();
                    this.right.remove(this.value, this);
                } else if (parent == null) {
                    if (this.left != null) {
                        this.value = left.value;
                        this.right = this.left.right;
                        this.left = this.left.left;
                    } else if (this.right != null) {
                        this.value = this.right.value;
                        this.left = this.right.left;
                        this.right = this.right.right;
                    }
                } else if (parent.left == this) {
                    parent.left = left != null ? left : right;
                } else if (parent.right == this) {
                    parent.right = left != null ? left : right;
                }
            }
        }

        public int getMinValue() {
            if (this.left == null) {
                return this.value;
            } else {
                return left.getMinValue();
            }
        }
    }



}
