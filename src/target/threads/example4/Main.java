package target.threads.example4;

import java.util.stream.IntStream;

public class Main {

    private static final Runnable runnable = () -> {
        IntStream.range(0, 100000).forEach(i ->
            Counter.increment());
    };

    public static void main(String[] args) {
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        Thread thread4 = new Thread(runnable);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}

