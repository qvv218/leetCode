package target.threads.example6;

class SynchronizedClass {

    private static int count = 0;
    private static Object lock = new Object();

    public void get() {
        synchronized (lock) {
            if (count < 1) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            count--;
            System.out.println("get count: " + count);
            lock.notify();
        }
    }

    public void put() {
        synchronized (lock) {
            if (count > 9) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            count++;
            System.out.println("put count: " + count);
            lock.notify();
        }
    }
}
