package se.ecutb.oscarjohannson.Models;

import se.ecutb.oscarjohannson.Products.Product;

public class VendingMachineIMPL implements VendingMachine {

    @Override
    public void addCurremncy(int amount) {

    }

    @Override
    public Product reguest(int productNumber) {
        return null;
    }

    @Override
    public int endSession() {
        return 0;
    }

    @Override
    public String getDescription(int productNumber) {
        return null;
    }

    @Override
    public int getBalance() {
        return 0;
    }

    @Override
    public String[] getProducts() {
        return new String[0];
    }
}