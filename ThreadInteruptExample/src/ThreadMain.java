import java.math.BigInteger;

public class ThreadMain {

    public static void main(String[] args) {

        // Case 1: If We invoke th.interrupt then Interrupted Exception should be available in thread Class
        Thread th = new Thread(new InterruptedExceptionExample());
        th.start();
        th.interrupt();

        // Case 2: If We invoke th.interrupt and we didn't mention Interrupted Exception in thread then it will not terminate.
        //          In that case need to check Thread.currentThread.isInterrupted() if this line available in code then interrupt will return from thread and close those thread.
        Thread th1 = new Thread(new ThreadInterrupt(new BigInteger("201232"), new BigInteger("1000900")));
        th1.start();
        th1.interrupt();

        // Case 3 : If both of above scenario is not present then make thread as <h>th.setDeamon(true);</h>
        //          Once application terminate automatically this thread is also stop.
    }
}
