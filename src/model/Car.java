package model;
public class Car extends Vehicle{
    private String numDoors;
    private boolean polarized;
    private TypeCar typeCar;
    
    public Car(boolean alreadyUse, double basePrice, double sellPrice, String brand,String model,String cilinder,double kilometers,String plate,String n, boolean po, int t){
        super(alreadyUse, basePrice, sellPrice, brand, model, cilinder, kilometers, plate);
        numDoors=n;
        polarized=po;
        switch (t) {
            case 1:
                typeCar=TypeCar.SEDAN;
                break;
            case 2:
                typeCar=TypeCar.PICKUPTRUCK;
                break;
        }
    }
    public TypeCar getCar() {
        return typeCar;
    }
    public void setCar(TypeCar car) {
        this.typeCar = car;
    }
    public boolean isPolarized() {
        return polarized;
    }
    public void setPolarized(boolean polarized) {
        this.polarized = polarized;
    }
    public String getNumDoors() {
        return numDoors;
    }
    public void setNumDoors(String numDoors) {
        this.numDoors = numDoors;
    }
}