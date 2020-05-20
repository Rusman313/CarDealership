

public class Car extends Vehicle {
    //Simple Car constructor inheriting all of the models and properties of Vehicle
    public Car(String VIN, double wholesaleCost, double retailPrice, int modelYear, String make, String model,String color, VehicleClassification vehicleClass){
        super(VIN, wholesaleCost, retailPrice, modelYear, make, model, color, vehicleClass);
    }

    @Override // overrides previously defined behavior
    public double getTargetMargin(){
        return super.getTargetMargin() - 1000;
        // incentive of 1000 for purchasing a car type of vehicle
        // have to use our getters to pull the retail price and wholesale cost because variables 
        //are private. this.getRetailPrice() - this.getWholeSale()
        // instead of writing out ^^ again we can just call the method from vehicle using super.
        //method  which is using the getTargetMargin method as its defined in our superclass (Vehicle)
    }
}