package HW_Lesson02;

public class RateLimitedPrinter {
    private final int interval;
    private long startTime;

    public RateLimitedPrinter(int interval) {
        this.interval = interval;
        startTime = System.currentTimeMillis();
    }
    public void print(String message) {
        long currentTime = System.currentTimeMillis();
        if (currentTime-startTime > interval){
            System.out.println(message);
            startTime = System.currentTimeMillis();
        }

    }


}
