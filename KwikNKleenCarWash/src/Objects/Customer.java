
package Objects;

/**
 * CREATED by KwikNKleen Car Wash on 21/02/2021
 * This is our abstract Customer Class used to build Customer objects with ticket information
 **/


import java.io.FileReader;
import java.text.DecimalFormat;

public abstract class Customer
{
    static DecimalFormat df = new DecimalFormat("###,###,##0.00");    //to amend output of cost

    //variables used for constructors
    private String customerName;
    private String packageType;
    private double packagePrice;

    public double totalCost; //Total value of service purchased

    //Variable used to count the total number of customers that are purchasing
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
        //totalCost = CustomerMenu.getTotalCost();
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

    public double getTotalCost() {
        return packagePrice;
    }

    public void setTotalCost(double totalCost) {
        this.packagePrice = totalCost;
    }

    //Used to return the total sales value
    //public static double getOverallTotalSales(){
    //   return overallTotalSales;
    //}//getOverallTotalSales()

    //Method to print out customer info
    public String toString() {
        return
                "\nCUSTOMER RECEIPT:  \n" +
                        "Name: " + customerName + "\n" +
                        "Package & cost:" + this.getPackageType() + " £" + this.getPackagePrice();
        //   "Total cost:        £" + df.format(getTotalCost());

    }//toString


}//class