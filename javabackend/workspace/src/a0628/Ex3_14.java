package a0628;

public class Ex3_14 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = new String("abc");

        System.out.printf("\"abc\" == \"abc\" ? %b%n","abc"=="abc"); //true
        System.out.printf("str1 == \"abc\" ? %b%n",str1=="abc"); //true
        System.out.printf("str2 == \"abc\" ? %b%n",str2=="abc"); //false
        // == : 저장된 주소를 비교
        System.out.printf("str1.equals(\"abc\") ? %b%n",str1.equals("abc"));
        // str1.equals(\"abc\")
        // str2.equals(\"abc\") str2라는 주소가 가르키는 값을 비교 equals
        System.out.printf("str2.equals(\"abc\") ? %b%n",str2.equals("abc"));
        System.out.printf("str2.equals(\"ABC\") ? %b%n",str2.equals("ABC"));
        System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n",str2.equalsIgnoreCase("ABC"));
        System.out.println(str1);
        System.out.println(str2);
    }
}
