import java.util.ArrayList;

public class BakedGood {
    private String name;
    private double price;
    private String expirationDate;
    private ArrayList<String> dietRestriction;
    private int quantity;

    //constructors
    public BakedGood () {       //default constructor
        name = "";
        price = 0.0;
        expirationDate = "";
        dietRestriction = new ArrayList<>();
        quantity = 0;
    }

    public BakedGood (String name, double price, String expirationDate, int quantity) {
        this.name = name;
        this.price = price;
        this.expirationDate = expirationDate;
        dietRestriction = new ArrayList<String>();
        this.quantity = quantity;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public ArrayList<String> getDietRestriction() {
        return dietRestriction;
    }

    public void setDietRestriction(ArrayList<String> dietRestriction) {
        this.dietRestriction = dietRestriction;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    //Method
    @Override
    public String toString() {
        String information = "";
        information += "Name: " + this.name + "\n";
        information += "Price: " + this.price + "\n";
        information += "Expiration Date: " + expirationDate + "\n";
        information += "Diet Restrictions: " + dietRestriction + "\n";
        information += "Quantity: " + quantity;
        return information;
    }

    public void addDietRestriction(String ingredient) {
        dietRestriction.add(ingredient);

    }
}
