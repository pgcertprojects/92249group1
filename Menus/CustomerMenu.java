package Menus;

import FileReadesandWriters.PackageList;
import Objects.MemberCustomer;
import Objects.NonMemberCustomer;
import Objects.Package;

import java.text.DecimalFormat;
import java.util.Scanner;
/**
 * Created by KwikNKleenCarWash on 11/03/2021
 * This is our CustomerMenu class which is used when selecting option 1 from MainMethod class. This class takes user information
 * when purchasing packages. It accesses Package array via BuildArrayFromFile Class, then outputs Package options and asks user to
 * make selection. It creates a MemberCustomer or NonMemberCustomer object depending on user input. Then prints a Receipt to console
 **/
public class CustomerMenu
{
   private static DecimalFormat df = new DecimalFormat("00.00");
   private static Scanner kb6 = new Scanner(System.in);

   private static int packageOption;
   private static String customerName = "", packageChoice = "";
   private static char member;

   static Package[] packages = PackageList.getPackageArray();

   static MemberCustomer newMember;
   static NonMemberCustomer newNonMember;

   protected static void CustomerMenuDisplay(){
      //Variables assigned to pass through constructor parameters to build Customer objects
      boolean isChoiceValid = false;
      System.out.println("Please enter your Name: ");
      customerName = kb6.next();
      //do while loop to ensure a binary response for membership
      do{
         System.out.println("Are you a member (Y/N): ");
         member = kb6.next().toUpperCase().charAt(0);
         if (member == 'Y' || member == 'N') {
            isChoiceValid = true;
         }//if
         else{
             System.out.print("Invalid choice, please try again. ");
         }
      }while(!isChoiceValid);

      System.out.println();

      //do while statement used to ensure options 1-4 are chosen
      do {
         System.out.println("Which package would you like to purchase?");
         //for loop used to extract object variable from array and print to console
         int num = 0;
         for(int count = 0; count <= 3; count++){
            num = num + 1;
            System.out.println(num + ". " + packages[count].getPackageName() + " £" + df.format(packages[count].getPrice()) );
         }//for

         System.out.println("Enter the number of the package you wish to purchase: ");
         packageOption = kb6.nextInt();
         //assigns whatever option you use to our movieOption variable
         switch (packageOption) {
            case 1:
               packageChoice = packages[0].getPackageName();
               break;
            case 2:
               packageChoice = packages[1].getPackageName();
               break;
            case 3:
               packageChoice = packages[2].getPackageName();
               break;
            case 4:
               packageChoice = packages[3].getPackageName();
               break;
            default:
               System.out.println("\"" + packageOption + "\"" + " is not a valid choice");
         }//switch
      }//do
      while ((packageOption < 1) || (packageOption > 4));
      
      System.out.println("The package you have chosen is : " + packageChoice + "\n======================\n");
      Sales.totalPurchasesPerPackage(packageOption);

      //If statement used to create Member or NonMember objects based on choice selection from menu above
      if (member == 'Y') {
         //create MemberCustomer and pass in variables needed to the constructor
         newMember = new MemberCustomer(customerName, packageChoice,
                 packages[packageOption-1].getPrice());
         //use method to print details to console
         newMember.printCustomerInfo();
         //counting the amount of times Members purchased a package
         Sales.incrementMemberPackageCount();
      }//if
      else
      {
         if (member == 'N')
         {
            //create NonMemberCustomer and pass in variables needed to the constructor
            newNonMember = new NonMemberCustomer(customerName, packageChoice,
                    packages[packageOption-1].getPrice());
            //use method to print details to console
            newNonMember.printCustomerInfo();
            //counting the amount of times NonMembers purchased a package
            Sales.incrementNonMemberPackageCount();
         }//if
      }//else
      //System.out.println("The package you have chosen is : " + packageChoice + "\n======================\n");
   }//CustomerMenuDisplay()


   //Method to calculate overall cost
   //getTotalCost() method here
   //unsure whether needed or not
}//class
