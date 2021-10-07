package PartII;
//-----------------------------------------------------
//Assignment (1)
// Zitao Wang & Jiaming Han
//Written by: (Zitao Wang 40171434)
//-----------------------------------------------------

public class ComputerDatabase {

    static Computer inventory[] = new Computer[1000];
    static int computernumber = 0;
    static int computerspace = 1000;


    public boolean add(Computer c) {
        // add new computer c into the end computer array.
        inventory[computernumber] = c;

        if(inventory[computernumber].equals(c)) {
            System.out.println("Input success! ");
            System.out.println(inventory[computernumber]);

            computernumber++;
            return true;
        }
        else {
            System.out.println("Input failed! ");
            return false;
        }

    }

}
