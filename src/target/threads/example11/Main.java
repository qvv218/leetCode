package target.threads.example11;

import java.util.concurrent.CountDownLatch;
import java.util.function.Function;

public class Main {

    private static final CountDownLatch count = new CountDownLatch(3);
    private static Function<Void, Void> customFunction = unused -> {
        count.countDown();
        System.out.println(count.getCount());

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return null;
    };

    public static void main(String[] args) {
        Runnable runnable = () -> {
            try {
                count.await();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread name > " + Thread.currentThread().getName());
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);

        thread1.start();
        thread2.start();
        thread3.start();

        customFunction.apply(null);
        customFunction.apply(null);
        customFunction.apply(null);
    }
}
