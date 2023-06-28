package a0628;

public class Ex3_16 {
    public static void main(String[] args) {
        boolean b = true;
        char ch = 'C';

        System.out.printf("b=%b%n",b);
        System.out.printf("!b=%b%n",!b);
        System.out.printf("!!b=%b%n",!!b);
        System.out.printf("!!!b=%b%n",!!!b);

        System.out.printf("ch = %c%n",ch);
        System.out.printf("ch < 'a' || ch > 'z' = %b%n",ch < 'a' || ch > 'z');
        // true : a의 아스키코드값은 97, 대문자 C 는 67
        System.out.printf("!('a' <= ch && ch <= 'z')= %b%n",!('a'<=ch && ch<='z'));
        System.out.printf("'a' <= ch && ch <= 'z'= %b%n",'a'<=ch && ch <= 'z');
        // false : &&앞뒤 식 둘다 참이여야 true
    }
}
