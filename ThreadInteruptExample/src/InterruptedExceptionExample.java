public class InterruptedExceptionExample implements Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            System.out.println("Thread is interupted");

        }
    }

}
