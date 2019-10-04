package Exceptions;

public class InvalidNotFoundException extends RuntimeException {
    public InvalidNotFoundException(){
        System.out.println("This product is invalid");
    }
}
