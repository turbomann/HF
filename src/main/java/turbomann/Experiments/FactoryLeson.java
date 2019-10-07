package turbomann.Experiments;


import LJV.*;

public class FactoryLeson {
    public static void main(String[] args) {
    Factory factory = new Factory();
    Car vaz = factory.create("Vaz");
    Car toyota = factory.create("Toyota");
    Car def = factory.create("de");
    vaz.drive();
    toyota.drive();
        }
}


interface Car {
    void drive();

}

class Vaz implements Car {
    @Override
    public void drive() {
        System.out.println("This is VAZ");
    }
}

class Toyota implements Car {
    @Override
    public void drive() {
        System.out.println("This is Toyota");
    }

}

class Factory {
    public Car create(String typeOfCar)
    {
        switch (typeOfCar){
            case "Toyota" : return new Toyota();
            case "Vaz" : return new Vaz();
            default: return null;
        }

    }
}

