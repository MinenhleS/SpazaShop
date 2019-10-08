package machine;

import exceptions.ChocolateNotFoundException;
import exceptions.ProductNotFoundException;
import exceptions.SaltySnacksNotFoundException;
import exceptions.SoftDrinksNotFoundException;
import machine.VendingMachine;
import products.Chocolates;
import products.SaltySnacks;
import products.SoftDrinks;

public class RunMachine {

    public static void main(String[] args)  {
        try {
            Chocolates chocolates = new Chocolates();
            SaltySnacks saltySnacks = new SaltySnacks();
            SoftDrinks softDrinks = new SoftDrinks();

            VendingMachine vendingMachine = new VendingMachine();
            vendingMachine.addStock(chocolates, 3);
            vendingMachine.addStock(softDrinks, 3);
            vendingMachine.addStock(saltySnacks, 3);

            vendingMachine.buy(chocolates);
            vendingMachine.buy(chocolates);
//            vendingMachine.buy(chocolates);
//            vendingMachine.buy(chocolates);
            vendingMachine.getStock(chocolates);
            vendingMachine.buy(softDrinks);
            vendingMachine.getStock(softDrinks);
            vendingMachine.buy(softDrinks);
            vendingMachine.buy(softDrinks);
            vendingMachine.buy(softDrinks);
            vendingMachine.buy(softDrinks);

        }catch(SaltySnacksNotFoundException ex){
            System.out.println(ex);
        }catch(SoftDrinksNotFoundException ex){
            System.out.println(ex);
        }catch(ChocolateNotFoundException ex){
            System.out.println(ex);
        }catch(ProductNotFoundException ex){
            System.out.println(ex);
        }


    }

}
