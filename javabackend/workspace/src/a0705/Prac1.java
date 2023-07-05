package a0705;

import java.util.Scanner;

public class Prac1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ball = scan.nextInt();

        if (ball >= 30 && ball <= 40 || ball >=60 && ball <= 70){
            System.out.println("win");
        }else{
            System.out.println("lose");
        }
    }
}
