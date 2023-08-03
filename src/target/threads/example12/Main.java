package target.threads.example12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Exchanger;

public class Main {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger();

        CustomThread customThread1 = new CustomThread("test1", exchanger);
        CustomThread customThread2 = new CustomThread("test2", exchanger);
        CustomThread customThread3 = new CustomThread("test3", exchanger);
        CustomThread customThread4 = new CustomThread("test4", exchanger);

        customThread1.start();
        customThread2.start();
        customThread3.start();
        customThread4.start();
    }
}
