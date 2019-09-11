package se.ecutb.oscarjohannson.Products;

public class Fruits extends Product {

    //Constructor
    public Fruits(int price, String name, int productName, int calories) {
        super(price, name, productName, calories);
    }

    @Override
    public String use() {
        return null;
    }

}
