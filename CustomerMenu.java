package KwikNKleenCarWash;

import java.util.Scanner;

/**
 * Hope it's understandable what I'm doing here, I have set each car wash service to a different package
 * Actual costs yet to be included.
 * getTotalItemsCost is not working in Customer class, not sure what problem is
 */
public class CustomerMenu
{
   //Variable are all static due to use in static method
   private static int carWashOption;
   //private static int noOfTickets, noOfAdultTickets, noOfChildTickets;
   private static String customerName = "";
   private static String service = "";
   private static char memberOption;
   private static boolean member;
   private static int carOption, numItems = 0, itemOption;
   private static double serviceCost = 0, totalItemCost = 0, totalCost = 0;

   //Method to display menu option choices to display list of services for user to make selection
   protected static void CustomerMenuDisplay(){

      Scanner kb6 = new Scanner(System.in);
      //Variables assigned to pass through constructor parameters to build Customer objects
      System.out.println("Please enter your Name: ");
      customerName = kb6.nextLine();

      do {
      System.out.println("Are you a member (Y/N): ");
      memberOption = kb6.next().toUpperCase().charAt(0);

         switch(memberOption)
         {
            case 'Y':
               member = true;
               break;
            case 'N':
               member = false;
               break;
            default:
               System.out.println("\"" + memberOption + "\"" + " is not a valid choice");
         }//switch
      }//do
      while((memberOption == 'Y') || (memberOption == 'N'));

      System.out.println();


      //do while statement used to ensure options 1-6 are chosen
      do {
         System.out.println("Which service would you like to purchase?");
         //Options list for the customer to choose from
         System.out.println("Package 1. Car wash");
         System.out.println("Package 2. Car wash, polish, towel dry");
         System.out.println("Package 3. Car wash, polish, towel dry, air freshener");
         System.out.println("Package 4. Mini Valet service");
         System.out.println("Package 5. Full Valet Service");
         System.out.println("Package 6. MOT Wash service");
         System.out.println("\n Enter 1,2,3,4,5,6:");
         //Assign users int options to variable read in from the keyboard
         carOption = kb6.nextInt();

         //assigns whatever option you use to our carOption variable
         switch (carOption) {
            case 1:
               service = "Car wash";
               serviceCost += 0;
               break;
            case 2:
               service = "Car wash, polish, towel dry";
               serviceCost += 0;
               break;
            case 3:
               service = "Car wash, polish, towel dry, air freshener";
               serviceCost += 0;
               break;
            case 4:
               service = "Mini Valet service";
               serviceCost += 0;
               break;
            case 5:
               service = "Full Valet Service";
               serviceCost += 0;
               break;
            case 6:
               service = "MOT Wash service";
               serviceCost += 0;
               break;
            default:
               System.out.println("\"" + carOption + "\"" + " is not a valid choice");
         }//switch
      }//do
      while ((carOption < 1) || (carOption > 6));

      do
         {
         System.out.println("Would you like to buy any items for your car?");
         //Options list for the customer to choose from
         System.out.println("1. Air freshener");
         System.out.println("2. Rubber car mats");
         System.out.println("3. Dashboard cleaning wipes");
         System.out.println("4. Leather seat cleaner");
         System.out.println("5. Caps for tyres");
         System.out.println("6. De-Icer");
         System.out.println("7. Engine Oil");
         System.out.println("8. New window wiper blades");
         System.out.println("9. Bulbs for various places in the car");
         System.out.println("10. No purchase");
         System.out.println("\n Enter 1,2,3,4,5,6,7,8,9 or 10 to stop purchasing:");
         //Assign users int options to variable read in from the keyboard
         itemOption = kb6.nextInt();

         //assigns whatever option you use to our carOption variable
         switch (itemOption) {
            case 1:
               totalItemCost += 1;
               numItems++;
               break;
            case 2:
               totalItemCost += 2;
               numItems++;
               break;
            case 3:
               totalItemCost += 3;
               numItems++;
               break;
            case 4:
               totalItemCost += 4;
               numItems++;
               break;
            case 5:
               totalItemCost += 5;
               numItems++;
               break;
            case 6:
               totalItemCost += 6;
               numItems++;
               break;
            case 7:
               totalItemCost += 7;
               numItems++;
               break;
            case 8:
               totalItemCost += 8;
               numItems++;
               break;
            case 9:
               totalItemCost += 9;
               numItems++;
               break;
            case 10:
               break;
            default:
               System.out.println("\"" + itemOption + "\"" + " is not a valid choice");
         }//switch
      }//do
      while (itemOption != 10);

      System.out.println("You have chosen a " + service + " and " + numItems + " items");
   }//CustomerMenuDisplay()


   //Getters & Setters
   protected static String getService(){
      return service;
   }

   public static double getTotalItemCost(){
      return totalItemCost;
   }

   //Method to calculate overall  cost
   public static double getTotalCost(){
      totalCost = serviceCost + totalItemCost;
      return totalCost;
   }//getTotalCost()

}