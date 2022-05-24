package model;
public class Motorcycle extends Vehicle{
    
    private double gasCapacity;
    private double gasConsume;
    private TypeMotorcycle type;
    public Motorcycle(boolean alreadyUse, double basePrice, double sellPrice, String brand,String model,String cilinder,double kilometers,String plate,double g, double gc, int t){
        super(alreadyUse, basePrice, sellPrice, brand, model, cilinder, kilometers, plate);
        gasCapacity=g;
        gasConsume=gc;
        switch (t) {
            case 1:
                type=TypeMotorcycle.STANDAR;
                break;
            case 2:
                type=TypeMotorcycle.SPORT;
                break;
            case 3:
                type=TypeMotorcycle.SCOOTER;
                break;
            case 4:
                type=TypeMotorcycle.CROSS;
                break;
        }
        
    }
    public TypeMotorcycle getType() {
        return type;
    }
    public void setType(TypeMotorcycle type) {
        this.type = type;
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