package model;
public class Electric extends Car{
    private TypeCharger typeCharger;
    private double batteryDuration;
    private double batteryConsume;
    
    
    public Electric(boolean alreadyUse, double basePrice, double sellPrice, String brand,String model,String cilinder,double kilometers,String plate,String numDoors,boolean polarized,int typeCar, int tc, double bd, double bc){
        super( alreadyUse,  basePrice,  sellPrice,  brand, model, cilinder, kilometers, plate, numDoors, polarized, typeCar);
        switch (tc) {
            case 1:
                typeCharger=TypeCharger.FAST;
                break;
            case 2:
                typeCharger=TypeCharger.NORMAL;
                break;
        }
        batteryDuration=bd;
        batteryConsume=bc;
    }
    
    public double getBatteryConsume() {
        return batteryConsume;
    }
    public void setBatteryConsume(double batteryConsume) {
        this.batteryConsume = batteryConsume;
    }
    public double getBatteryDuration() {
        return batteryDuration;
    }
    public void setBatteryDuration(double batteryDuration) {
        this.batteryDuration = batteryDuration;
    }
    public TypeCharger getTypeCharger() {
        return typeCharger;
    }
    public void setTypeCharger(TypeCharger typeCharger) {
        this.typeCharger = typeCharger;
    }
    @Override
    public String toString(){
        return super.getAlreadyUse()+" "+super.getBasePrice()+" "+super.getSellPrice()+" "+super.getBrand()+" "+super.getModel()+" "+super.getCilinder()+" "+super.getKilometers()+" "+super.getPlate();
    }
}