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

       
   }//StartMenu
}//MainMenu
