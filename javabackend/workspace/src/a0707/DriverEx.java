package a0707;

public class DriverEx {
    public static void main(String[] args) {
        Driver driver = new Driver();

        Bus bus = new Bus();
        driver.drive(bus);
        Taxi taxi = new Taxi();
        driver.drive(taxi);
    }
}
