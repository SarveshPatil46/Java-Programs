class Vehicle{
    private int modelNo;
    private String name;

    Vehicle(){
        this.modelNo = 0;
        this.name = "";
    }

    Vehicle(int modelNo, String name) {
        this.modelNo = modelNo;
        this.name = name;
    }

    void display(){
        System.out.println("Model No : " + modelNo);
        System.out.println("Name : " + name);
    }
}

class Car extends Vehicle{
    private String carType;
    private int passengerCapacity;

    Car(){
        super();
        this.carType = "";
        this.passengerCapacity = 0;
    }

    Car(int modelNo, String name, String carType, int passengerCapacity){
        super(modelNo, name);
        this.carType = carType;
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    void display(){
        super.display();
        System.out.println("Car Type : " + carType);
        System.out.println("Passenger Capacity : " + passengerCapacity);
    }
}

class Truck extends Vehicle{
    private int truckRange;
    private int truckWeight;

    Truck(){
        super();
        this.truckRange = 0;
        this.truckWeight = 0;
    }

    Truck(int modelNo, String name, int truckRange, int truckWeight){
        super(modelNo, name);
        this.truckRange = truckRange;
        this.truckWeight = truckWeight;
    }

    @Override
    void display(){
        super.display();
        System.out.println("Truck Range : " + truckRange);
        System.out.println("Truck Weight : " + truckWeight);
    }
}

public class Inheritance {

    public static void main(String[] args) {
        Car c = new Car (1234, "Tesla", "Electric", 6);
        c.display();
        Truck t = new Truck(5678, "CyberTruck", 500, 100);
        t.display();
    }
}