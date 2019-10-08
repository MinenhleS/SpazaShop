package TestSpaza;

import exceptions.ChocolateNotFoundException;
import exceptions.ProductNotFoundException;
import machine.MaxiVendingMachine;
import machine.VendingMachine;
import org.junit.Test;
import products.Chocolates;

public class MaxiVendingMachineTests {

        @Test
        public void shouldBuyChocolates() {
                try {
                        VendingMachine vendingMachine = new VendingMachine();
                        MaxiVendingMachine maxiVendingMachine = new MaxiVendingMachine();

                        Chocolates chocolates = new Chocolates();

                        MaxiVendingMachine.buy(chocolates);
                        
                }catch(ChocolateNotFoundException ex){
                        System.out.println(ex);
                }
        }
}
