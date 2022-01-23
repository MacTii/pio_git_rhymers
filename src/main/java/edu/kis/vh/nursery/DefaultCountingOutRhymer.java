package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public final int SIZE = 12;
    public final int FULL = 11;
    public final int CHECK = -1;

    private final int[] numbers = new int[SIZE];

    public int total = -1;

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
