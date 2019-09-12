package se.ecutb.oscarjohannson.Products;

public class Fruits extends Product {

    //Constructor
    public Fruits(int price, String name, int productNumber, int calories) {
        super(price, name, productNumber, calories);
    }

    @Override
    public String use() {
        return null;
    }

}
