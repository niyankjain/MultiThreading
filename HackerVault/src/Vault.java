public class Vault {

    private int password;
    Vault(int password) {
        System.out.println("Password is: "+password);
        this.password = password;
    }

    public boolean isCorrectPasswordMethod(int guess) {
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
        }
        return password == guess;
    }

}
