public class MyStack {

    private MyList stack;

    public MyStack() {
        this.stack = new MyList();
    }

    public int size() {
        return stack.size();
    }

    public void push(Object data) {
        stack.add(data);
    }

    public Object peek() {
        return ((Node) stack.get(stack.size() - 1)).getData();
    }

    public Object pop() {
        Object o = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
        return o;
    }

}
