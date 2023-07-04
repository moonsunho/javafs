package a0704;

import java.util.Scanner;

public class Prac1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a;
        String b;

        System.out.print("첫번째 문자 입력 > ");
        a = scanner.nextLine();
        System.out.print("두번째 문자 입력 > ");
        b = scanner.nextLine();

        System.out.println(b + " " + a);

    }
}
