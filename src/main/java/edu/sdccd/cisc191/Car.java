package edu.sdccd.cisc191;

public class Car extends Vehicle{

    private int Doors;

    public Car(String Name, int Miles, int Price, int Seats, Option[] option, int Doors){

        // Calls Manufacturer Name, Miles, Price, Number of Seats, and Options from Vehicle Class
        super(Name, Miles, Price, Seats, option);
        // Contains NumberOfDoors to this object
        this.Doors = Doors;

    }

    public int getNumberOfDoors(){

        // Returns Number of Doors
        return Doors;

    }


}
