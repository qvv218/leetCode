import java.util.Arrays;
import java.util.concurrent.ExecutionException;


public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("Start main class...");

        int[] var1 = new int[]{1,2,3};
        int[] var2 = new int[]{3,2,1};

        System.out.println(Arrays.equals(var1, var2));

        System.out.println("End main class...");
    }
}