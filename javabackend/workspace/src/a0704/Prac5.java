package a0704;

import java.util.Scanner;

public class Prac5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int sum = a + b+ c;
        float avg = (float)(sum)/3;

        System.out.println(sum);
        System.out.println(avg);
    }
}
