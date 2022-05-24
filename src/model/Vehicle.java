package model;
public class Vehicle{
    private boolean alreadyUse;
    private double basePrice;
    private double sellPrice;
    private String brand;
    private String model;
    private String cilinder;
    private double kilometers;
    private String plate;
    
    public Vehicle(boolean a, double bp, double sp, String b, String m, String c, double km, String p){
        alreadyUse=a;
        basePrice=bp;
        sellPrice=sp;
        brand=b;
        model=m;
        cilinder=c;
        kilometers=km;
        plate=p;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public double getKilometers() {
        return kilometers;
    }

    public void setKilometers(double kilometers) {
        this.kilometers = kilometers;
    }

    public String getCilinder() {
        return cilinder;
    }

    public void setCilinder(String cilinder) {
        this.cilinder = cilinder;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public boolean getAlreadyUse() {
        return alreadyUse;
    }

    public void setAlreadyUse(boolean alreadyUse) {
        this.alreadyUse = alreadyUse;
    }
}
