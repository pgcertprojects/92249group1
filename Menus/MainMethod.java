package Menus;

import java.util.Scanner;

public class MainMethod {
   
   static int choice;
   
   public static void main(String[] args) {
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Hello, welcome to Kwik'N'Kleen");

      do{
         System.out.println("Which menu would you like to view?");
         System.out.println("1. Customer menu\n2. Sales menu");
         System.out.println("3. Exit system");
         
         //do while loop to verify read-in from keyboard
         boolean validInput = false;
         do{
            System.out.println("\nEnter 1, 2, 3:");
            char input = keyboard.next().charAt(0);
            if (Character.isDigit(input)) {
               validInput = true;
               //Assign users int options to variable read in from the keyboard
               choice = Character.getNumericValue(input);
            }
            else {
               System.out.print("Invalid entry, please enter a number.\n");
            }
         }while(!validInput);
         
         switch (choice){
            case 1:
               CustomerMenu.CustomerMenuDisplay();
               break;
            case 2:
               Sales.menu();
               break;
            case 3:
               System.out.println("You have chosen to exit the system.\nGoodbye");
            default:
               System.out.println(choice + " is an invalid menu choice. Please choose again.\n");
         }
      }while (choice != 3);

   }//main
}//MainMethod
