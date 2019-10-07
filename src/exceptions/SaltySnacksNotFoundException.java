package exceptions;

public class SaltySnacksNotFoundException extends ProductNotFoundException {

    public SaltySnacksNotFoundException(){
        System.out.println("Salty Snack is not found!");
    }
}
