package a0704;

class Data2{int x;}

public class Ex6_7 {
    public static void main(String[] args) {
        Data2 d = new Data2();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        change(d);
        System.out.println("After changed(d.x)");
        System.out.println("main() : x = " + d.x);

    }
    // static 메서드는 인스턴스 생성없이 클래스 이름으로 호출 가능
    static void change(Data2 d){  // 기본형 매개변수
        d.x =1000;
        System.out.println("change() : x = "+ d.x);
    }
}
