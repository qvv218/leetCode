package target.threads.example8;

import java.util.concurrent.Callable;

public class CustomCallable implements Callable<Integer> {

    private int var1;

    CustomCallable(int value) {
        this.var1 = value;
    }

    @Override
    public Integer call() throws Exception {

        System.out.println("ThreadName " + Thread.currentThread().getName());

        if (var1 < 1) {
            throw new Exception("var1 < 1");
        }

        int result = 1;

        for (int i = 1; i <= var1; i++) {
            result *= i;
        }

        return result;
    }
}
