package KwikNKleenCarWash;

import GroovyMovies.Customer;

import java.text.DecimalFormat;

/**
 * Created by richard on 09/03/2021
 * UPDATE PROGRAM COMMENTS ABOUT PROGRAM HERE
 **/
public class Sales
{
   //static DecimalFormat to be accessed by any other method in the class
   private static DecimalFormat df = new DecimalFormat("###,###,##0.00");

   //static variables
   private static int service1counter, service2counter, service3counter, service4counter, service5counter, service6counter;
   private static int item1counter, item2counter, item3counter, item4counter, item5counter, item6counter,
           item7counter, item8counter, item9counter;
   private static int totalPurchasesOfService, totalPurchasesOfItems, memberServiceCount, nonMemberServiceCount;

   protected static void menu() {
      System.out.println();
      System.out.println("======================");
      System.out.println("SALES MENU");
      System.out.println("======================");
      Sales.printTodaysSales();
      System.out.println();
      Sales.printServiceSales();
      Sales.printItemsSales();
      System.out.println();
      Sales.printMemNonMemSales();
      System.out.println();
   }//menu()

   protected static void printTodaysSales(){
      System.out.println("Total amount of service sales today: ");
      System.out.println(getTotalPurchasesOfService());
      System.out.println();
      System.out.println("Total value of sales today:");
      //System.out.println("£" + df.format(Customer.getOverallTotalSales()));
   }//printTodaysSales()

   protected static void totalPurchasesPerService(int inputServiceOption)
   {
      switch (inputServiceOption)
      {
         case 1:
            service1counter++;
            break;
         case 2:
            service2counter++;
            break;
         case 3:
            service3counter++;
            break;
         case 4:
            service4counter++;
            break;
         case 5:
            service5counter++;
            break;
         case 6:
            service6counter++;
            break;
         //no default required as options 1-6 will always be passed through
      }//switch
      totalPurchasesOfService++;
   }

   protected static void totalPurchasesPerItem(int inputItemOption)
   {
      switch (inputItemOption)
      {
         case 1:
            item1counter++;
            break;
         case 2:
            item2counter++;
            break;
         case 3:
            item3counter++;
            break;
         case 4:
            item4counter++;
            break;
         case 5:
            item5counter++;
            break;
         case 6:
            item6counter++;
            break;
         case 7:
            item7counter++;
            break;
         case 8:
            item8counter++;
            break;
         case 9:
            item9counter++;
            break;
         case 10:
            break;
         //no default required as options 1-10 will always be passed through
      }//switch
      totalPurchasesOfItems++;
   }//totalPurchasesPerItem

   protected static void printServiceSales() {
      System.out.println("======================");
      System.out.println("INDIVIDUAL SERVICE SALES");
      System.out.println("======================");
      System.out.println();
      System.out.println("Total purchases for service 1");
      System.out.println(Sales.getService1counter());
      System.out.println("Total purchases for service 2");
      System.out.println(Sales.getService2counter());
      System.out.println("Total purchases for service 3");
      System.out.println(Sales.getService3counter());
      System.out.println("Total purchases for service 4");
      System.out.println(Sales.getService4counter());
      System.out.println("Total purchases for service 5");
      System.out.println(Sales.getService5counter());
      System.out.println("Total purchases for service 6");
      System.out.println(Sales.getService6counter());
   }//printServiceSales

   protected static void printItemsSales() {
      System.out.println("======================");
      System.out.println("INDIVIDUAL ITEMS SALES");
      System.out.println("======================");
      System.out.println();
      System.out.println("Total purchases for item 1");
      System.out.println(Sales.getItem1counter());
      System.out.println("Total purchases for item 2");
      System.out.println(Sales.getItem2counter());
      System.out.println("Total purchases for item 3");
      System.out.println(Sales.getItem3counter());
      System.out.println("Total purchases for item 4");
      System.out.println(Sales.getItem4counter());
      System.out.println("Total purchases for item 5");
      System.out.println(Sales.getItem5counter());
      System.out.println("Total purchases for item 6");
      System.out.println(Sales.getItem6counter());
      System.out.println("Total purchases for item 7");
      System.out.println(Sales.getItem7counter());
      System.out.println("Total purchases for item 8");
      System.out.println(Sales.getItem8counter());
      System.out.println("Total purchases for item 9");
      System.out.println(Sales.getItem9counter());
   }//printItemsSales()

   protected static void printMemNonMemSales() {
      System.out.println("======================");
      System.out.println("MEMBER & NON-MEMBER TICKETS SOLD");
      System.out.println("======================");
      System.out.println("Total amount of service sold for members: ");
      System.out.println(Sales.getMemberServiceCount());
      System.out.println("Total amount of services sold for non-members ");
      System.out.println(Sales.getNonMemberServiceCount());
      System.out.println("======================");
   }//printMemNonMemSales()

   //Getters & setters
      //services
   protected static int getTotalPurchasesOfService() {
      return totalPurchasesOfService;
   }

   protected static int getService1counter() {
      return service1counter;
   }
   protected static int getService2counter() {
      return service2counter;
   }
   protected static int getService3counter() {
      return service3counter;
   }
   protected static int getService4counter() {
      return service4counter;
   }
   protected static int getService5counter() {
      return service5counter;
   }
   protected static int getService6counter() {
      return service6counter;
   }

      //items
   protected static int getTotalPurchasesOfItems() { return totalPurchasesOfItems; }

   protected static int getItem1counter() { return item1counter; }
   protected static int getItem2counter() {
      return item2counter;
   }
   protected static int getItem3counter() {
      return item3counter;
   }
   protected static int getItem4counter() {
      return item4counter;
   }
   protected static int getItem5counter() {
      return item5counter;
   }
   protected static int getItem6counter() { return item6counter; }
   protected static int getItem7counter() {
      return item7counter;
   }
   protected static int getItem8counter() {
      return item8counter;
   }
   protected static int getItem9counter() {
      return item9counter;
   }

   protected static int getMemberServiceCount() {
      return memberServiceCount;
   }
   protected static void setMemberServiceCount(int memberServiceCount) {
      Sales.memberServiceCount += memberServiceCount;
   }

   protected static int getNonMemberServiceCount() {
      return nonMemberServiceCount;
   }
   protected static void setNonMemberServiceCount(int nonMemberServiceCount) {
      Sales.nonMemberServiceCount = +nonMemberServiceCount;
   }
}//class