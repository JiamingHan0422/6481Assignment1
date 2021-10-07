package PartII;

import java.util.*;
//-----------------------------------------------------
//Assignment (1)
//© Jiaming Han
//Written by: (Jiaming Han 40185367)
//-----------------------------------------------------
public class Option3 {

    public static void findComputersBy() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please input the brand.");
        String brand;
        brand = sc.nextLine();
        for(int i = 0; i  < ComputerDatabase.computernumber; i++) {

            if(ComputerDatabase.inventory[i].getBrand().equals(brand)) {

                System.out.println(ComputerDatabase.inventory[i]);
            }
            else
                System.out.println("there is no computer martching this brand");

        }

    }
}

