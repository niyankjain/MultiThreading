import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreadJoiningMain {
    public static void main(String[] args) throws InterruptedException {

        List<Long> inputNumbers = Arrays.asList(0l,10000000l, 3435l, 35435l, 2324l, 4656l, 23l, 5556l);

        List<FactorialThread> list = new ArrayList<>();

        List<Thread> list1= new ArrayList<>();


        for(Long input: inputNumbers) {
            list.add(new FactorialThread(input));
        }

        for(FactorialThread th : list) {
            Thread thread = new Thread(th);
            list1.add(thread);
            thread.setDaemon(true);
            thread.start();
        }

        for(Thread th: list1) {
            th.join(2000);
        }
        for(int i=0; i<inputNumbers.size();i++) {
            FactorialThread thread = list.get(i);
            if(thread.isFinished()) {
                System.out.println("Factorial of "+inputNumbers.get(i)+" is: "+thread.getFactorial());
            }else{
                System.out.println("The calculation for "+inputNumbers.get(i)+" is still in progress");
            }
        }
    }

}
