package machine;

import exceptions.*;
import products.Chocolates;
import products.Product;
import products.SaltySnacks;
import products.SoftDrinks;

public class VendingMachine {

    private int stockCount = 0;
    private int drinkCount = 0;
    private int chocolateCount = 0;
    private int snackCount = 0;


    //ArrayList<Product> productType = new ArrayList<Product>();

    public void buy(Product product) throws ProductNotFoundException {
        if (product instanceof Product) {
            if (product instanceof Chocolates) {
                if (chocolateCount <= 0) {
                    throw new ChocolateNotFoundException();

                } else {
                    chocolateCount--;
                    stockCount--;
                }
            } else if (product instanceof SoftDrinks) {
                if (drinkCount <= 0) {
                    throw new SoftDrinksNotFoundException();

                } else {
                    drinkCount--;
                    stockCount--;
                }
            } else if (product instanceof SaltySnacks) {
                if (snackCount <= 0) {
                    throw new SaltySnacksNotFoundException();
                } else {

                    snackCount--;
                    stockCount--;
                }
            } else {
                throw new ProductNotFoundException();
            }

        } else {
            throw new InvalidNotFoundException();
        }

        //System.out.print(stockCount);
    }


    public void addStock(Product product, int newStock) {
        if (product instanceof Chocolates) {
            chocolateCount += newStock;
        } else if (product instanceof SoftDrinks) {
            drinkCount += newStock;
        } else if (product instanceof SaltySnacks) {
            snackCount += newStock;
        }

        stockCount += newStock;
    }


    public void getStock(Product product) {
        System.out.println("\n   ");
        if(product instanceof Chocolates){
            System.out.println(chocolateCount + " of chocolate available");
        }else if(product instanceof SoftDrinks){
            System.out.println(drinkCount + " of drinks available");
        }else if(product instanceof SaltySnacks){
            System.out.println(snackCount + " of snack available");
        }else{
            System.out.println(" Invalid product");
        }

    }


}

