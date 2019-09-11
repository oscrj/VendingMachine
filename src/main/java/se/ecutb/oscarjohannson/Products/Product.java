package se.ecutb.oscarjohannson.Products;

public abstract class Product {

    private int price;
    private String name;
    private int productName;
    private int calories;
    private String allergen;

    public Product(int price, String name, int productName, int calories, String allergen) {
        this.price = price;
        this.name = name;
        this.productName = productName;
        this.calories = calories;
        this.allergen = allergen;
    }

    //Getters
    public int getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
    public int getProductName() {
        return productName;
    }
    public int getCalories() {
        return calories;
    }
    public String getAllergen() {
        return allergen;
    }
}
