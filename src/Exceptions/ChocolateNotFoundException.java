package Exceptions;

public class ChocolateNotFoundException extends ProductNotFoundException {

    public ChocolateNotFoundException(){
        System.out.println("Chocolates are not found !");
    }
}
