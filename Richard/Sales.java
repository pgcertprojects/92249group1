package KwikNKleenCarWash;

import java.text.DecimalFormat;

/**
 * Created by richard on 09/03/2021
 * UPDATE PROGRAM COMMENTS ABOUT PROGRAM HERE
 **/
public class Sales
{
   private static Package [] packages = PackageList.getPackageArray();

   //static DecimalFormat to be accessed by any other method in the class
   private static DecimalFormat df = new DecimalFormat("###,###,##0.00");

   //static variables
   private static int platinumCounter, goldCounter, silverCounter, bronzeCounter;
   private static int totalPurchasesOfPackages, memberPackageCount, nonMemberPackageCount;

   protected static void menu() {
      System.out.println();
      System.out.println("======================");
      System.out.println("SALES MENU");
      System.out.println("======================");
      Sales.printTodaysSales();
      System.out.println();
      Sales.printServiceSales();
      System.out.println();
      Sales.printMemNonMemSales();
      System.out.println();
   }//menu()

   protected static void printTodaysSales(){
      System.out.println("Total amount of service sales today: ");
      System.out.println(getTotalPurchasesOfPackages());
      System.out.println();
      //System.out.println("Total value of sales today:");
      //System.out.println("£" + df.format(Customer.getOverallTotalSales()));
   }//printTodaysSales()

   protected static void totalPurchasesPerPackage(int inputServiceOption)
   {
      switch (inputServiceOption)
      {
         case 1:
            platinumCounter++;
            break;
         case 2:
            goldCounter++;
            break;
         case 3:
            silverCounter++;
            break;
         case 4:
            bronzeCounter++;
            break;
         //no default required as options 1-6 will always be passed through
      }//switch
      totalPurchasesOfPackages++;
   }//totalPurchasesPerPackage

   protected static void printServiceSales() {
      System.out.println("======================");
      System.out.println("INDIVIDUAL SERVICE SALES");
      System.out.println("======================");
      System.out.println();
      System.out.println("Total purchases for " + packages[0].getPackageName());
      System.out.println(Sales.getPlatinumCounter());
      System.out.println("Total purchases for " + packages[1].getPackageName());
      System.out.println(Sales.getGoldCounter());
      System.out.println("Total purchases for " + packages[2].getPackageName());
      System.out.println(Sales.getSilverCounter());
      System.out.println("Total purchases for " + packages[3].getPackageName());
      System.out.println(Sales.getBronzeCounter());
   }//printServiceSales

   protected static void printMemNonMemSales() {
      System.out.println("======================");
      System.out.println("PACKAGES SOLD TO MEMBERS & NON-MEMBERS");
      System.out.println("======================");
      System.out.println("Total amount of packages sold to members: ");
      System.out.println(Sales.getMemberPackageCount());
      System.out.println("Total amount of packages sold to non-members ");
      System.out.println(Sales.getNonMemberPackageCount());
      System.out.println("======================");
   }//printMemNonMemSales()

   //Getters & setters
   protected static int getTotalPurchasesOfPackages() {
      return totalPurchasesOfPackages;
   }

   protected static int getPlatinumCounter() {
      return platinumCounter;
   }
   protected static int getGoldCounter() {
      return goldCounter;
   }
   protected static int getSilverCounter() {
      return silverCounter;
   }
   protected static int getBronzeCounter() {
      return bronzeCounter;
   }


   protected static int getMemberPackageCount() {
      return memberPackageCount;
   }
   protected static void setMemberPackageCount(int memberPackageCount) {
      Sales.memberPackageCount += memberPackageCount;
   }

   protected static int getNonMemberPackageCount() {
      return nonMemberPackageCount;
   }
   protected static void setNonMemberPackageCount(int nonMemberPackageCount) {
      Sales.nonMemberPackageCount = +nonMemberPackageCount;
   }
}//class