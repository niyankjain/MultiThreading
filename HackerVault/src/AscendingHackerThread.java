public class AscendingHackerThread extends HackerThread{
    protected static int attempts;

    public AscendingHackerThread(Vault vault) {
        super(vault);
    }

    @Override
    public void run() {
        for (int guess=0; guess<Main.MAX_PASSWORD ; guess++) {
            attempts++;
            if(vault.isCorrectPasswordMethod(guess)) {
                System.out.println(this.getName()+" guessed the password: "+guess);
                System.exit(0);
            }
        }
    }

}
