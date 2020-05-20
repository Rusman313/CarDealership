public class LightTruck extends Vehicle {
    private long towingCapacity, grossCombinedWeight, truckWeight;
    private boolean is4wd;

    //Constructor with both inherited properties and new properties
    public LightTruck(String VIN, double wholesaleCost, double retailPrice, int modelYear, String make, String model,String color, long towingCapacity, long truckWeight, boolean is4wd){
        super(VIN, wholesaleCost, retailPrice, modelYear, make, model, color);
        this.towingCapacity = towingCapacity;
        this.truckWeight = truckWeight;
        this.is4wd = is4wd;
        this.grossCombinedWeight = this.towingCapacity + this.truckWeight;
    }
    

    //Getters and Setters
    public long getTowingCapacity(){
        return this.towingCapacity;
    }
    public void setTowingCapacity(long towingCapacity){
        this.towingCapacity = towingCapacity;
    }
    public long getTruckWeight(){
        return this.truckWeight;
    }
    public void setTruckWeight(long truckWeight){
        this.truckWeight = truckWeight;
    }
    // method to automatically calculate GCW if no params are given
    public long getGrossCombinedWeight() {
        return this.grossCombinedWeight;
    }
    //overload to manually set GCW if param is provided
    public void setGrossCombinedWeight(long weight){
        this.grossCombinedWeight = weight;
    }
    public void setGrossCombinedWeight(){
        this.grossCombinedWeight = this.towingCapacity + this.truckWeight;
    }
    public boolean getIs4wd(){
        return this.is4wd;
    }
    public void setIs4wd(boolean is4wd){
        this.is4wd = is4wd;
    }

    @Override
    public String toString() {
        //get the string output from our "default" superclass method
        // Example: 2018 Kia Sorrento
        //and store that in a variable for us to use
        String str = super.toString();
        //If 4wd, signify that in return string//appends string to end of our string variable
        if(is4wd){
            str += ", (4 WD)";
        }
        return str;
    }
}