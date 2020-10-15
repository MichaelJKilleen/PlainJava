public class MyQueue {

    private MyList queue;

    public MyQueue() {
        this.queue = new MyList();
    }

    public void enqueue(Object data) {
        queue.add(data);
    }

    public Object dequeue() {
        Object data = queue.get(0);
        queue.remove(0);
        return data;
    }

    public int size() {
        return queue.size();
    }

}
