package se.ecutb.oscarjohannson.Products;

public class Snacks extends Product {

    private String allegen;

    //Constructor
    public Snacks(int price, String name, int productNumber, int calories) {
        super(price, name, productNumber, calories);
    }
    //Constructor
    public Snacks(int price, String name, int productNumber, int calories, String allegen) {
        super(price,name,productNumber,calories);
        this.allegen = allegen;
    }

    @Override
    public String use() {
        return null;
    }

}
