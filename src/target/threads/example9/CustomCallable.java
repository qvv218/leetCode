package target.threads.example9;

import java.util.concurrent.Callable;

public class CustomCallable implements Callable<Long> {

    private long from;
    private long to;
    private long localSum;

    CustomCallable(long from, long to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public Long call() throws Exception {
        for (long i = from; i <= to; i++) {
            localSum += i;
        }

        System.out.println("threadName: " + Thread.currentThread().getName() + " from: " + from + " to: " + to + " sum: " + localSum);
        return localSum;
    }
}
