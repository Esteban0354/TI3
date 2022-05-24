package model;
public class Company{
    private String name;
    private Vehicle[] vehicle;
    public Company(String n){
        name=n;
        vehicle = new Vehicle[100];
    }
    public Vehicle[] getVehicle() {
        return vehicle;
    }
    public void setVehicle(Vehicle[] vehicle) {
        this.vehicle = vehicle;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public boolean existVehicle(String plate){
        boolean verVehicle=false;
        for(int i=0; i<vehicle.length && verVehicle==false;i++){
            if(vehicle[i]!=null && vehicle[i].getPlate().equalsIgnoreCase(plate)){
                verVehicle=true;
            }
            
        }
        return verVehicle;
    }

    
    public String addGasolineCar(boolean alreadyUse, double basePrice, double sellPrice, String brand,String model,String cilinder,double kilometers,String plate,String numDoors,boolean polarized,int typeCar, double gasCapacity,double gasConsume,int typeGas){
        boolean cont=true;
        String mes="";
        boolean existV=existVehicle(plate);
        if(existV==true){
            mes="The vehicle allready exist";
        }
        else{
            for(int i=0; i<vehicle.length && cont==true;i++){
                if(vehicle[i]==null){
                    vehicle[i]= new Gasoline(alreadyUse,basePrice,sellPrice,brand,model,cilinder,kilometers,plate,numDoors, polarized, typeCar,gasCapacity,gasConsume,typeGas);
                    cont=false;
                    mes="The vehicle has been registered succesfully";
                }
            }
            if(cont==true){
                mes="Maximun vehicles reached";
            }
        }
        return mes;
    }
    
    public String addElectricCar(boolean alreadyUse, double basePrice, double sellPrice, String brand,String model,String cilinder,double kilometers,String plate,int typeCharger, double batteryDuration,double batteryConsume, String numDoors, boolean polarized, int typeCar){
        boolean cont=true;
        String mes="";
        boolean existV=existVehicle(plate);
        if(existV==true){
            mes="The vehicle allready exist";
        }
        else{
            for(int i=0; i<vehicle.length && cont==true;i++){
                if(vehicle[i]==null){
                    vehicle[i]= new Electric(alreadyUse,basePrice,sellPrice,brand,model,cilinder,kilometers,plate,numDoors, polarized, typeCar,typeCharger,batteryDuration,batteryConsume);
                    cont=false;
                    mes="The vehicle has been registered succesfully";
                }
            }
            if(cont==true){
                mes="Maximun vehicles reached";
            }
        }
        return mes;
    }

    public String addHybridCar(boolean alreadyUse, double basePrice, double sellPrice, String brand,String model,String cilinder,double kilometers,String plate,int typeCharger, double batteryDuration,double batteryConsume, String numDoors, boolean polarized, int typeCar, double gasCapacity,double gasConsume,int typeGas){
        boolean cont=true;
        String mes="";
        boolean existWet=existVehicle(plate);
        if(existWet==true){
            mes="The vehicle allready exist";
        }
        else{
            for(int i=0; i<vehicle.length && cont==true;i++){
                if(vehicle[i]==null){
                    vehicle[i]= new Hybrid(alreadyUse,basePrice,sellPrice,brand,model,cilinder,kilometers,plate,numDoors, polarized, typeCar,typeCharger,batteryDuration,batteryConsume,gasCapacity,gasConsume,typeGas);
                    cont=false;
                    mes="The vehicle has been registered succesfully";
                }
            }
            if(cont==true){
                mes="Maximun vehicles reached";
            }
        }
        return mes;
    }

    public String addMotorcycle(boolean alreadyUse, double basePrice, double sellPrice, String brand,String model,String cilinder,double kilometers,String plate,double gasCapacity, double gasConsume, int type){
        boolean cont=true;
        String mes="";
        boolean existWet=existVehicle(plate);
        if(existWet==true){
            mes="The vehicle allready exist";
        }
        else{
            for(int i=0; i<vehicle.length && cont==true;i++){
                if(vehicle[i]==null){
                    vehicle[i]= new Motorcycle(alreadyUse,basePrice,sellPrice,brand,model,cilinder,kilometers,plate,gasCapacity,gasConsume,type);
                    cont=false;
                    mes="The vehicle has been registered succesfully";
                }
            }
            if(cont==true){
                mes="Maximun vehicles reached";
            }
        }
        return mes;
    }


}