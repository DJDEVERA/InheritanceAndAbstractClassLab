package edu.sdccd.cisc191;

public class HybridCar extends Car implements Combustible, Chargeable {

    private int fuelLevel;
    private int batteryCharge;

    public HybridCar(String Name, int Miles, int Price, int Seats, Option[] option, int Doors){

        // Calls Manufacturer Name, Miles, Price, Number of Seats, Options, and Doors from Car Class
        super(Name, Miles, Price, Seats, option, Doors);

    }

    public int getFuelLevel(){

        // returns fuelLevel
        return fuelLevel;

    }

    public void tankUp(){

        // increase value of fuelLevel to 100
        fuelLevel = 100;
    }


    public int getBatteryCharge(){

        // returns batterCharge
        return batteryCharge;

    }

    public void chargeUp(){

        // increase value of batteryCharge to 100
        batteryCharge = 100;

    }


}
