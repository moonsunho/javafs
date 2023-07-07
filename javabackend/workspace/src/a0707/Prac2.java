package a0707;

import java.util.Scanner;

public class Prac2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a= scan.nextInt();
        int b= scan.nextInt();

        if(a%b == 0){
            System.out.printf("%d * %d = %d",b,a/b,a);
        }else if(b%a==0){
            System.out.printf("%d * %d = %d",a,b/a,b);
        }else{
            System.out.println("none");
        }
    }
}
