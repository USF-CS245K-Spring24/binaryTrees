package exerciseMarch28;

/** A general tree */
class TreeWithLinkedListOfChildren {
    private TreeNode root;

    private class TreeNode {
        Object data;
        TreeNode leftChild;
        TreeNode rightSibling;
        // TreeNode  parent; // optional

        TreeNode(Object data) {
            this.data = data;
        }
    }

    public void printPreorder() {
        printPreorder(root);
    }

    public int countNodes() {
        return countNodes(root);
    }

    public int height() {
        return height(root);
    }

    public int countLeaves() {
        return countLeaves(root);
    }

    public void serialize() { serialize(root); }


    /** Compute the height of the tree with the given root
     *
     * @param node root of the tree
     * @return height (number of levels)
     */
    private int height(TreeNode node) {
        int maxHeight = 0;
        // FILL IN CODE


        return maxHeight;
    }

    /**
     * Count nodes
     * @param node root of the tree
     * @return number of nodes in the tree with the given root
     */
    private int countNodes(TreeNode node) {
        int numNodes = 0;
        for (TreeNode curr = node.leftChild; curr != null; curr = curr.rightSibling) {
            numNodes += countNodes(curr);
        }
        return 1 + numNodes;
    }

    /**
     * Count leaves
     * @param node root of the tree
     * @return number of leaves in the tree with the given root
     */
    private int countLeaves(TreeNode node) {
        int numLeaves = 0;
        // FILL IN CODE

        return numLeaves;
    }

    /**
     * Print the values in the nodes of the tree using preorder traversal
     * @param node root of the tree
     */
    private void printPreorder(TreeNode node) {
        if (node == null)
            return;
        System.out.print(node.data + " ");
        TreeNode curr = node.leftChild;
        while (curr != null)  {
            printPreorder(curr);
            curr = curr.rightSibling;
        }
    }

    /** Serialize this tree using preorder traveral and )
     *
     * @param node  root of the tree
     */
    private void serialize(TreeNode node) {
        if (node == null)
            return;
        System.out.print(node.data + " ");
        for (TreeNode curr = node.leftChild; curr != null; curr = curr.rightSibling) {
            serialize(curr);
        }
        System.out.print(") ");
        // FILL IN CODE:

    }


    public void createSimpleTree() {
        TreeNode node1 = new TreeNode(1);
        TreeNode node11 = new TreeNode(11);
        TreeNode node12 = new TreeNode(12);
        TreeNode node13 = new TreeNode(13);
        node1.leftChild = node11;
        node11.rightSibling = node12;
        node12.rightSibling = node13;
        this.root = node1;

        TreeNode node111 = new TreeNode(111);
        TreeNode node112 = new TreeNode(112);
        node11.leftChild = node111;
        node111.rightSibling = node112;

        TreeNode node131 = new TreeNode(131);
        TreeNode node132 = new TreeNode(132);
        TreeNode node133 = new TreeNode(133);
        node13.leftChild = node131;
        node131.rightSibling = node132;
        node132.rightSibling = node133;
    }

    public static void main(String[] args) {
        TreeWithLinkedListOfChildren tree = new TreeWithLinkedListOfChildren();
        tree.createSimpleTree();
        tree.printPreorder();
        System.out.println();
        System.out.println(tree.countNodes());
        tree.serialize();
    }

}

