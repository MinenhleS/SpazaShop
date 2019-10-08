package machine;

import exceptions.*;
import products.Chocolates;
import products.Product;
import products.SaltySnacks;
import products.SoftDrinks;

public class MaxiVendingMachine extends VendingMachine{

    private int drinkCount = 0;
    private int chocolateCount = 0;
    private int snackCount = 0;



    public void buy(SoftDrinks softDrinks) throws ProductNotFoundException{
        if (drinkCount <= 0) {
            throw new SoftDrinksNotFoundException();

        } else {
            drinkCount--;

        }

    }


    public void buy(Chocolates chocolates) throws ProductNotFoundException {
        if (chocolateCount <= 0) {
            throw new ChocolateNotFoundException();

        } else {
            chocolateCount--;
        }
    }


    public void buy(SaltySnacks saltySnacks) throws ProductNotFoundException {
            if (snackCount <= 0) {
                throw new SaltySnacksNotFoundException();
            } else {

                snackCount--;
            }

    }


    public void buy(Product product)throws InvalidNotFoundException {
            throw new InvalidNotFoundException();

    }


    public void addStock(SoftDrinks softDrinks) {
            drinkCount++;
    }

    public void addStock(SaltySnacks saltySnacks) {
            snackCount++;
    }

    public void addStock(Chocolates chocolates) {
            chocolateCount++;
    }

    public void addStock(Product product) throws InvalidNotFoundException{

            throw new InvalidNotFoundException();
    }

}
