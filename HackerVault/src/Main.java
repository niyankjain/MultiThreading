import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static final int MAX_PASSWORD = 9999;
    public static void main(String[] args) {

        Random ran = new Random();
        Vault vault = new Vault(ran.nextInt(MAX_PASSWORD));

        List<Thread> list = new ArrayList<>();

        list.add(new AscendingHackerThread(vault));
        list.add(new DescendingHackerThread(vault));
        list.add(new PoliceThread());

        list.parallelStream().forEach(t -> t.start());
    }
}
