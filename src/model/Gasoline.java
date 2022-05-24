package model;
public class Gasoline extends Car{
    private double gasCapacity;
    private double gasConsume;
    private TypeGasoline typeGas;
    public Gasoline(boolean alreadyUse, double basePrice, double sellPrice, String brand,String model,String cilinder,double kilometers,String plate,String numDoors,boolean polarized,int typeCar, double g, double gc, int tg){
        super(alreadyUse,  basePrice,  sellPrice,  brand, model, cilinder, kilometers, plate, numDoors, polarized, typeCar);
        gasCapacity=g;
        gasConsume=gc;
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
}