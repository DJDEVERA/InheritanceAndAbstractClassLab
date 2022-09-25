package edu.sdccd.cisc191;

public class SportsUtilityVehicle extends Vehicle{

    private int MaxTowWeight;

    public SportsUtilityVehicle(String Name, int Miles, int Price, int Seats, Option[] option, int MaxTowWeight){

        // Calls Manufacturer Name, Miles, Price, Number of Seats, and Options from Vehicle Class
        super(Name, Miles, Price, Seats, option);
        // Contains MaxTowWeight to this object
        this.MaxTowWeight = MaxTowWeight;


    }

    public int getMaxTowingWeight(){

        // Returns MaxTowWeight as integer
        return MaxTowWeight;

    }





}
