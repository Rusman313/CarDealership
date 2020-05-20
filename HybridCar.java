public class HybridCar extends Car {
 //extending the subclass 
 private int batteryLife;
 private String chargerType;
 private int MPG;
    public HybridCar(String VIN, double wholesaleCost, double retailPrice, int modelYear, String make, String model, String color, int batteryLife, int MPG, String chargerType, VehicleClassification vehicleClass) {
        super(VIN, wholesaleCost, retailPrice, modelYear, make, model, color, vehicleClass);
        this.batteryLife = batteryLife;
        this.MPG = MPG;
        this.chargerType = chargerType;
    }
   //Getter
   public int getBatteryLife(){
       return this.batteryLife;
   }
   public void setBatteryLife(int batteryLife){
       this.batteryLife = batteryLife;
   }
   public int getMPG(){
       return this.MPG;
   }
   public void setMPG(int MPG){
       this.MPG = MPG;
   }
   public String getChargerType(){
       return chargerType;
   }
   public void setChargerType(String chargerType){
       this.chargerType = chargerType;
   }
    
}