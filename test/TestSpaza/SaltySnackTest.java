package TestSpaza;

import exceptions.ChocolateNotFoundException;
import exceptions.ProductNotFoundException;
import machine.MaxiVendingMachine;
import org.junit.Assert;
import org.junit.Test;
import products.SaltySnacks;


public class SaltySnackTest {

    @Test
    public void shouldAddStockForSoftDrinks() {

        MaxiVendingMachine maxiVendingMachine = new MaxiVendingMachine();

        SaltySnacks saltySnacks = new SaltySnacks();

        maxiVendingMachine.addStock(saltySnacks);
        maxiVendingMachine.addStock(saltySnacks);
        maxiVendingMachine.addStock(saltySnacks);




        Assert.assertEquals(maxiVendingMachine.getSnackCount(), 3);

    }


    @Test
    public void shouldBuySoftDrinks() {

        MaxiVendingMachine maxiVendingMachine = new MaxiVendingMachine();

        SaltySnacks saltySnacks = new SaltySnacks();

        maxiVendingMachine.addStock(saltySnacks);
        maxiVendingMachine.addStock(saltySnacks);
        maxiVendingMachine.addStock(saltySnacks);

        try {


            maxiVendingMachine.buy(saltySnacks);
            maxiVendingMachine.buy(saltySnacks);


        }catch(ChocolateNotFoundException ex){
            System.out.println(ex);
        }
        catch (ProductNotFoundException ex){
            System.out.println(ex);
        }


        Assert.assertEquals(maxiVendingMachine.getSnackCount(), 1);

    }



    @Test
    public void shouldCatchSoftDrinkException() {

        MaxiVendingMachine maxiVendingMachine = new MaxiVendingMachine();

        SaltySnacks saltySnacks = new SaltySnacks();

        maxiVendingMachine.addStock(saltySnacks);
        maxiVendingMachine.addStock(saltySnacks);
        maxiVendingMachine.addStock(saltySnacks);


        try {


            maxiVendingMachine.buy(saltySnacks);
            maxiVendingMachine.buy(saltySnacks);
            maxiVendingMachine.buy(saltySnacks);
            maxiVendingMachine.buy(saltySnacks);


        }catch(ChocolateNotFoundException ex){
            System.out.println(ex);
        }
        catch (ProductNotFoundException ex){
            System.out.println(ex);
        }


        Assert.assertEquals(maxiVendingMachine.getSnackCount(), 0);

    }

}
