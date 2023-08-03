package target.threads.example6;

public class Producer implements Runnable {

    private SynchronizedClass synchronizedClass;

    public Producer(SynchronizedClass synchronizedClass) {
        this.synchronizedClass = synchronizedClass;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            synchronizedClass.put();
        }
    }
}
