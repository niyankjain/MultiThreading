import java.math.BigInteger;

public class FactorialThread implements Runnable{

    private final long factorialNumber;
    private BigInteger factResult;
    private boolean isFininshed=false;

    public FactorialThread(long factorialNumber) {
        this.factorialNumber = factorialNumber;
    }

    @Override
    public void run() {
        this.factResult = calculateFactorial(factorialNumber);
        this.isFininshed = true;
    }

    private BigInteger calculateFactorial(long number) {
        BigInteger result = BigInteger.ONE;
        for(long fact = number; fact>=1l ; fact--) {
            result = result.multiply(new BigInteger(Long.toString(fact)));
        }
        return result;
    }

    public boolean isFinished() {
        return isFininshed;
    }

    public BigInteger getFactorial() {
        return this.factResult;
    }

}
