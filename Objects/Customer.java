package Objects;

/**
 * CREATED by KwikNKleen Car Wash on 21/02/2021
 * This is our abstract Customer Class used to build Customer objects with ticket information
 **/


import java.io.FileReader;
import java.text.DecimalFormat;

public abstract class Customer
{
    static DecimalFormat df = new DecimalFormat("###,###,##0.00");    //to amend output of ticketTotalCost

    //variables used for constructors
    private String customerName;
    private String packageType;
    private double packagePrice;

    //Variable used to count the total number of customers that are purchasing items
    private static int totalNoOfCustomers = 0;


    //Default Constructor
    protected Customer(){
        totalNoOfCustomers++;
    }//Customer

    //Full Constructor
    protected Customer(String name, String aPackage, double price){
        customerName = name;
        packageType = aPackage;
        packagePrice = price;
    }//Customer

    //Getters and Setters
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public double getPackagePrice() {
        return packagePrice;
    }

    public void setPackagePrice(double packagePrice) {
        this.packagePrice = packagePrice;
    }

    public static int getTotalNoOfCustomers() {
        return totalNoOfCustomers;
    }

    public static void setTotalNoOfCustomers(int totalNoOfCustomers) {
        Customer.totalNoOfCustomers = totalNoOfCustomers;
    }



    //Method to print out customer info
    public String toString() {
        return
                "\nCUSTOMER RECEIPT:  \n" +
                        "Name: " + customerName + "\n" +
                        "Package item amount:" /**customerMenu package will go here */ + "\n" +
                        "Item amount:        " /** ItemMenu needs put in here */;

    }//toString


}//class
