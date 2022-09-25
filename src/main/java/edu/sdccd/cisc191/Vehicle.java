package edu.sdccd.cisc191;

public class Vehicle {

    private String ManufacturerName;
    private int Miles;
    private int Price;
    private int Seats;
    Option[] option;

    public Vehicle(String ManufacturerName, int Miles, int Price, int Seats, Option[] option){

        // contains variables to this object
        this.ManufacturerName = ManufacturerName;
        this.Miles = Miles;
        this.Price = Price;
        this.Seats = Seats;
        this.option = option;

    }


    public String getManufacturerName(){

        // returns Manufacturer Name
        return ManufacturerName;

    }

    public int getMilesOnVehicle(){

        // returns Miles on Vehicle
        return Miles;

    }

    public int getPrice(){

        // returns Vehicle Price
        return Price;

    }

    public int getNumberOfSeats() {

        // returns Number of Seats in Vehicle
        return Seats;

    }

    public Option[] getOptions() {

        // returns options
        return option;

    }

}
