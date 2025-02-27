package edu.kis.vh.nursery.list;

public class IntLinkedList {

    private Node last;
    private int i;

    public void push(int i) {
        if (getLast() == null)
            setLast(new Node(i));
        else {
            getLast().next = new Node(i);
            getLast().next.setPrev(getLast());
            setLast(getLast().next);
        }
    }

    public boolean isEmpty() {
        return getLast() == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return -1;
        return getLast().getValue();
    }

    public int pop() {
        if (isEmpty())
            return -1;
        int ret = getLast().getValue();
        setLast(getLast().getPrev());
        return ret;
    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }
}
