package target.threads.example6;

public class Main {

    public static void main(String[] args) {
        SynchronizedClass synchronizedClass = new SynchronizedClass();

        Producer producer = new Producer(synchronizedClass);
        Consumer consumer = new Consumer(synchronizedClass);

        Thread threadProducer = new Thread(producer);
        Thread threadConsumer = new Thread(consumer);

        threadConsumer.start();
        threadProducer.start();
    }
}

