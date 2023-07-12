package a0712;

public class GenericEx_03 {
    public static void main(String[] args) {
        HomeAgency homeAgency = new HomeAgency();
        Home home = homeAgency.rent();
        home.turnOnLight();

        CarAgency carAgency = new CarAgency();
        Car_01 car_01 = carAgency.rent();
        car_01.run();
    }   
}
