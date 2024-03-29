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
        while (current != null) {
            // FILL IN CODE

        }
        return false;
    }

    public void insertIterative(int elem) {
        BSTNode prev = null;
        BSTNode current = root;
        if (root == null) {
            root = new BSTNode(elem);
            return;
        }
        while (current != null) {
            if (elem >= current.data) {
                // FILL IN CODE: update prev and current
            }
            else {
                // FILL IN CODE: update prev and current

            }
        }
        if (elem < prev.data) {
            // FILL IN CODE: create a new node and attach to prev
        }
        else {
            // FILL IN CODE: create a new node and attach to prev
        }
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
        System.out.println(tree.findIterative(12));
        System.out.println(tree.findIterative(13));
        System.out.println();
        tree.printPreorder();
        System.out.println();
    }
}
