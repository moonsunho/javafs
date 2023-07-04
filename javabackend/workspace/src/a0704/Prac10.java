package a0704;

import java.util.Arrays;
import java.util.Scanner;

public class Prac10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] num = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("숫자 입력 >");
            num[i] = scan.nextInt();
        }
        Arrays.sort(num);
        int min = num[0];
        System.out.println(min);
    }
}
