package KwikNKleenCarWash;

import java.text.DecimalFormat;

/**
 * Created by richard on 23/02/2021
 * UPDATE PROGRAM COMMENTS ABOUT PROGRAM HERE
 **/


public class MemberCustomer extends Customer
{

   //static DecimalFormat to be accessed by any other method in the class
   static DecimalFormat df = new DecimalFormat("###,###,##0.00");

   //variables used within constructor methods
   private static double memberDiscount = 0.25;

   public static int noOfMemberCustomers = 0;

   public MemberCustomer(){
      noOfMemberCustomers++;
   }//MemberCustomer()

   public MemberCustomer (String name, String aPackage, double price){
      super(name, aPackage, memberDiscountPrice(price));
      noOfMemberCustomers++;
   }

   //Method to calculate the Member discounted price
   public static double memberDiscountPrice(double price){
      double discountedPrice = price - (price * memberDiscount);
      return discountedPrice;
   }
   //Getter Methods
   protected static int getNoOfMemberCustomers(){
      return noOfMemberCustomers;
   }


   //Method to output member details of purchase to console
   public void printCustomerInfo(){
      System.out.println("CUSTOMER RECEIPT: ");
      System.out.println("Name: " + getCustomerName());
      System.out.println("Package purchased: " + getPackageType() + " £" + getPackagePrice());
      System.out.println("Total cost: £" + df.format(getTotalCost()));
   }//printCustomerInfo()

   //Method to print member info to files for ticket receipt
   public String toString(){
      return super.toString();
   }//toString()

}//class