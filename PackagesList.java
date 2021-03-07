package KwikNKleenCarWash;

import java.util.ArrayList; // import the ArrayList class
import java.util.Collections;  // Import the Collections class

/**
 * CREATED by KwikNKleen CarWash on 22/02/2021
 * Program to read in the different packages that are available at the KwikNKleen Car Wash and arrange them into order.
 **/
public class PackagesList
{
   ArrayList<String> packages = new ArrayList<String>(); // Create an ArrayList object


   public static void main(String[] args)
   {
      ArrayList<String> packages = new ArrayList<String>();
      packages.add("2. Standard Wash & Air Freshener");
      packages.add("1. Standard Wash");
      packages.add("3. MOT Wash");
      packages.add("6. Full valet");
      packages.add("5. Mini Valet");
      packages.add("4. Premium Wash & Extras");
      Collections.sort(packages);  // Sort Packages in order
      for (int i = 0; i < packages.size(); i++) {//For loop to loop through the ArrayList
         System.out.println(packages.get(i));
      }
   }//main
}//class
