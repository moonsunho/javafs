package a0629;

public class W3 {
    public static void main(String[] args) {
        while (true) {
            int num = (int) (Math.random() * 100) + 1;
            System.out.println(num);
            if(num==6){
                break;
            }
        }
        System.out.println("프로그램 종료");
    }
}
