package target.threads.example9;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    private static long max = 1_000_000_000;
    private static long result = 0;

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newWorkStealingPool(10);
        List<Future<Long>> futures = new ArrayList<>();
        long value = max / 10;

        for (int i = 0; i < 10; i++) {
            long from = value * i;
            long to = value * (i + 1);
            CustomCallable callable = new CustomCallable(from, to);
            Future<Long> future = executorService.submit(callable);
            futures.add(future);
        }


        for (Future<Long> future: futures) {
            result += future.get();
        }

        executorService.shutdown();

        System.out.println("result: " + result);
    }
}
