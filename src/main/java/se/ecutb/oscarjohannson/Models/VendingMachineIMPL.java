package se.ecutb.oscarjohannson.Models;

import se.ecutb.oscarjohannson.Products.Product;

public class VendingMachineIMPL implements VendingMachine {


    private Product[] products;
    private int moneyPool;      //Store amount of money you put in machine.

    //constructor that take array Product and set moneyPool to zero.
    public VendingMachineIMPL(Product[] products) {
        this.products = products;
        this.moneyPool = 0;
    }

    @Override
    public void addCurrency(int amount) {
        //Accepted currency.
        int[] acceptedCurrency = {1, 5, 10, 20, 50, 100, 500, 1000};

        //Check if amount is equal in acceptedCurrency.
        for(int currency : acceptedCurrency ){
            if(amount == currency){
                moneyPool += amount;
                break;
            }
        }
    }

    private Product findProduct(int productNumber){
        for(Product product : products){
            if(product.getProductNumber() == productNumber){
                return product;
            }
        }
        return null;
    }

    @Override
    public Product request(int productNumber) {

        Product product = findProduct(productNumber);
        // check if product cost more than current amount.
        if(product.getPrice() > moneyPool){
            return null; // return null
        }
        // money gets withdrawn from moneyPool.
        moneyPool -= product.getPrice();
        return product;
    }
    @Override
    public int endSession() {
        //Give change value of moneyPool.
        int change = moneyPool;
        //Set moneyPool to zero.
        moneyPool = 0;
        //return change to customer.
        return change;

    }
    @Override
    public String getDescription(int productNumber) {

        Product product = findProduct(productNumber);
        //if product equals null
        if(product == null){
            System.out.println("Cant find product!");
        }
        //return product info using examine() method.
        return product.examine();
    }

    @Override
    public int getBalance() {
        return moneyPool;
    }

    @Override
    public String[] getProducts() {
        //Creating a new string to store products name and productNumber.
        String[] showProduct = new String[products.length];

        //Search array products and store  every product in new array and whit product name and number.
        for(int i = 0; i < products.length; i++){
            showProduct[i] = products[i].showProducts();
        }

        return showProduct;
    }
}
