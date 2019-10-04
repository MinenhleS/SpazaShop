package LocalShop;

import Exceptions.ProductNotFoundException;

public class RunMachine {

    public static void main(String[] args) throws ProductNotFoundException {



        Chocolates chocolates = new Chocolates();
        SaltySnacks saltySnacks= new SaltySnacks();
        SoftDrinks softDrinks = new SoftDrinks();

        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.addStock(chocolates, 3);
        vendingMachine.addStock(softDrinks, 3);
        vendingMachine.addStock(saltySnacks, 3);

        vendingMachine.buy(chocolates);
        vendingMachine.buy(chocolates);
        vendingMachine.buy(chocolates);
        vendingMachine.buy(chocolates);
        vendingMachine.getStock(chocolates);
        vendingMachine.buy(softDrinks);
        vendingMachine.getStock(softDrinks);



    }

}
