package target.threads.example4;

class Counter {
    public static long counter = 0;

    public static void increment() {
        Counter.counter++;
        System.out.printf(Counter.counter + " " + Thread.currentThread().getName() + '\n');
    }
}
