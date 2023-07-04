package a0704;

import java.util.Scanner;

public class Prac3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("년,월,일 순으로 입력 > ");
        int y = scanner.nextInt();
        int m = scanner.nextInt();
        int d = scanner.nextInt();

        System.out.printf("%d.%02d.%02d",y,m,d);
    }
}
