package PartII;

import java.util.Scanner;
//-----------------------------------------------------
//Assignment (1)
//© Jiaming Han
//Written by: (Jiaming Han 40185367)
//-----------------------------------------------------
public class Option4 {

    public static void findCheaperThan() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please input the price.");
        double price;
        price = sc.nextDouble();
        for(int i = 0; i  < ComputerDatabase.computernumber; i++) {

            if(ComputerDatabase.inventory[i].getPrice() <= price) {

                System.out.println(ComputerDatabase.inventory[i]);
            }
            else
                System.out.println("there is no computer that cheaper than entered price");
        }
    }
}
