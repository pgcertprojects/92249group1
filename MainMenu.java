package KwikNKleenCarWash;

import java.util.Scanner;

/**
 * CREATED by KwikNKleenCarWash on 21/02/2021
 * This menu is created to give the user choice of what they want to do.
 **/
public class MainMenu
{

   //static scanner created to use in static method
   private static Scanner keyboard1 = new Scanner(System.in);

   //static variable to choose option that has been chosen
   private static int employeeOption;

   //static menu to go to other areas of the program depending on users input



   public static void startMenu()
   {
      System.out.println("Welcome to Kwik N Kleen Car Wash");
      System.out.println("================================");

      //do while used to all users to end program with program choice 4

      do {
         //Options list for the customer to choose from

         System.out.println("Choose the options from the list below");
         System.out.println("1. Choose Car washing options");
         System.out.println("2. View Valet timetable ");
         System.out.println("3. View car wash sales");
         System.out.println("4. Quit the application");
         System.out.println("\n Enter 1,2,3,4:");
         //Assign users int options to variable read in from the keyboard
         employeeOption = keyboard1.nextInt();

         switch (employeeOption){

            case 1:
               //Go to static method in CustomerMenu
               CustomerMenu.CustomerMenuDisplay();
               //breaks out of the switch statement
               break;

            case 2:
               //go to the static method in sales
               //sales.menu(); needs added further in program
               break;

            case 3:
               //Go to the console display of Valet Timetable
              // Timetable.viewtimetable(); needs added further in program
               break;

            case 4:
               System.out.println("You have chosen to end the program \n Good Bye");
               break;

               //Highlights when input not valid and offers option to chose again
            default:
               System.out.println(employeeOption + "is not a valid option, please choose again.");

         }//Switch statement
         //Allows the user to exit the program and reprints menu when the methods are complete or default is accessed.
      }while (employeeOption != 4);

   }//StartMenu
}//MainMenu
