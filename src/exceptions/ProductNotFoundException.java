package exceptions;

public class ProductNotFoundException extends Exception{

    public ProductNotFoundException() {
        System.out.println("Product is Not found !");
    }
}
