package lab03_22;

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
    }


    /** Print a binary tree (inorder) */
    public void printInorder() {
        printInorder(root);
    }

    /** Print a binary tree (preorder) */
    public void printPostorder() {
        printPostorder(root);
    }

    /** Return the height of the tree */
    public int height() {return height(root); }

    /** Return the number of leaves of the tree */
    public int leaves() {return leaves(root); }

    /** Return the number of nodes in the tree */
    public int numNodes() {
        return numNodes(root);
    }


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

    /**
     * Print nodes of the binary tree using inorder traversal
     */
    private void printInorder(BinaryTreeNode root) {
        // FILL IN CODE:

    }

    /**
     * Print nodes of the binary tree using postorder traversal
     */
    private void printPostorder(BinaryTreeNode root) {
        // FILL IN CODE:

    }


    /**
     * Returns the number of levels in the tree
     * @param root root of the binary tree
     * @return height (number of levels)
     */
    private int height(BinaryTreeNode root) {
        // FILL IN CODE:
        // return the height of the tree
        return 0; // change
    }

    /** Return the number of leaves of the tree */
    private int leaves(BinaryTreeNode root) {
        // FILL IN CODE

        return 0;
    }

    /**
     * Return the number of nodes of the tree
     * @param root root of the tree
     * @return number of nodes
     */
    private int numNodes(BinaryTreeNode root) {
        // FILL IN CODE

        return 0;
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
        System.out.println();
        tree.printInorder();
        System.out.println();
        tree.printPostorder();
        System.out.println();
        System.out.println(tree.height());
        System.out.println(tree.leaves());
    }
}
