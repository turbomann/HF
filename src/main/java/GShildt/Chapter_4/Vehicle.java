package GShildt.Chapter_4;

public class Vehicle {
    int passengers;
    int fuelcap;
    int mpg;

    Vehicle(int pass, int fuel, int m) {
        passengers = pass;
        fuelcap = fuel;
        mpg = m;
    }

    int range() {
        return mpg * fuelcap;
    }
    double fuelneeded(int miles){
        return (double) miles/mpg;
    }

}

class VehicleDemo {
    public static void main(String args[]) {
// Полностью сконструировать объекты транспортных средств
        Vehicle minivan = new Vehicle(7, 16, 21);
        Vehicle sportscar = new Vehicle(2, 14, 12);
        double gallons;
        int dist = 252;
        gallons = minivan.fuelneeded(dist);
        System.out.println("Для преодоления " + dist +
                " мль мни-фургону требуется " +
                gallons + " галлонов топлива");
        gallons = sportscar.fuelneeded(dist);
        System.out.println("Для преодоления " + dist +
                " мль спортивном автомобилю требуется " +
                gallons + " галлонов топлива");
}}