package target.threads.example8;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Main {

    public static long factorial;

    public static void main(String[] args) throws InterruptedException, ExecutionException {
//        CustomRunnable runnable = new CustomRunnable(5);
        CustomCallable callable = new CustomCallable(20);

        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        executorService.execute(runnable);
//        executorService.shutdown();
//        executorService.awaitTermination(20, TimeUnit.SECONDS);

        Future<Integer> future = executorService.submit(callable);
        factorial = future.get();
        executorService.shutdown();

        System.out.println("factorial: " + factorial);
    }
}
