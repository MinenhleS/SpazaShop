package TestSpaza;

import exceptions.ChocolateNotFoundException;
import exceptions.ProductNotFoundException;
import machine.MaxiVendingMachine;
import org.junit.Assert;
import org.junit.Test;
import products.SoftDrinks;

public class SofDrinkTests {


    @Test
    public void shouldAddStockForSoftDrinks() {

        MaxiVendingMachine maxiVendingMachine = new MaxiVendingMachine();

        SoftDrinks softDrinks = new SoftDrinks();

        maxiVendingMachine.addStock(softDrinks);
        maxiVendingMachine.addStock(softDrinks);
        maxiVendingMachine.addStock(softDrinks);
        maxiVendingMachine.addStock(softDrinks);




        Assert.assertEquals(maxiVendingMachine.getDrinkCount(), 4);

    }


    @Test
    public void shouldBuySoftDrinks() {

        MaxiVendingMachine maxiVendingMachine = new MaxiVendingMachine();

        SoftDrinks softDrinks = new SoftDrinks();

        maxiVendingMachine.addStock(softDrinks);
        maxiVendingMachine.addStock(softDrinks);
        maxiVendingMachine.addStock(softDrinks);
        maxiVendingMachine.addStock(softDrinks);

        try {


            maxiVendingMachine.buy(softDrinks);
            maxiVendingMachine.buy(softDrinks);


        }catch(ChocolateNotFoundException ex){
            System.out.println(ex);
        }
        catch (ProductNotFoundException ex){
            System.out.println(ex);
        }


        Assert.assertEquals(maxiVendingMachine.getDrinkCount(), 2);

    }



    @Test
    public void shouldCatchSoftDrinkException() {

        MaxiVendingMachine maxiVendingMachine = new MaxiVendingMachine();

        SoftDrinks softDrinks = new SoftDrinks();

        maxiVendingMachine.addStock(softDrinks);
        maxiVendingMachine.addStock(softDrinks);
        maxiVendingMachine.addStock(softDrinks);
        maxiVendingMachine.addStock(softDrinks);


        try {


            maxiVendingMachine.buy(softDrinks);
            maxiVendingMachine.buy(softDrinks);
            maxiVendingMachine.buy(softDrinks);
            maxiVendingMachine.buy(softDrinks);
            maxiVendingMachine.buy(softDrinks);


        }catch(ChocolateNotFoundException ex){
            System.out.println(ex);
        }
        catch (ProductNotFoundException ex){
            System.out.println(ex);
        }


        Assert.assertEquals(maxiVendingMachine.getDrinkCount(), 0);

    }




}
