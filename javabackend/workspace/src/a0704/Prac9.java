package a0704;

import java.util.Scanner;

public class Prac9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] num = new int[3];
        for(int i = 0 ; i <3; i++){
            System.out.println("숫자 입력 >");
            num[i] = scan.nextInt();
        }
        int minNum = num[0];
        for(int i = 0; i <num.length;i++){
            if(minNum > num[i]){
                minNum = num[i];
            }
        }
        System.out.println(minNum);
    }
}
