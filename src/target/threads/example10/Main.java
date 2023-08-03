package target.threads.example10;

import java.util.concurrent.Semaphore;

public class Main {

    private static final Semaphore semaphore = new Semaphore(2);
    private static final Runnable runnable = () -> {
        System.out.println("start " + Thread.currentThread().getName());
        try {
            semaphore.acquire();
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            semaphore.release();
        }
        System.out.println("end " + Thread.currentThread().getName());
    };

    public static void main(String[] args) {
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        Thread thread4 = new Thread(runnable);
        Thread thread5 = new Thread(runnable);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
