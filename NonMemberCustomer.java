package KwikNKleenCarWash;

import KwikNKleenCarWash.Customer;
import KwikNKleenCarWash.CustomerMenu;

import static KwikNKleenCarWash.Prices.getPackagePrices;

/**
 *
 *
 * * This is our NonMemberCustomer Class which inherits from the parent abstract Customer Class. Within this class contains
 *  * NonMember discount which is applied when a platinum package is purchased.
 */

public class NonMemberCustomer extends Customer {

   //variables used within constructor methods
   private double nonMemberDiscount = 0.10;

   public static int noOfNonMemberCustomers = 0;

   //Default constructor
   public NonMemberCustomer(){
      noOfNonMemberCustomers++;
   }//NonMemberCustomer

   //Full constructor
   public NonMemberCustomer(String name, String aPackage, Double price){
      //inherits from Customer Class
      super(name, aPackage, price);
      //Apply A 10% discount if NonMemberCustomer purchases a platinum package only
      if (aPackage == "Platinum"){
         price = NonMemberCustomerDiscountPrice(price);
      }
      //using noOfNonMemberCustomers variable to increment by 1 each time object is created, and is used for analytic purposes
      noOfNonMemberCustomers++;

   }//NonMemberCustomer

    //Method to calculate the NonMember discounted price if applicable
   public static double NonmemberDiscountPrice(double price){
      double discountedPrice = price -(price * NonMemberCustomerDscountPrice);
      return discountedPrice;
   }
   //Method to output nonmember details of purchase to console
   public void printCustomerInfo(){
      System.out.println("CUSTOMER RECEIPT: ");
      System.out.println("Name: " + getCustomerName());
      System.out.println("Package Price: " + KwikNKleenCarWash.CustomerMenu.getNoOfPackages());
      System.out.println("Total cost: £" + df.format(getPackagePrice()));
   }//printCustomerInfo()

   public String toString(){
      return super.toString();
   }//toString()
}//class