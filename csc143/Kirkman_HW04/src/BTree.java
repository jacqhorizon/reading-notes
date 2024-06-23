import java.util.ArrayList;

public class BTree implements CityTreeInterface {
    private TreeNode overallRoot;
    private int size;

    /**
     * Constructor for empty tree
     */
    public BTree() {
        this.overallRoot = null;
        this.size = 0;
    }

    /**
     * Retrieves a count of elements being maintained by the tree.
     *
     * @return the size of the tree (count of elements)
     */
    @Override
    public int getCount() {
        return size;
    }

    private TreeNode addNode(TreeNode root, City city) {
        if (root == null) {
            root = new TreeNode(city);
        } else if (city.compareTo(root.data) <= 0) {
            root.left = addNode(root.left, city);
        } else {
            root.right = addNode(root.right, city);
        }
        return root;
    }

    /**
     * Adds a new node to the tree;
     * this method must call the protected recursive add New Node method
     *
     * @param city the element to add to the tree
     */
    @Override
    public void addCity(City city) {
        overallRoot = addNode(overallRoot, city);
        size++;
    }

    private City search(TreeNode root, String name) {
        if (root == null) {
            return null;
        } else if (root.data.getName().equals(name)) {
            return root.data;
        } else if (root.data.getName().compareTo(name) > 0) {
            return search(root.left, name);
        } else {
            return search(root.right, name);
        }
    }

    /**
     * this method must call the protected recursive search method
     *
     * @param name the element to find in the tree
     * @return City class that has city name as a given parameter;
     */
    @Override
    public City searchBT(String name) {
        if (overallRoot == null) {
            throw new NullPointerException("Tree is empty");
        }
        City result = search(overallRoot, name);
        if (result == null) {
            throw new NullPointerException("City not found");
        } else {
            return result;
        }
    }

    private String printNodes(TreeNode root) {
        //left - root - right
        String res = "";
        if (root != null) {
            res += printNodes(root.left);
            res += " " + root.data.toString();
            res += printNodes(root.right);
        }
        return res;
    }

    /**
     * this method must call the protected printNodes method
     *
     * @return toString() method of all nodes;
     */
    @Override
    public String printTree() {
        return printNodes(overallRoot);
    }

    private void listOfCities(String template, TreeNode root, ArrayList<City> list) {
        if (root != null) {
            if(root.data.getName().matches(template+".*")) {
                list.add(root.data);
            }
            listOfCities(template, root.left, list);
            listOfCities(template, root.right, list);
        }
    }
    /**
     * this method must call the protected recursive listOfCities method
     *
     * @param template contains the few letters at the beginning of the name
     * @return ArrayList of cities with names starting with template;
     */
    @Override
    public ArrayList<City> listOfTemplate(String template) {
        ArrayList<City> cityList = new ArrayList<>();
        listOfCities(template, overallRoot, cityList);
        return cityList;
    }

    /**
     * Removes all nodes from tree;
     */
    @Override
    public void clear() {
        this.overallRoot = null;
        this.size = 0;
    }
}
