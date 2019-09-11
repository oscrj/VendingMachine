package se.ecutb.oscarjohannson.Products;

public class Snacks extends Product {

    private String allegen;

    //Constructor
    public Snacks(int price, String name, int productName, int calories) {
        super(price, name, productName, calories);
    }

    public Snacks(int price, String name, int productName, int calories, String allegen) {
        super(price,name,productName,calories);
        this.allegen = allegen;
    }

    @Override
    public String use() {
        return null;
    }

}
