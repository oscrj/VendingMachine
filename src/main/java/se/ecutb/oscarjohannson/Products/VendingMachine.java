package se.ecutb.oscarjohannson.Products;

public interface VendingMachine {

    //Adds to the moneyPool.
    void addCurremncy(int amount);
    //buy a product.
    Product reguest(int productNumber);
    //Return change and nullify the moneyPool.
    int endSession();
    //Product description.
    String getDescription(int productNumber);
    //return moneyPool.
    int getBalance();
    //Return all product and product number.
    String[] getProducts();

}
