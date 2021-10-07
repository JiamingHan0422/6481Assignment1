package PartII;

import java.util.Scanner;
//-----------------------------------------------------
//Assignment (1)
// Zitao Wang & Jiaming Han
//Written by: (Zitao Wang 40171434)
//-----------------------------------------------------
public class Option1 extends ComputerDatabase{

    Scanner p_sc = new Scanner(System.in);
    public void Passwordvaild(){


        String password = "password";
        String input;
        boolean result = false;

        for(int i = 0; i < 3 ; i++) {
            System.out.println("Please enter the password.");
            input = p_sc.nextLine();

            if(password.equals(input)) {
                System.out.println("Login success!");
                result = true;
                break;
            }
            else {
                System.out.println("The password is not correct.");
                continue;
            }
        }
        // if the password is true, ask the user to enter the number of computers
        if(result) {
            System.out.println("How many computer do you want to input?");
            int addnumber = p_sc.nextInt();
            p_sc.nextLine();
            check(addnumber);
        }

    }

    // if the computer array have enough space, then allow to save.
    public void check(int addnumber) {

        int expectspace = 0;

        boolean result = false;

        expectspace = addnumber + computernumber;

        if(computerspace - expectspace > 0) {

            System.out.println("Enough space to add a computer!");
            addComputer(addnumber);
            result = true;
        }
        else {


            System.out.println("Sorry, the database is full.");
        }
    }

    public void addComputer(int addnumber) {

        String brand;
        String model;
        double price;

        for(int i = 0; i < addnumber ; i++) {

            System.out.println("Please enter your " + (i+1) + " computer:");
            System.out.println("Please enter the brand: ");
            brand = p_sc.next();

            System.out.println("Please enter the model: ");
            model = p_sc.next();

            System.out.println("Please enter the price: ");
            price = p_sc.nextDouble();

            Computer addcomputer = new Computer(brand, model, price);
            add(addcomputer);
        }

    }

}
