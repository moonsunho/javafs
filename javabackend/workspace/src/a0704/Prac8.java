package a0704;

import java.util.Scanner;

public class Prac8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i<n;i++){
            for(int j = 0; j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
