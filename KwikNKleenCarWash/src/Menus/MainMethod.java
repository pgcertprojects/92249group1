package Menus;

import java.util.Scanner;

public class MainMethod {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int choice = 0;

        do{
            System.out.println("Hello, welcome to KwikNKleen");
            System.out.println("Which menu would you like to view?");
            System.out.println("1. Customer menu\n2. Sales menu");
            System.out.println("3. Exit system");
            choice = keyboard.nextInt();
            switch (choice){
                case 1:
                    CustomerMenu.CustomerMenuDisplay();
                    break;
                case 2:
                    Sales.menu();
                    break;
                case 3:
                    System.out.println("You have chosen to exit the system. Good bye :)");
                default:
                    System.out.println("Invalid menu choice...");
            }
        }while (choice != 3);

    }

}
