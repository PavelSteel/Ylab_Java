package HW_Lesson02;

public class StatsAccumulatorImpl implements StatsAccumulator {
    private int currentNumber;
    private int lastNumber;
    private int count = 0;
    private int min;
    private int max;
    private double avg;


    @Override
    public void add(int value) {
        if (count == 0) {
            currentNumber = value;
            min = value;
            max = value;
            avg = value;
        } else {
            if (lastNumber != 0)
                currentNumber = lastNumber;
            lastNumber = value;
            getAvg();
            getMax();
            getMin();
        }
        count++;
    }

    @Override
    public int getMin() {
        if (count > 1) {
            if (lastNumber < min) {
                min = lastNumber;
            }
        }
        return min;
    }

    @Override
    public int getMax() {
        if (count > 1) {
            if (lastNumber > max) {
                max = lastNumber;
            }
        }
        return max;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public Double getAvg() {
        if (count != 0 && count > 1) {
            avg = (double) (currentNumber + lastNumber) / count;
        } else if (count == 1) {
            avg = currentNumber;
        }
        return avg;
    }
}
