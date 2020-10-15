import java.util.Iterator;

public class MyListIterator implements Iterator {

    private MyList myList;

    private Node currentNode;

    public MyListIterator(MyList myList) {
        this.myList = myList;
        this.currentNode = this.myList.getHeadNode();
    }

    @Override
    public boolean hasNext() {
        return currentNode != null;
    }

    @Override
    public Object next() {
        Object dataObject = currentNode.getData();
        currentNode = currentNode.getRightNode();
        return dataObject;
    }

}
