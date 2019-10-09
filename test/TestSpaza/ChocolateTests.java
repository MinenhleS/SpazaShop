package TestSpaza;

import exceptions.ChocolateNotFoundException;
import exceptions.ProductNotFoundException;
import machine.MaxiVendingMachine;
import org.junit.Assert;
import org.junit.Test;
import products.Chocolates;
import products.SaltySnacks;

public class ChocolateTests {


        @Test
        public void shouldAddStockForChocolates() {

                MaxiVendingMachine maxiVendingMachine = new MaxiVendingMachine();

                Chocolates chocolates = new Chocolates();

                        maxiVendingMachine.addStock(chocolates);
                        maxiVendingMachine.addStock(chocolates);



                Assert.assertEquals(maxiVendingMachine.getChocolateCount(), 2);

        }


        @Test
        public void shouldBuyChocolates() {

                MaxiVendingMachine maxiVendingMachine = new MaxiVendingMachine();
                Chocolates chocolates = new Chocolates();

                maxiVendingMachine.addStock(chocolates);
                maxiVendingMachine.addStock(chocolates);

                try {


                        maxiVendingMachine.buy(chocolates);


                }catch(ChocolateNotFoundException ex){
                        System.out.println(ex);
                }
                catch (ProductNotFoundException ex){
                        System.out.println(ex);
                }


                Assert.assertEquals(maxiVendingMachine.getChocolateCount(), 1);

        }



        @Test
        public void shouldCatchChocolateException() {

                MaxiVendingMachine maxiVendingMachine = new MaxiVendingMachine();
                Chocolates chocolates = new Chocolates();

                maxiVendingMachine.addStock(chocolates);
                maxiVendingMachine.addStock(chocolates);


                try {


                        maxiVendingMachine.buy(chocolates);
                        maxiVendingMachine.buy(chocolates);
                        maxiVendingMachine.buy(chocolates);


                }catch(ChocolateNotFoundException ex){
                        System.out.println(ex);
                }
                catch (ProductNotFoundException ex){
                        System.out.println(ex);
                }


                Assert.assertEquals(maxiVendingMachine.getChocolateCount(), 0);

        }







}