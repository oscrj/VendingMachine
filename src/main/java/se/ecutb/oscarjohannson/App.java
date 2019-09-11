package se.ecutb.oscarjohannson;

import se.ecutb.oscarjohannson.Products.Product;
import se.ecutb.oscarjohannson.Products.Soda;

public class App 
{
    public static void main( String[] args ) {
        Product cocaCola = new Soda(15,"Coca-Cola",001, 200);
        Product fanta = new Soda(15,"Fanta", 002, 200);

        System.out.println(fanta.toString());
    }
}
