package se.ecutb.oscarjohannson.Models;

import se.ecutb.oscarjohannson.Products.Product;

public interface VendingMachine {

    void addCurremncy(int amount);   //Adds to the moneyPool.
    Product reguest(int productNumber);     //buy a product.
    int endSession();   //Return change and nullify the moneyPool.
    String getDescription(int productNumber);       //Product description.
    int getBalance();   //return moneyPool.
    String[] getProducts();    //Return all product and product number.

}
