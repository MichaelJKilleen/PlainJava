import java.util.Objects;

public class Node {
    private Object data;

    private Node leftNode;

    private Node rightNode;

    public Node() {
    }

    public Node(Object data, Node leftNode, Node rightNode) {
        this.data = data;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }

    public Object getData() {
        return this.data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getLeftNode() {
        return this.leftNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public Node getRightNode() {
        return this.rightNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }

    public Node data(Object data) {
        this.data = data;
        return this;
    }

    public Node leftNode(Node leftNode) {
        this.leftNode = leftNode;
        return this;
    }

    public Node rightNode(Node rightNode) {
        this.rightNode = rightNode;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Node)) {
            return false;
        }
        Node node = (Node) o;
        return Objects.equals(data, node.data) && Objects.equals(leftNode, node.leftNode)
                && Objects.equals(rightNode, node.rightNode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, leftNode, rightNode);
    }

    @Override
    public String toString() {
        return "{" + " data='" + getData() + "'" + ", leftNode='" + getLeftNode() + "'" + ", rightNode='"
                + getRightNode() + "'" + "}";
    }

}
