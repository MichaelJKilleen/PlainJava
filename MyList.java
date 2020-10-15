import java.util.Iterator;

import javax.management.relation.RoleUnresolved;

public class MyList {

    Node headNode;

    int size = 0;

    public MyList() {
        headNode = null;
    }

    public Node add(Object o) {
        Node currentNode = headNode;
        if (headNode == null) {
            headNode = new Node(o, null, null);
            size = 1;
            return headNode;
        } else {

            while (currentNode.getRightNode() != null) {
                currentNode = currentNode.getRightNode();
            }
            Node newNode = new Node(o, currentNode, null);
            currentNode.setRightNode(newNode);
            newNode.setLeftNode(currentNode);
            size++;
            return newNode;
        }
    }

    public void remove(int idx) {
        if (idx < size && idx > -1) {
            Node currentNode = getNode(idx);
            Node leftNode = currentNode.getLeftNode();
            Node rightNode = currentNode.getRightNode();
            if (leftNode != null) {
                leftNode.setRightNode(currentNode.getRightNode());
            }
            if (rightNode != null) {
                rightNode.setLeftNode(leftNode);
            }
            if (idx == 0) {
                headNode = rightNode;
            }
            currentNode = null;
            size--;
            System.out.println("Wait");
        }
    }

    public int size() {
        return size;
    }

    public Node getNode(int index) {
        Node currentNode = headNode;
        if (index > -1 && index < size) {
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.getRightNode();
            }
        }
        return currentNode;
    }

    public Object get(int index) {
        return getNode(index).getData();
    }

    public Iterator getIterator() {
        return new MyListIterator(this);
    }

    protected Node getHeadNode() {
        return headNode;
    }
}
