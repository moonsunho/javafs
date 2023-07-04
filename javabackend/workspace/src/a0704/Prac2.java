package a0704;

import java.util.Scanner;

public class Prac2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력 > ");
        float num = scanner.nextFloat();

        // System.out.printf("%.2f",num);
        num = (num+0.005f)*100;
        System.out.println(num);
        int i = (int)num;
        System.out.println(i);
        num =(float)i/100;
        System.out.println(num);
    }
}
