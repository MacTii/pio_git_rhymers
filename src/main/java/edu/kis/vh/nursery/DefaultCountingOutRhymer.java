package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private final int SIZE = 12;
    private final int FULL = 11;
    private final int CHECK = -1;

    private final int[] numbers = new int[SIZE];

    private int total = -1;

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotal() {
        return total;
    }

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == CHECK;
    }

    public boolean isFull() {
        return total == FULL;
    }

    protected int getLastNumber() {
        if (callCheck())
            return -1;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }

}
