package completablefuture;

public class ProductService {


    private static Product product = new Product(1, "one", "one_detail");

    public static Product getProductDetail(){

        return product;
    }

    public static String getName(){
        return product.getName();
    }
}
