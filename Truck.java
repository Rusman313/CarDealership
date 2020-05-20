

public class Truck extends Vehicle {
    //Simple Truck constructor inheriting all of the models and properties of Vehicle
    public Truck(String VIN, double wholesaleCost, double retailPrice, int modelYear, String make, String model,String color, VehicleClassification vehicleClass){
        super(VIN, wholesaleCost, retailPrice, modelYear, make, model, color, vehicleClass);
    }
}