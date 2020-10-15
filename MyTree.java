public class MyTree {

    private Node root;

    /**
     * 
     * @param o
     */
    public void add(Object o) {
        root = addData(root, o);
    }

    /**
     * 
     */
    public Object search(Object o) {
        return searchData(root, o);
    }

    /**
     * 
     */
    public void traverse() {
        traverseTree(root);
    }

    /**
     * 
     * @param currentNode
     * @param o
     * @return
     */
    private Node addData(Node currentNode, Object o) {
        if (currentNode == null) {
            currentNode = new Node(o, null, null);
        } else if (o.toString().compareTo(currentNode.getData().toString()) < 0) {
            // go left
            currentNode.setLeftNode(addData(currentNode.getLeftNode(), o));
        } else if (o.toString().compareTo(currentNode.getData().toString()) > 0) {
            // go right
            currentNode.setRightNode(addData(currentNode.getRightNode(), o));
        }
        return currentNode;
    }

    /**
     * 
     * @param currentNode
     * @param o
     * @return
     */
    private Node searchData(Node currentNode, Object o) {
        if (o.toString().compareTo(currentNode.getData().toString()) == 0) {
            return currentNode;
        }
        return (o.toString().compareTo(currentNode.getData().toString()) < 0) ? searchData(currentNode.getLeftNode(), o)
                : searchData(currentNode.getRightNode(), o);
    }

    /**
     * 
     * @param currentNode
     */
    private void traverseTree(Node currentNode) {
        if (currentNode != null) {
            traverseTree(currentNode.getLeftNode());
            System.out.println(currentNode.getData().toString());
            traverseTree(currentNode.getRightNode());

        }

    }

}
