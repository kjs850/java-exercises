package completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class ThenAcceptExample {

    public static void main(String[] args) {

        // thenAccept() example
        CompletableFuture.supplyAsync(() -> {
            return ProductService.getProductDetail();
        }).thenAccept(product -> {
            System.out.println("Got product detail from remote service: " + product.getName());
        });


        CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return "Some Result";
            }).thenApply(result -> {
            /*
              Executed in the same thread where the supplyAsync() task is executed
              or in the main thread If the supplyAsync() task completes immediately (Remove sleep() call to verify)
            */
                return "Processed Result";
            });
    }
}
