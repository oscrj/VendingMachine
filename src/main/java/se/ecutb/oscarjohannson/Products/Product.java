package se.ecutb.oscarjohannson.Products;

public abstract class Product {

    private int price;
    private String name;
    private int productNumber;
    private int calories;

    public Product(int price, String name, int productNumber, int calories) {
        this.price = price;
        this.name = name;
        this.productNumber = productNumber;
        this.calories = calories;

    }
    //Getter
    public int getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
    public int getProductNumber() {
        return productNumber;
    }
    public int getCalories() {
        return calories;
    }

    public String examine(){

        String info = "price = " + price + ", name = " + name + '\'' + ", productNumber = " + productNumber + ", calories = " + calories + '}';

        return info;
    }

    public String showProducts(){
        String info = "Productnumber: " + productNumber + "Product name: " + name;

        return info;
    }

    public abstract String use();

}

