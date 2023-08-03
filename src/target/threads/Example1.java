package target.threads;

public class Example1 {

    private static final Runnable runnable1 = () -> {
        for (int i = 0; i <= 1000; i++) {
            System.out.println(i);
        }
    };

    private static final Runnable runnable2 = () -> {
        for (int i = 1000; i >= 0; i--) {
            System.out.println(i);
        }
    };

    public static void main(String[] args) {
        System.out.println("main starts class...");

        final Thread thread1 = new Thread(runnable1);
        final Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();

        System.out.println("main ends class...");
    }
}
