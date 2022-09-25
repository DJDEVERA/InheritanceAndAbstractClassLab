package edu.sdccd.cisc191;

public class GasCar extends Car implements Combustible {

   int fuelLevel;

    public GasCar(String Name, int Miles, int Price, int Seats, Option[] option, int Doors){

        // Calls Manufacturer Name, Miles, Price, Number of Seats, Option, and Doors from Car Class
        super(Name, Miles, Price, Seats, option, Doors);

    }

    public void tankUp(){

        // increase value of fuelLevel to 100
        fuelLevel = 100;

    }

    public int getFuelLevel(){

        // Returns fuelLevel
        return fuelLevel;

    }

}
