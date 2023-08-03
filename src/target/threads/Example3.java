package target.threads;

public class Example3 {

    public volatile static boolean b = true;

    public static final Runnable runnable = () -> {
        long counter = 0;

        while (b) {
            counter++;
        }
        System.out.println("counter thread1: " + counter);
    };

    public static void main(String[] args) throws InterruptedException {
        System.out.println("main starts thread...");

        Thread thread1 = new Thread(runnable);
        thread1.start();

        Thread.sleep(3000);
        b = false;

        thread1.join();

        System.out.println("main ends thread...");
    }
}
