package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    /**
     * counting out class
     */
    private int totalRejected = 0;

    /**
     * return total rejected int
     */
    public int reportRejected() {
        return totalRejected;
    }

    /**
     * counting total rejected
     * @param in input number to count in
     */
    @Override
    public void countIn(int in) {
        if (!callCheck() && in > getLastNumber())
            totalRejected++;
        else
            super.countIn(in);
    }
}
