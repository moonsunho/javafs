public class Ex6_2 {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();
         System.out.println("tv1의 channel값은" + t1.channel +"입니다.");
         System.out.println("tv2의 channel값은" + t2.channel +"입니다.");
         
         t1.channel = 7;
         System.out.println("t1의 channel값을 7로 변경하였습니다.");
         
         System.out.println("tv1의 channel값은" + t1.channel +"입니다.");
         System.out.println("tv2의 channel값은" + t2.channel +"입니다.");
         
    }
}
class Tv{
    // Tv의 속성(멤버변수)
    String color; // 색상
    boolean power; // 전원상태(on/off)
    int channel; // 채널

    // Tv의 기능(메서드)
    void power(){power = !power;} // Tv를 켜거나 끄는 기능을 하는 메서드
    void channelUp(){++channel;} // Tv 채널을 높이는 기능을 하는 메서드
    void channelDown(){--channel;} // Tv 채널을 낮추는 기능을 하는 메서드
}
