package a0704;

import java.util.Scanner;

public class Prac7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("월 입력 > ");
        int mm = scan.nextInt();
        /* if(mm >=3 && mm <=5){
            System.out.println("봄");
        } else if(mm>=6 && mm <=8){
            System.out.println("여름");
        } else if(mm>=9 && mm <=11){
            System.out.println("가을");
        } else{
            System.out.println("겨울");
        } */

        switch(mm){
            case 3:
            case 4:
            case 5:
                System.out.println("봄");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("여름");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("가을");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("겨울");
                break;
        }
    }
}
