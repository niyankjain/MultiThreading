import java.math.BigInteger;

public class ThreadInterrupt implements Runnable{

    private final BigInteger base;
    private final BigInteger pow;

    ThreadInterrupt(BigInteger base, BigInteger pow) {
        this.base = base;
        this.pow = pow;
    }

    @Override
    public void run() {
        System.out.println("Inside run");
        System.out.println(base+"^"+pow+" = " +calculatePower(base,pow));
    }


    private BigInteger calculatePower(BigInteger base, BigInteger pow) {
        BigInteger result = BigInteger.ONE;
        for(BigInteger i= BigInteger.ZERO; i.compareTo(pow) !=0; i=i.add(BigInteger.ONE)) {
            System.out.println("Inside loop: "+i);
            if(Thread.currentThread().isInterrupted()){
                return BigInteger.ZERO;
            }
            result = result.multiply(base);
        }
        return result;
    }
}
