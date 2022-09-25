package edu.sdccd.cisc191;

public class PickupTruck extends Vehicle{

    private int CargoCapacity;

    public PickupTruck(String Name, int Miles, int Price, int Seats, Option[] option, int CargoCapacity){

        // Calls Manufacturer Name, Miles, Price, Number of Seats, and Options from Vehicle Class
        super(Name, Miles, Price, Seats, option);
        // Contains CargoCapacity to this object
        this.CargoCapacity = CargoCapacity;

    }

    public int getCargoCapacity(){

        // Returns Cargo Capacity as an integer
        return CargoCapacity;

    }

}
