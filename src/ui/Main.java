package ui;
import java.util.Scanner;
import model.*;
public class Main{
    public static Scanner lector = new Scanner(System.in);
    public static void main(String[] args){
        Company a= new Company("Parqueadero");
        boolean sigo=true;
        while (sigo) {
            System.out.println("Welcome to Parking App");
            System.out.println("1. Create a new vehicle");
            System.out.println("2. ");
            System.out.println("3. Exit");
            int menu=lector.nextInt();
            switch (menu) {
                case 1:
                    addVehicle(a);
                    break;
                case 2:
                    
                    break;
                case 3:
                    sigo=false;
                    break;
            }
        }
    }

    
    public static void addVehicle(Company a){
        System.out.println(" The vehicle is already used?");
        boolean alreadyUse=lector.nextBoolean();
        System.out.println("Type the base price of the vehicle");
        double basePrice=lector.nextDouble();
        System.out.println("Type the sell price of the vehicle");
        double sellPrice=lector.nextDouble();
        System.out.println("Type the brand of the vehicle");
        lector.next();
        String brand=lector.next();
        System.out.println("Type the model of the vehicle");
        String model=lector.next();
        System.out.println("Type the cilinder capacity of the vehicle");
        String cilinder=lector.next();
        System.out.println("Type how many kilometers have the vehicle");
        double kilometers=lector.nextDouble();
        System.out.println("Type the plate of the vehicle");
        String plate=lector.next();
        System.out.println("Select the type of vehicle you want to create. 1. Gasoline cars / 2. Electric Cars / 3. Hybrid Cars / 4. Motorcycles");
        int aux=lector.nextInt();
        switch (aux) {
            case 1:
                gasoline(a, alreadyUse, basePrice, sellPrice, brand, model, cilinder, kilometers, plate);
                break;
            case 2:
                electric(a, alreadyUse, basePrice, sellPrice, brand, model, cilinder, kilometers, plate);
                break;
            case 3:
                hybrid(a, alreadyUse, basePrice, sellPrice, brand, model, cilinder, kilometers, plate);
                break;
            case 4:
                motorcycle(a, alreadyUse, basePrice, sellPrice, brand, model, cilinder, kilometers, plate);
                break;
        }
        
    }

    public static void electric(Company a,boolean alreadyUse, double basePrice, double sellPrice, String brand,String model,String cilinder,double kilometers,String plate){
        System.out.println("Type how many doors the cars have");
        String numDoors=lector.next();
        System.out.println("Is the car polarized? True/False");
        boolean polarized=lector.nextBoolean();
        System.out.println("Select the type of the car. 1. Sedan / 2. Pick up Truck");
        int typeCar=lector.nextInt();
        System.out.println("Select one of the following options for the type of charger");
        int typeCharger=lector.nextInt();
        System.out.println("Type the duration of the car's battery");
        double batteryDuration=lector.nextDouble();
        System.out.println("Type the consume of the car's battery");
        double batteryConsume=lector.nextDouble();
        String message=a.addElectricCar(alreadyUse,basePrice,sellPrice,brand,model,cilinder,kilometers,plate,typeCharger,batteryDuration,batteryConsume,numDoors,polarized,typeCar);
        System.out.println(message);
    }

    public static void gasoline(Company a,boolean alreadyUse, double basePrice, double sellPrice, String brand,String model,String cilinder,double kilometers,String plate){
        System.out.println("Type how many doors the cars have");
        String numDoors=lector.next();
        System.out.println("Is the car polarized? True/False");
        boolean polarized=lector.nextBoolean();
        System.out.println("Select the type of the car. 1. Sedan / 2. Pick up Truck");
        int typeCar=lector.nextInt();
        System.out.println("Select the type of gas the car use. 1.Normal / 2.Extra / 3.Diesel");
        int typeGas=lector.nextInt();
        System.out.println("Type the car's gasoline capacity");
        double gasCapacity=lector.nextDouble();
        System.out.println("Type the car's gasoline consume");
        double gasConsume=lector.nextDouble();
        String message=a.addGasolineCar(alreadyUse,basePrice,sellPrice,brand,model,cilinder,kilometers,plate,numDoors,polarized,typeCar,gasCapacity,gasConsume,typeGas);
        System.out.println(message);
    }

    public static void hybrid(Company a,boolean alreadyUse, double basePrice, double sellPrice, String brand,String model,String cilinder,double kilometers,String plate){
        System.out.println("Type how many doors the cars have");
        String numDoors=lector.next();
        System.out.println("Is the car polarized? True/False");
        boolean polarized=lector.nextBoolean();
        System.out.println("Select the type of the car. 1. Sedan / 2. Pick up Truck");
        int typeCar=lector.nextInt();
        System.out.println("Select the type of gas the car use. 1.Normal / 2.Extra / 3.Diesel");
        int typeGas=lector.nextInt();
        System.out.println("Type the car's gasoline capacity");
        double gasCapacity=lector.nextDouble();
        System.out.println("Type the car's gasoline consume");
        double gasConsume=lector.nextDouble();
        System.out.println("Select one of the following options for the type of charger");
        int typeCharger=lector.nextInt();
        System.out.println("Type the duration of the car's battery");
        double batteryDuration=lector.nextDouble();
        System.out.println("Type the consume of the car's battery");
        double batteryConsume=lector.nextDouble();
        String message=a.addHybridCar(alreadyUse,basePrice,sellPrice,brand,model,cilinder,kilometers,plate,typeCharger,batteryDuration,batteryConsume,numDoors,polarized,typeCar,gasCapacity,gasConsume,typeGas);
        System.out.println(message);
    }

    public static void motorcycle(Company a,boolean alreadyUse, double basePrice, double sellPrice, String brand,String model,String cilinder,double kilometers,String plate){
        System.out.println("Type the bike's gasoline capacity");
        double gasCapacity=lector.nextDouble();
        System.out.println("Type the bike's gasoline consume");
        double gasConsume=lector.nextDouble();
        System.out.println("Select the type of motorcycle. 1.Standar / 2.Sport / 3.Scooter / 4.Cross");
        int type=lector.nextInt();
        String message=a.addMotorcycle(alreadyUse,basePrice,sellPrice,brand,model,cilinder,kilometers,plate,gasCapacity,gasConsume,type);
        System.out.println(message);
    }


}