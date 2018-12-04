package completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * https://www.callicoder.com/java-8-completablefuture-tutorial/
 *
 * The CompletableFuture.get() method is blocking. It waits until the Future is completed and returns the result after its completion.
 *
 * But, that’s not what we want right? For building asynchronous systems we should be able to attach a callback to the CompletableFuture which should automatically get called when the Future completes.
 *
 * That way, we won’t need to wait for the result, and we can write the logic that needs to be executed after the completion of the Future inside our callback function.
 *
 * You can attach a callback to the CompletableFuture using thenApply(), thenAccept() and thenRun() methods -
 *
 */
public class ThenApplyExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        // Create a CompletableFuture
        CompletableFuture<String> whatsYourNameFuture = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return "Rajeev";
        });

        // Attach a callback to the Future using thenApply()
        CompletableFuture<String> greetingFuture = whatsYourNameFuture.thenApply(name -> {
            return "Hello " + name;
        });

        // Block and get the result of the future.
        System.out.println(greetingFuture.get()); // Hello Rajeev



    }
}
