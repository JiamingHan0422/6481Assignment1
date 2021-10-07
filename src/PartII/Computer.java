package PartII;
//-----------------------------------------------------
//Assignment (1)
//© Jiaming Han
//Written by: (Jiaming Han 40185367)
//-----------------------------------------------------

public class Computer{

    private String brand;
    private String model;
    private long SN;
    private double price;

    private static int numOfCreatedObjects = 0;
    private static long serialNumCtr = 1000;

    //default constructor, to initial computer object
    public Computer() {

        brand = "Nullbrand";
        model = "NullModel";
        SN = serialNumCtr + numOfCreatedObjects + 1;
        price = 0.0;

        numOfCreatedObjects++;
    }

    public Computer(String brand, String model, double price) {

        this.brand = brand;
        this.model = model;
        this.SN = serialNumCtr + numOfCreatedObjects + 1;
        this.price = price;

        numOfCreatedObjects++;
    }

    public String getBrand() {
        System.out.println("Brand is: " + this.brand);
        return brand;
    }
    public String getModel() {
        System.out.println("Model is: " + this.model);
        return model;
    }
    public long getSN() {
        System.out.println("SN is: " + this.SN);
        return SN;
    }
    public double getPrice() {
        System.out.println("price is: " + this.price);
        return price;
    }


    public void setBrand(String brand) {
        this.brand = brand;
        System.out.println("Brand is: " + this.brand);
    }
    public void setModel(String model) {
        this.model = model;
        System.out.println("Model is: " + this.model);
    }
    public void setSN(long SN) {
        this.SN = SN;
        System.out.println("SN is: " + this.SN);
    }
    public void setPrice(double price) {
        this.price = price;
        System.out.println("Price is: " + this.price);
    }

    public String toString() {

        return "This computer has:" + "\n" +
                "Brand is: " + this.brand + "\n" +
                "Model is: " + this.model + "\n" +
                "SN is: " + this.SN + "\n" +
                "Price is: " + this.price;
    }

    // print out the number of Created computer.
    public static void DisplayNumberOfCreatedObjects()
    {
        System.out.println("The number of created Computer objects so far is " + numOfCreatedObjects + ".");
    }

    // to compare if the two computer objects are equal
    public boolean equals(Object x)
    {
        if (x == null || this.getClass() != x.getClass())
            return false;
        else
        {
            // cast the passed object to an Computer object
            Computer e = (Computer)x;
            return (this.brand.equals(e.brand) &&
                    this.model.equals(e.model) &&
                    this.SN == e.SN &&
                    this.price == e.price);
        }
    }


}

