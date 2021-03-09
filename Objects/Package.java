package Objects;

public class Package {

    private String packageName;
    private String description;
    private double price;

    //Constructors
    public Package(){
        this.packageName = null;
        this.description = null;
        this.price = 0.00;
    }//default constructor

    public Package(String packageName, String description, double price) {
        this.packageName = packageName;
        this.description = description;
        this.price = price;
    }

    //Getters and Setters
    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
