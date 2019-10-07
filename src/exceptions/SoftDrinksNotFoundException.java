package exceptions;

public class SoftDrinksNotFoundException extends ProductNotFoundException{

    public SoftDrinksNotFoundException(){
        System.out.println("Soft Drinks are not found !");
    }
}
