package se.ecutb.oscarjohannson.Products;

public class Soda extends Product {

    //Constructor
    public Soda(int price, String name, int productName, int calories) {
        super(price, name, productName, calories);
    }

    @Override
    public String examine(){
        return "";
    }

    @Override
    public  String use(){
        return "Enjoy your Soda";
    }
}
