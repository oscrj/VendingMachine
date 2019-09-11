package se.ecutb.oscarjohannson.Models;

import se.ecutb.oscarjohannson.Products.Product;

import java.sql.SQLOutput;
import java.util.Arrays;

public class VendingMachineIMPL implements VendingMachine {


    private Product[] products;
    private int moneyPool = 0;      //Store amount of money you put in machine.

    //constructor that take array Product and set moneyPool to zero.
    public VendingMachineIMPL(Product[] products) {
        this.products = products;
        this.moneyPool = 0;
    }

    @Override
    public void addCurrency(int amount) {
        int[] acceptedCurrency = {1, 5, 10, 20, 50, 100, 500, 1000};

        //Check if amount is equal in acceptedCurrency.
        for(int currency : acceptedCurrency ){
            if(amount == currency){
                moneyPool += amount;
            }else{
                System.out.println("Invalid amount.");
            }
        }
    }
    @Override
    public Product request(int productNumber) {
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
