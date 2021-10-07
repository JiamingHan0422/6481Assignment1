package PartII;

import java.util.*;
//-----------------------------------------------------
//Assignment (1)
// Zitao Wang & Jiaming Han
//Written by: (Zitao Wang 40171434)
//-----------------------------------------------------
public class Option2 extends ComputerDatabase{

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

        if(result) {
            System.out.println("Which computer do you want to update?");
            int apdatenumber = p_sc.nextInt();
            p_sc.nextLine();
            update(apdatenumber);
        }

    }

    public void update(int apdatenumber) {

        for(int i = 0; i < computernumber; i++) {

            if(inventory[i].getSN() == apdatenumber) {

                System.out.println(inventory[i]);
                boolean unquit = true;
                do {
                    System.out.println(" ======================================================");
                    System.out.println(" What information would you like to change?            ");
                    System.out.println(" Enter your choice >                                   ");
                    System.out.println(" ======================================================");
                    System.out.println("1. brand                                               ");
                    System.out.println("2. model                                               ");
                    System.out.println("3. SN                                                  ");
                    System.out.println("4. price                                               ");
                    System.out.println("5. Quit                                                ");
                    System.out.println("Please enter your choice >                             ");
                    System.out.println(" ======================================================");

                    String command;
                    command = p_sc.nextLine();
                    switch(command) {

                        case "1":
                            System.out.println("Please input the new brand(String). ");
                            String brand = p_sc.nextLine();
                            inventory[i].setBrand(brand);
                            break;
                        case "2":
                            System.out.println("Please input the new model(String). ");
                            String model = p_sc.nextLine();
                            inventory[i].setModel(model);
                            break;
                        case "3":
                            System.out.println("Please input the new SN(long). ");
                            long SN = p_sc.nextLong();
                            inventory[i].setSN(SN);
                            break;
                        case "4":
                            System.out.println("Please input the new price(double). ");
                            double price = p_sc.nextDouble();
                            inventory[i].setPrice(price);
                            break;
                        case "5":
                            System.out.println("GoodBye.");
                            unquit = false;
                            break;
                        default:
                            System.out.println("this command does not exist");
                    }
                }while(unquit);

            }

        }

    }

}
