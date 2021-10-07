package PartII;

import java.util.*;
//-----------------------------------------------------
//Assignment (1)
//© Zitao Wang
//Written by: (Zitao Wang 40171434)
//-----------------------------------------------------
public class Menu {

    public void start() {

        Scanner l_scanner = new Scanner(System.in);
        String command;
        boolean unquit = true;
        do {

            System.out.println(" ======================================================");
            System.out.println(" What do you want to do?                               ");
            System.out.println(" ======================================================");
            System.out.println("1. Enter new computers (password required)             ");
            System.out.println("2. Change information of a computer (password required)");
            System.out.println("3. Display all computers by a specific brand");
            System.out.println("4. Display all computers under a certain a price.");
            System.out.println("5. Quit");
            System.out.println("Please enter your choice >");
            System.out.println(" ======================================================");

            command = l_scanner.nextLine();

            switch(command) {

                case "1":
                    Option1 option1 = new Option1();
                    MaxNumber();
                    option1.Passwordvaild();
                    break;
                case "2":
                    Option2 option2 = new Option2();
                    MaxNumber();
                    option2.Passwordvaild();
                    break;
                case "3":
                    Option3.findComputersBy();
                    break;
                case "4":
                    Option4.findCheaperThan();
                    break;
                case "5":
                    System.out.println("GoodBye.");
                    unquit = false;
                    break;
                default:
                    System.out.println("this command does not exist");
            }

        }while (unquit);

    }

    public void MaxNumber() {

        System.out.println("Inventory has " + ComputerDatabase.computernumber + "computers");
        System.out.println("Inventory can input " + (1000 - ComputerDatabase.computernumber) + "computers");
    }

}
