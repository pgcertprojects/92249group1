package Objects;

public class MemberCustomer extends Customer{

   //variables used within constructor methods
   private static double memberDiscount = 0.25;

   //Counter for MemberCustomers
   public static int noOfMemberCustomers = 0;


   //Constructors
   public MemberCustomer(){
      noOfMemberCustomers++;
   }//default constructor

   public MemberCustomer (String name, String aPackage, double price){
      super(name, aPackage, memberDiscountPrice(price));
      noOfMemberCustomers++;
   }

   //Method to calculate the Member discounted price
   public static double memberDiscountPrice(double price){
      double discountedPrice = price - (price * memberDiscount);
      return discountedPrice;
   }

   //Method to output member details of purchase to console
   public void printCustomerInfo(){
      System.out.println("CUSTOMER RECEIPT: ");
      System.out.println("Name: " + getCustomerName());
      System.out.println("Package purchased: " + getPackageType() + " £" + getPackagePrice());
      System.out.println("Total cost: £" + df.format(getTotalCost()));
   }//printCustomerInfo()

   //Getters
   public static int getNoOfMemberCustomers() {
      return noOfMemberCustomers;
   }



}