public class PoliceThread extends Thread{

    @Override
    public void run () {
        for (int i=10; i>=1 ; i--) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println(i);
        }
        System.out.println("Game over for you hackers: "+AscendingHackerThread.attempts);

        System.exit(0);
    }
}
