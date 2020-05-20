

public class Vehicle{
    private String VIN, make, model, color;
    private double wholesaleCost, retailPrice;
    private int modelYear;
    private VehicleClassification vehicleClass;

    //our constructor with all given properties
    public Vehicle(String VIN, double wholesaleCost, double retailPrice, int modelYear, String make, String model,String color, VehicleClassification vehicleClass) {
        this.VIN = VIN;
        this.wholesaleCost = wholesaleCost;
        this.retailPrice = retailPrice;
        this.modelYear = modelYear;
        this.make = make;
        this.model = model;
        this.color = color;

    }

    //Getters then Setters
    public String getVin(){
        return VIN;
    }
    public void setVin(String VIN){
        this.VIN = VIN;
    }
    public double getWholeSale(){
        return wholesaleCost;
    }
    public void setWholeSale(double wholesaleCost){
        this.wholesaleCost = wholesaleCost;
    }
    public double getRetailPrice(){
        return retailPrice;
    }
    public void setRetailPrice(double retailPrice){
        this.retailPrice = retailPrice;
    }
    public int getModelYear(){
        return modelYear;
    }
    public void setModelYear(int modelYear){
        this.modelYear = modelYear;
    }
    public String getMake(){
        return make;
    }
    public void setMake(String make){
        this.make = make;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public VehicleClassification getVehicleClass(){
        return vehicleClass;
    }
    public void setVehicleClass(VehicleClassification vehicleClass){
        this.vehicleClass = vehicleClass;
    }

    @Override//Annotation telling us and compiler that we are Overriding previously defined behavior
    public String toString(){
        return this.getModelYear() + ""+this.getMake() + "" + this.getModel();
        //2018 Kia Sorrento
    }

    public double getTargetMargin(){
        return this.retailPrice - this.wholesaleCost;
    }

}
