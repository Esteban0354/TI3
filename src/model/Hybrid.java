package model;
public class Hybrid extends Car{
    private TypeCharger typeCharger;
    private double batteryDuration;
    private double batteryConsume;
    private double gasCapacity;
    private double gasConsume;
    private TypeGasoline typeGas;
    public Hybrid(boolean alreadyUse, double basePrice, double sellPrice, String brand,String model,String cilinder,double kilometers,String plate,String numDoors,boolean polarized,int typeCar, int tc, double bd, double bc, double g, double gc,int tg){
        super(alreadyUse,  basePrice,  sellPrice,  brand, model, cilinder, kilometers, plate, numDoors, polarized, typeCar);
        switch (tc) {
            case 1:
                typeCharger=TypeCharger.FAST;
                break;
            case 2:
                typeCharger=TypeCharger.NORMAL;
                break;
        }
        switch (tg) {
            case 1:
                typeGas=TypeGasoline.NORMAL;
                break;
            case 2:
                typeGas=TypeGasoline.EXTRA;
                break;
            case 3:
                typeGas=TypeGasoline.DIESEL;
                break;    
        }
        batteryDuration=bd;
        batteryConsume=bc;
        gasCapacity=g;
        gasConsume=gc;
        
    }
    public TypeGasoline getTypeGas() {
        return typeGas;
    }
    public void setTypeGas(TypeGasoline typeGas) {
        this.typeGas = typeGas;
    }
    public double getGasConsume() {
        return gasConsume;
    }
    public void setGasConsume(double gasConsume) {
        this.gasConsume = gasConsume;
    }
    public double getGasCapacity() {
        return gasCapacity;
    }
    public void setGasCapacity(double gasCapacity) {
        this.gasCapacity = gasCapacity;
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
}




