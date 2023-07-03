package a0703;

public class Car1 {
    public static void main(String[] args) {

        car myCar = new car();
        System.out.println("제작회사:" + myCar.company);
        System.out.println(myCar.model);
        System.out.println(myCar.color);
        System.out.println(myCar.maxSpeed);
        System.out.println(myCar.speed);

        myCar.speed = 60;
        System.out.println("수정된 속도:" + myCar.speed);
    }
}

class car {
    String company = "현대자동차";
    String model = "그랜저";
    String color = "검정";
    int maxSpeed = 350;
    int speed;
}