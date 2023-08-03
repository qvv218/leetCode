package target.threads.example12;

import java.util.concurrent.Exchanger;

public class CustomThread extends Thread {
    private String value;
    private Exchanger<String> exchanger;

    CustomThread(String value, Exchanger<String> exchanger) {
        this.value = value;
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        try {
            System.out.println("thread name: " + Thread.currentThread().getName() + " value " + value);
            String var1 = exchanger.exchange(value);
            Thread.sleep(2000);
            System.out.println("thread name: " + Thread.currentThread().getName() + " got a value > " + var1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
