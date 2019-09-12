package se.ecutb.oscarjohannson.Products;

public class Soda extends Product {

    //Constructor
    public Soda(int price, String name, int productNumber, int calories) {
        super(price, name, productNumber, calories);
    }
    @Override
    public  String use(){
        return "Enjoy your Soda";
    }
}
