package target.threads.example5;

public class Main {
    public static Long counter = 0L;

    private static final Runnable runnable = () -> {
        for (int i = 0; i < 10000; i++) {
            Main.increment();
        }
    };

    public static void increment() {
        counter++;
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();

        System.out.println("counter result: " + counter);
    }
}
