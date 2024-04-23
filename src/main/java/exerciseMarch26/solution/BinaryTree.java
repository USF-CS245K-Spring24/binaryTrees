package exerciseMarch26.solution;

import exerciseMarch26.ArrayStack;
import exerciseMarch26.Stack;

public class BinaryTree {

    /** An inner class representing a node in a binary tree */
    private class BinaryTreeNode {
        int data; // value stored at the node
        BinaryTreeNode left; // left subtree
        BinaryTreeNode right; // right subtree

        BinaryTreeNode(int newData) {
            data = newData;
        }
    } // end of class BinaryTreeNode

    private BinaryTreeNode root; // the root of the tree

    public BinaryTree() {
        root = null; // initially, the tree is empty
    }

    /** Print a binary tree (preorder) */
    public void printPreorder() {
        printPreorder(root);
        System.out.println();
    }

    public String serializeUsingPreorder() {
        return serializeUsingPreorder(root);
    }

    /** Print a binary tree (inorder) */
    public void printInorder() {
        printInorder(root);
        System.out.println();
    }

    /** Print a binary tree (preorder) */
    public void printPostorder() {
        printPostorder(root);
        System.out.println();
    }

    /** Return the total number of nodes */
    public int numNodes() {
        return numNodes(root);
    }

        /** Return the height of the tree */
    public int height() {return height(root); }

    /** Return the number of leaves of the tree */
    public int leaves() {return leaves(root); }

    /**
     * Print nodes of the binary tree using preorder traversal
     */
    private void printPreorder(BinaryTreeNode root) {
        if (root != null) {
            System.out.print(" " + root.data + " ");
            printPreorder(root.left);
            printPreorder(root.right);
        }
    }

    public void printPreorderIterative() {
        if (root == null)
            return;
        Stack stack = new ArrayStack();
        BinaryTreeNode current = root;
        stack.push(current);
        while (!stack.empty()) {
            BinaryTreeNode node =  (BinaryTreeNode)stack.pop();
            System.out.print(" " + node.data + " ");
            if (node.right != null)
                stack.push(node.right);
            if (node.left != null)
                stack.push(node.left);
        }
        System.out.println();
    }


    /**
     *
     * @param root root of the tree
     * @return a string representing the tree, generated using preorder traversal
     * and using with / to print null nodes.
     *
     */
    private String serializeUsingPreorder(BinaryTreeNode root) {
        StringBuilder sb = new StringBuilder();
        // FILL IN CODE
        if (root != null) {
            sb.append(root.data + " ");
            sb.append(serializeUsingPreorder(root.left));
            sb.append(serializeUsingPreorder(root.right));
        }
        else
            sb.append("/");

        return sb.toString();
    }


    /**
     * Print nodes of the binary tree using inorder traversal
     */
    private void printInorder(BinaryTreeNode root) {
        // FILL IN CODE:
        if (root != null) {
            printInorder(root.left);
            System.out.print(" " + root.data + " ");
            printInorder(root.right);
        }
    }

    /**
     * Print nodes of the binary tree using postorder traversal
     */
    private void printPostorder(BinaryTreeNode root) {
        // FILL IN CODE:
        if (root != null) {
            printPostorder(root.left);
            printPostorder(root.right);
            System.out.print(" " + root.data + " ");
        }
    }


    private int height(BinaryTreeNode root) {
        // FILL IN CODE:
        // return the height of the tree
        if (root == null)
            return 0;

        return 1 + Math.max(height(root.left), height(root.right));
    }

    /** Return the number of leaves of the tree */
    public int leaves(BinaryTreeNode root) {
        // FILL IN CODE
        if (root == null)
            return 0;
        if (root.left == null && root.right == null)
            return 1;

        return leaves(root.left) + leaves(root.right);
    }


    /**
     * Return the number of nodes of the tree
     * @param root root of the tree
     * @return number of nodes
     */
    private int numNodes(BinaryTreeNode root) {
        // FILL IN CODE
        if (root == null)
            return 0;
        else
            return 1 + numNodes(root.left) + numNodes(root.right);
    }

    public void createSampleTree() {
        // Note: this is not a binary search tree, just a binary tree
        root = new BinaryTreeNode(5);
        BinaryTreeNode node1 = new BinaryTreeNode(10);
        BinaryTreeNode node2 = new BinaryTreeNode(2);
        BinaryTreeNode node3 = new BinaryTreeNode(35);
        BinaryTreeNode node4 = new BinaryTreeNode(3);
        BinaryTreeNode node5 = new BinaryTreeNode(18);
        BinaryTreeNode node6 = new BinaryTreeNode(29);
        BinaryTreeNode node7 = new BinaryTreeNode(6);
        BinaryTreeNode node8 = new BinaryTreeNode(5);
        BinaryTreeNode node9 = new BinaryTreeNode(1);
        BinaryTreeNode node10 = new BinaryTreeNode(9);

        root.right =  node1;
        root.left = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;
        node3.left = node7;
        node4.right = node8;
        node5.right = node9;
        node9.left = node10;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.createSampleTree();
        tree.printPreorder();
        tree.printInorder();
        tree.printPostorder();
        System.out.println(tree.numNodes());
        System.out.println(tree.height());
        System.out.println(tree.leaves());
    }
}
