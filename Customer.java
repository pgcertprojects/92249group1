package KwikNKleenCarWash;

/**
 * CREATED by KwikNKleen Car Wash on 21/02/2021
 * This is our abstract Customer Class used to build Customer objects with ticket information
 **/


import java.text.DecimalFormat;

public abstract class Customer
{   static DecimalFormat df = new DecimalFormat("###,###,##0.00");    //to amend output of ticketTotalCost

   //variables used for constructors

   private String customerName;
   private int noOfItems;

   public double totalItemsCost; //Total value of items purchased

   private static int totalNoOfCustomers = 0; //Variable used to count the total number of customers that are purchasing items
   public static double overallTotalSales; // counter for the overall sales of items. Static as is owned by class to tally all object sales.

   //Default Constructor

   protected Customer(){
      totalNoOfCustomers++;
   }//Customer

   //Full Constructor

   protected Customer(String name, int item){
      customerName = name;
      noOfItems = item;
      // totalItemsCost = to add in total items cost;

      //Might need to add a piece of code here to the discount.
   }//Customer

   //setter methods

   protected void setCustomerName(String name){
      customerName = name;
   }//SetCustomerName

   protected void setNoOfItems(int items){
    noOfItems = items;
   }//set number of items

   protected void setTotalItemsCost(int items){
      noOfItems = items;
      totalItemsCost = getTotalItemsCost();
   }//setTotalItemsCost

   //Getter Methods
   protected String getCustomerName(){
      return customerName;
   }//getCustomerName()

   protected int getNoOfItems(){
      return noOfItems;
   }//getTotal

   protected double getTotalItemsCost(){
      return totalItemsCost;
   }//getTotalItemsCost()

   //Used to return the total ticket sales value
   public static double getOverallTotalSales(){
      return overallTotalSales;
   }//getOverallTotalSales()


   //Method to print out customer info
   public String toString() {
      return
              "\nCUSTOMER RECEIPT:  \n" +
                     "Name: " + customerName + "\n" +
                     "Package item amount:" /**customerMenu package will go here */ + "\n" +
                     "Item amount:        " /** ItemMenu needs put in here */ + "\n" +
                     "Total cost:        £" +df.format(totalItemsCost);

   }//toString


}//class
