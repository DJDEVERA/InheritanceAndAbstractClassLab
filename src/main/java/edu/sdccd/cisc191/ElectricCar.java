package edu.sdccd.cisc191;

public class ElectricCar extends Car implements Chargeable{

    private int batteryCharge;

    public ElectricCar(String ManufacturerName, int Miles, int Price, int Seats, Option[] option, int Doors){

        // Calls Manufacturer Name, Miles, Price, Number of Seats, Option, and Doors from Car Class
        super(ManufacturerName, Miles, Price, Seats, option, Doors);

    }

    public int getBatteryCharge(){

        // return batteryCharge
        return batteryCharge;

    }

    public void chargeUp(){

        // increases value of batteryCharge to 100
        batteryCharge = 100;

    }


}
