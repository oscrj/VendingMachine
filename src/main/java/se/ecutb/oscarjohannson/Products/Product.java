package se.ecutb.oscarjohannson.Products;

public abstract class Product {

    private int[] acceptedBills = {1, 5, 10, 20, 50, 100, 500, 1000};

    //Constructor
    public Product(int[] acceptedBills) {
        this.acceptedBills = acceptedBills;
    }

    //Method to examine product and reveal some information about product.
    public String productInfo(){
        //Name
        //Prise
        //Calories
        //Allergies.
        //Volume
        return "";
    }

    public String useProduct(){
        return "Thanks for your purchase! Have a nice day!";
    }
}
