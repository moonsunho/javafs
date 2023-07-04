package a0704;

import java.text.DecimalFormat;
import java.math.RoundingMode;
import java.util.Scanner;

public class Prac2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력 > ");
        float num = scanner.nextFloat();

       DecimalFormat df = new DecimalFormat("#,##");
       String rounded = df.format(num);
       System.out.println(rounded);
    }
}
