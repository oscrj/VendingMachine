package se.ecutb.oscarjohannson;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import se.ecutb.oscarjohannson.Models.VendingMachineIMPL;
import se.ecutb.oscarjohannson.Products.Fruits;
import se.ecutb.oscarjohannson.Products.Product;
import se.ecutb.oscarjohannson.Products.Snacks;
import se.ecutb.oscarjohannson.Products.Soda;

public class AppTest {

    private VendingMachineIMPL testObject;
    private Product cocaCola;
    private Product Snickers;
    private Product apple;

    @Before
    public void setUp(){
        //Products in vending machine
        cocaCola = new Soda(15,"Coca-cola",1, 200);
        Snickers = new Snacks(25, "Snickers", 2, 340);
        apple = new Fruits(10, "Apple", 3, 100);
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
        int productNumber = 1;
        //Create expected Product and give it value cocaCola.
        Product expected = cocaCola;
        //Create product actual and call method request and give it product number.
        Product actual = testObject.request(productNumber);
        //Assert
        Assert.assertEquals(expected ,actual);
    }
    @Test
    public void testEndSession(){
        //Add money to Vending machine.
        testObject.addCurrency(100);
        int expected = 100;
        int actual = testObject.endSession();
        //Assert.
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testGetDescription(){
        //Set prductNumber to value 1.
        int productNumber = 1;
        //Expected string.
        String expected = "price = 15, name = Coca-cola, productNumber = 1, calories = 200";
        //Actual string.
        String actual = testObject.getDescription(productNumber);
        //Assert.
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testGetProducts(){
        String[] expected = {"Productnumber: 1Product name: Coca-cola",
                            "Productnumber: 2Product name: Snickers",
                            "Productnumber: 3Product name: Apple"};
        String[] actual = testObject.getProducts();
        Assert.assertArrayEquals(expected, actual);
        }

}
