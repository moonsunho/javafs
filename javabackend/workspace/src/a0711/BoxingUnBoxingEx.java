package a0711;

public class BoxingUnBoxingEx {
    public static void main(String[] args) {
        // boxing
        Integer obj = 100;
        System.out.println("value : " + obj.intValue());

        // unboxing
        int value = obj;
        System.out.println("value : " + value);

        // 연산 시 unboxing
        int result = obj + 100;
        System.out.println("result : " + result);
        
    }
}
