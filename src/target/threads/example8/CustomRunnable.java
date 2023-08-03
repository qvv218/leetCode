package target.threads.example8;

public class CustomRunnable implements Runnable {

    private long var1;

    CustomRunnable(long value) {
        this.var1 = value;
    }

    @Override
    public void run() {
        if (var1 < 1) {
            return;
        }

        int result = 1;

        for (int i = 1; i <= var1; i++) {
            result *= i;
        }

        Main.factorial = result;
    }
}
