package exerciseMarch28;

/** A general tree. Children are stored in an array */
class TreeWithArrayOfChildren {
    public static int MAX_NUM_CHILDREN = 5;
    private TreeNode root;

    private class TreeNode {
        Object data;
        TreeNode[] children;

        TreeNode(Object data) {
            this.data = data;
            children = new TreeNode[MAX_NUM_CHILDREN];
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

    public void serialize() {serialize(root);}

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
        for (int i = 0; i < MAX_NUM_CHILDREN; i++) {
            if (node.children[i] != null)
                numNodes += countNodes(node.children[i]);
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
        for (int i = 0; i < MAX_NUM_CHILDREN; i++) {
            if (node.children[i] != null)
                printPreorder(node.children[i]);
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
        // FILL IN CODE:

    }

    public void createSimpleTree() {
        TreeNode node1 = new TreeNode(1);
        TreeNode node11 = new TreeNode(11);
        TreeNode node12 = new TreeNode(12);
        TreeNode node13 = new TreeNode(13);
        node1.children[0] = node11;
        node1.children[1] = node12;
        node1.children[2] = node13;

        TreeNode node111 = new TreeNode(111);
        TreeNode node112 = new TreeNode(112);
        node11.children[0]= node111;
        node11.children[1] = node112;

        TreeNode node131 = new TreeNode(131);
        TreeNode node132 = new TreeNode(132);
        TreeNode node133 = new TreeNode(133);
        node13.children[0] = node131;
        node13.children[1] = node132;
        node13.children[2] = node133;

        this.root = node1;
    }

    public static void main(String[] args) {
        TreeWithArrayOfChildren tree = new TreeWithArrayOfChildren();
        tree.createSimpleTree();
        tree.printPreorder();
        System.out.println();
        System.out.println(tree.countNodes());
        // System.out.println(tree.height());
        // System.out.println(tree.countLeaves());
        // tree.serialize();
    }

}

