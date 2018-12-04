package completablefuture;

import java.util.concurrent.*;
import java.util.function.Supplier;

/**
 *
 *
 */
public class SupplyAsyncExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        //If you want to run some background task asynchronously and don’t want to return anything from the task, then you can use CompletableFuture.runAsync() method
        // Using Lambda Expression
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            // Simulate a long-running Job
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            System.out.println("I'll run in a separate thread than the main thread.");
        });


        //
        // Run a task specified by a Supplier object asynchronously
        CompletableFuture<String> supplyAsyncFuture = CompletableFuture.supplyAsync(new Supplier<String>() {
            @Override
            public String get() {
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    throw new IllegalStateException(e);
                }
                return "Result of the asynchronous computation 1";
            }
        });

        // Block and get the result of the Future
        String result = supplyAsyncFuture.get();
        System.out.println(result);


        //With Executor
        Executor executor = Executors.newFixedThreadPool(10);
        CompletableFuture<String> executorFuture = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return "Result of the asynchronous computation 2";
        }, executor);

        String result2 = executorFuture.get();
        System.out.println(result2);

    }
}
