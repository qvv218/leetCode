package target.threads.example13;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

//        CompletableFuture<String> whatsYourNameFuture = CompletableFuture.supplyAsync(() -> {
//            try {
//                TimeUnit.SECONDS.sleep(1);
//            } catch (InterruptedException e) {
//                throw new IllegalStateException(e);
//            }
//            System.out.println(Thread.currentThread().getName());
//            return ",world";
//        });
//
//        // Attach a callback to the Future using thenApply()
//        CompletableFuture<String> greetingFuture = whatsYourNameFuture.thenApply(name -> {
//            System.out.println(Thread.currentThread().getName());
//            return "Hello " + name;
//        });
//
//        System.out.println(Thread.currentThread().getName() + " ends");
//        System.out.println(greetingFuture.get());

//        CompletableFuture.supplyAsync(() -> 11L)
//                .thenApply(aLong -> aLong + 11L)
//                .thenApply(aLong -> aLong + 11L)
//                .thenAccept(aLong -> System.out.println("result long: " + aLong))
//                .thenRun(() -> System.out.println("end"));


        CompletableFuture.supplyAsync(() -> "Hello")
                .thenCompose(s -> CompletableFuture.supplyAsync(() -> " ,world").thenApply(s1 -> s + s1))
                .thenAccept(s -> System.out.println(s));
    }
}
