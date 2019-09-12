package se.ecutb.oscarjohannson;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import se.ecutb.oscarjohannson.Models.VendingMachine;
import se.ecutb.oscarjohannson.Models.VendingMachineIMPL;
import se.ecutb.oscarjohannson.Products.Fruits;
import se.ecutb.oscarjohannson.Products.Product;
import se.ecutb.oscarjohannson.Products.Snacks;
import se.ecutb.oscarjohannson.Products.Soda;

import java.util.PriorityQueue;


public class AppTest {

    private VendingMachineIMPL testObject;
    private Product cocaCola;
    private Product Snickers;
    private Product apple;

    @Before
    public void setUp(){
        //Products in vending machine
        cocaCola = new Soda(15,"Coca-cola",001, 200);
        Snickers = new Snacks(25, "Snickers", 002, 340);
        apple = new Fruits(10, "Apple", 003, 100);
        //Put products in array test.
        Product[] test = {cocaCola, Snickers, apple};
        //Instancing class VendingMachine and give it Product array test.
        testObject = new VendingMachineIMPL(test);

    }
    @Test
    public void testAddMoney(){
        //Arrange
        int expected = 100;
        //Add money to vendingMachine.
        testObject.addCurrency(100);
        //Get balance in vendingMachine.
        int actual = testObject.getBalance();

        //Act & Assert.
        Assert.assertEquals(expected ,actual);
    }

    @Test
    public void testRequest(){
        //Add money to vendingMachine.
        testObject.addCurrency(100);
        //Give productNumber value 001.
        int productNumber = 001;
        //Create expected Product and give it value cocaCola.
        Product expected = cocaCola;
        //Create product actual and call method request and give it product number.
        Product actual = testObject.request(productNumber);
        Assert.assertEquals(expected ,actual);

    }
    @Test
    public void testEndSession(){

    }
    @Test
    public void testGetDescription(){

    }
    @Test
    public void testGetBalance(){

    }

}
