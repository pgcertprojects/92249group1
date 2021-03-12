//Sales.java

package KwikNKleenCarWash;


import java.text.DecimalFormat;

/**
 *
 */

public class Sales {

   // Get package lists, this is static so it can be used by all static methods and it is private since it is only used within this class
   private static java.lang.Package[] Packages= PackagesList.getPackageArray();

   //static DecimalFormat to be accessed by any other method in the class
   private static DecimalFormat df = new DecimalFormat("###,###,##0.00");

   //These are the static variables that are used throughout the whole class
   private static int totalPackagesSold, memberPackageCount, nonMemberPackageCount;
   private static String Platinum, Gold, Silver, Bronze;

   protected static void menu() {
      System.out.println();
      System.out.println("======================");
      System.out.println("SALES MENU");
      System.out.println("======================");
      KwikNKleenCarWash.Sales.printTodaysSales();
      System.out.println();
      KwikNKleenCarWash.Sales.printPackageSales();
      System.out.println();
      KwikNKleenCarWash.Sales.printMemNonMemSales();
      System.out.println();
   }//menu()

   protected static void printTodaysSales(){
      System.out.println("Total amount of package sales today: ");
      System.out.println(getTotalPackagesSold());
      System.out.println();
      System.out.println("Total value of sales today:");
      System.out.println("£" + df.format(Customer.getOverallTotalSales()));
   }//printTodaysSales()

   protected static void totalTicketsPerMovie(int inputPackagesOption, int inputNoOfPackages) {
      switch (inputPackagesOption) {
         case 1:
            Platinum += inputNoOfPackages;
            break;
         case 2:
            Gold += inputNoOfPackages;
            break;
         case 3:
            Silver += inputNoOfPackages;
            break;
         case 4:
            Bronze += inputNoOfPackages;
            break;

         //No default option required as when it is called there is always data inputted
      }//switch
      totalPackagesSold += inputNoOfPackages;
   }//totalTicketsPerMovie

   protected static void printPackagesSales() {
      System.out.println("======================");
      System.out.println("INDIVIDUAL PACKAGE TICKET SALES");
      System.out.println("======================");
      System.out.println();
      System.out.println("Total amount of packages sold for " + Platinum[0].getPackageTitle());
      System.out.println(KwikNKleenCarWash.Sales.getPackage1());
      System.out.println("Total amount of packages sold for " + Gold[1].getPackageTitle());
      System.out.println(KwikNKleenCarWash.Sales.getPackage2());
      System.out.println("Total amount of packages sold for " + Silver[2].getPackageTitle());
      System.out.println(KwikNKleenCarWash.Sales.getPackage3());
      System.out.println("Total amount of packages sold for " + Bronze[3].getPackageTitle());
      System.out.println(KwikNKleenCarWash.Sales.getPackage4());

   }//printTicketSales()

   protected static void printMemNonMemSales() {
      System.out.println("======================");
      System.out.println("MEMBER & NON-MEMBER PACKAGES SOLD");
      System.out.println("======================");
      System.out.println("Total amount of packages sold for members: ");
      System.out.println(KwikNKleenCarWash.Sales.getMemberPackageCount());
      System.out.println("Total amount of packages sold for non-members ");
      System.out.println(KwikNKleenCarWash.Sales.getNonMemberPackageCount());
      System.out.println("======================");
   }//printMemNonMemSales()

   //Getters & Setters

   protected static int getMemberPackageCount() {
      return memberPackageCount;
   }//getMemberPackageCount

   protected static int getNonMemberPackageCount() {
      return nonMemberPackageCount;
   }//getNonMemberPackageCount

   protected static int getTotalPackagesSold() {
      return totalPackagesSold;
   }//getTotalPackagesSold

   protected static int getPackage1() { return package1;
   }//getPackage1

   protected static int getPackage2() {return package2;
   }//getPackage2

   protected static int getPackage3() { return package3;
   }//getPackage3

   protected static int getPackage4() { return package4; }
   //getPackage4


   protected static void setMemberPackageCount(int memberPackageCount) {
      Sales.memberPackageCount += memberPackageCount;
   }//setMemberPackageCount

   protected static void setNonMemberPackageCount(int nonMemberPackageCount) {
      Sales.nonMemberPackageCount = +nonMemberPackageCount;

   }//setNonMemberPackageCount
}//class