package a0707;

import java.util.Scanner;

public class Prac1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double[] a1 = { a + b, a - b, a * b, a / b, (double) Math.pow(a, b) };
        double[] b1 = { b + a, b - a, b * a, b / a, (double) Math.pow(b, a) };
        double a1_max = 0;
        double b1_max = 0;

        for(int i=0;i<a1.length;i++){
          if(a1[i] > a1_max){
            a1_max = a1[i];
          }
          if(b1[i] > b1_max){
            b1_max = b1[i];
          }
        }
        double maxNum = (a1_max > b1_max) ? a1_max : b1_max;
        System.out.printf("%6f",maxNum); 
    }
}
