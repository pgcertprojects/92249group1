package Objects;

/**
 * Created by KwikNKleenCarWash on 23/02/2021
 * This is our NonMemberCustomer Class which inherits from the parent abstract Customer Class. Within this class contains
 * NonMember discount which is applied when the Platinum package is purchased.
 **/

public class NonMemberCustomer extends Customer{

    //variables used within constructor methods
    private static final double NONMEMBERDISCOUNT = 0.10;
    private static double endPrice;

    //Counter for NonMemberCustomers
    public static int noOfNonMemberCustomers = 0;


    //Default constructor
    public NonMemberCustomer(){
        noOfNonMemberCustomers++;
    }//NonMemberCustomer

    //Full constructor
    public NonMemberCustomer(String name, String aPackage, double price){
        //inherits from Customer Class
        super(name, aPackage, price);

        //Apply a 10% discount if NonMemberCustomer chooses a Platinum package
        if(aPackage.equals("Platinum")){
            endPrice = nonMemberDiscountPrice(price);
        }//if
        else {
            endPrice = price;
        }//else
        //variable incremented by 1, used for analytic purposes
        noOfNonMemberCustomers++;
    }//NonMemberCustomer


    //Method to calculate the NonMember discounted price if applicable
    public static double nonMemberDiscountPrice(double price){
        double discountedPrice = price - (price * NONMEMBERDISCOUNT);
        return discountedPrice;
    }

    //Method to output nonmember details of purchase to console
    public void printCustomerInfo(){
        System.out.println("CUSTOMER RECEIPT:");
        System.out.println("Name:\t" + getCustomerName());
        System.out.println("Package purchased:\t" + getPackageType() + " £" + df.format(getPackagePrice()));
        System.out.println("Total cost:\t£" + df.format(endPrice));
    }//printCustomerInfo()


}