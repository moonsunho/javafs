package a0712;

public class CarAgency implements Rentable<Car_01> {
    @Override
    public Car_01 rent(){
        return new Car_01();
    }
}
