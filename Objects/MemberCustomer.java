package Objects;

/**
 * Created by KwikNKleenCarWash on 23/02/2021
 * This is our MemberCustomer Class which inherits from the parent abstract Customer Class. Within this class contains
 * Member discount which is applied regardless of which package is purchased.
 **/

public class MemberCustomer extends Customer{
   
   //variables used within constructor methods
   private static final double MEMBERDISCOUNT = 0.25;
   private static double discountedPrice;

   //Counter for MemberCustomers
   public static int noOfMemberCustomers = 0;

   //Constructors
   public MemberCustomer(){
      noOfMemberCustomers++;
   }//default constructor

   public MemberCustomer (String name, String aPackage, double price){
      super(name, aPackage,price);
      discountedPrice = memberDiscountPrice(price);
      noOfMemberCustomers++;
   }

   //Method to calculate the Member discounted price
   public static double memberDiscountPrice(double price){
      double discountedPrice = price - (price * MEMBERDISCOUNT);
      return discountedPrice;
   }

   //Method to output member details of purchase to console
   public void printCustomerInfo(){
      System.out.println("CUSTOMER RECEIPT:");
      System.out.println("Name:\t" + getCustomerName());
      System.out.println("Package purchased:\t" + getPackageType() + " £" + df.format(getPackagePrice()));
      System.out.println("Total cost:\t£" + df.format(discountedPrice));
      System.out.println("================================\n");
   }//printCustomerInfo()

   //Getters
   public static int getNoOfMemberCustomers() {
      return noOfMemberCustomers;
   }



}
