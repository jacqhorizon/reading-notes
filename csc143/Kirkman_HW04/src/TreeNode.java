public class TreeNode {
    public City data;
    public TreeNode left;
    public TreeNode right;


    /**
     * Constructor for a tree node containing city data
     *
     * @param data the city
     * @param left the left node
     * @param right the right node
     */
    public TreeNode(City data, TreeNode left, TreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    /**
     * Constructor for a tree node without left or right node
     *
     * @param data the city
     */
    public TreeNode(City data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
