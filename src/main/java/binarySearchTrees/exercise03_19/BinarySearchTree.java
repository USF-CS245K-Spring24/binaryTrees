package binarySearchTrees.exercise03_19;

class BinarySearchTree {

    /** An inner class representing a node in a BST tree */
    private class BSTNode {
        int data; // value stored at the node
        BSTNode left; // left subtree
        BSTNode right; // right subtree

        BSTNode(int newdata) {
            data = newdata;
        }
    } // end of class BSTNode

    private BSTNode root; // the root of the tree, an instance variable of class BinarySearchTree

    BinarySearchTree() {
        root = null; // initially, the tree is empty
    }

    /** Print a binary tree (preorder) */
    public void printPreorder() {
        printPreorder(root);
    }

    public boolean findIterative(int elem) {
        BSTNode current = root;
        // FILL IN CODE
        while (current != null) {
            if (current.data == elem)
                return true;
            if (current.data < elem)
                current = current.right;
            else
                current = current.left;
        }
        return false;
    }

    public boolean findRecursive(int elem, BSTNode root) {
        if (root == null)
            return false;
        if (root.data == elem)
            return true;
        if (elem < root.data) {
            return findRecursive(elem, root.left);
        }
        else
            return findRecursive(elem, root.right);
        // FILL IN CODE
    }

    public void insertIterative(int elem) {
        BSTNode prev = null;
        BSTNode current = root;
        if (root == null) {
            root = new BSTNode(elem);
            return;
        }
        while (current != null) {
            if (elem < current.data) {
                prev = current;
                current = current.left;
            }
            else {
                prev = current;
                current = current.right;
            }
        }
        if (elem < prev.data) {
            prev.left = new BSTNode(elem);
        }
        else {
            prev.right = new BSTNode(elem);
        }
    }

    public BSTNode insertRecursive(int elem, BSTNode tree) {
        if (tree == null) {
            return new BSTNode(elem);
        }

        if (elem < tree.data) {
            tree.left = insertRecursive(elem, tree.left);
        }
        else
            tree.right = insertRecursive(elem, tree.right);

        return tree;
    }

    private void printPreorder(BSTNode root) {
        if (root != null) {
            System.out.print(" " + root.data + " ");
            printPreorder(root.left);
            printPreorder(root.right);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insertIterative(6);
        tree.insertIterative(1);
        tree.insertIterative(10);
        tree.insertIterative(8);
        tree.insertIterative(12);
        tree.insertIterative(16);
        tree.printPreorder();
        System.out.println();
        System.out.println(tree.findIterative(16));
        //System.out.println(tree.findIterative(13));
        //System.out.println();
        //tree.printPreorder();
        System.out.println();
    }
}
