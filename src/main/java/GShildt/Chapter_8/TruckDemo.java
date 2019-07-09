package src.main.java.GShildt.Chapter_8;


class Vehicle implements IVehicle {



    private int passengers;
    private int fuelcap;
    private int mpg;

    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    int range() {
        return mpg * fuelcap;
    }

    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }


    @Override
    public int getPassengers() {
        return passengers;
    }

    @Override
    public void setPassengers(int p) {
        passengers = p;

    }

    @Override
    public int getFuelcap() {
        return fuelcap;
    }

    @Override
    public void setFuelcap(int f)  {
        fuelcap = f;
    }

    @Override
    public int getMpg()  {
        return mpg;
    }

    @Override
    public void setMpg(int m) {
        mpg = m;
    }
}

class Truck extends Vehicle {
    private int cargocap;

    Truck(int p, int f, int m, int c) {
        super(p, f, m);
        cargocap = c;

    }

    int getCargocap() {
        return cargocap;
    }

    void setCargocap(int c) {
        cargocap = c;
    }
}


class TruckDemo {
    public static void main(String args[]) {
Truck semi = new Truck(2,200,7,44000);
Truck pickup = new Truck(3,28,15, 2000);
double gallons;
int dist = 252;

gallons = semi.fuelneeded(dist);

        System.out.println("Грузовик может перевезти " +semi.getCargocap() + "Funts");
        System.out.println("For distance - " + dist+ "need "+gallons + "Of fuel");


gallons = pickup.fuelneeded(dist);

        System.out.println("Pickup может перевезти " +pickup.getCargocap() + "Funts");
        System.out.println("For distance - " + dist+ "need "+gallons + "Of fuel");
    }
}