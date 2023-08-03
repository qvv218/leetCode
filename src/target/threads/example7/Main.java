package target.threads.example7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class Main {

    private static final Runnable runnable = () -> {
        try {
            String name = Thread.currentThread().getName();
            System.out.println(name);
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    };

    public static void main(String[] args) throws InterruptedException {
        System.out.println("main starts...");

        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(10);

//        IntStream.range(0, 10).forEach(i ->
//            executorService.execute(runnable)
//        );

          executorService.scheduleWithFixedDelay(runnable, 2, 1, TimeUnit.SECONDS);
//        executorService.scheduleAtFixedRate(runnable, 2, 1, TimeUnit.SECONDS);
//        executorService.awaitTermination(2, TimeUnit.SECONDS);

        Thread.sleep(20000);
        executorService.shutdown();

        System.out.println("main ends...");
    }
}
