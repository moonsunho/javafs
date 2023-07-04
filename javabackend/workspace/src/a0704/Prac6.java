package a0704;

import java.util.Scanner;

public class Prac6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        int maxNum = (a > b) ? a : b;
        System.out.println(maxNum);
    }
}
