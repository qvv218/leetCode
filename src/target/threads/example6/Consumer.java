package target.threads.example6;

public class Consumer implements Runnable {

    private SynchronizedClass synchronizedClass;

    Consumer(SynchronizedClass synchronizedClass) {
        this.synchronizedClass = synchronizedClass;
    }

    @Override
    public void run() {
        for (int i = 100; i > 0; i--) {
            synchronizedClass.get();
        }
    }
}
