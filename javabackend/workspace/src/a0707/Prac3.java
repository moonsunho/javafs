package a0707;

import java.util.Scanner;

public class Prac3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int menu1 = 400;
        int menu2 = 340;
        int menu3 = 170;
        int menu4 = 100;
        int menu5 = 70;
        System.out.println("------------------------------");
        System.out.println("1. 치즈버거 : " + menu1 + " 칼로리");
        System.out.println("2. 야채버거 : " + menu2 + " 칼로리");
        System.out.println("3. 우유 : " + menu3 + " 칼로리");
        System.out.println("4. 계란말이 : " + menu4 + " 칼로리");
        System.out.println("5. 샐러드 : " + menu5 + " 칼로리");
        System.out.println("------------------------------");
        System.out.print("첫번째 메뉴를 선택하세요 > ");
        int menuNum1 = scan.nextInt();
        System.out.print("두번째 메뉴를 선택하세요 > ");
        int menuNum2 = scan.nextInt();

        int myMenu1 = 0;
        switch (menuNum1) {
            case 1:
                myMenu1 = menu1;
                break;
            case 2:
                myMenu1 = menu2;
                break;
            case 3:
                myMenu1 = menu3;
                break;
            case 4:
                myMenu1 = menu4;
                break;
            case 5:
                myMenu1 = menu5;
                break;
        }
        int myMenu2 = 0;
        switch (menuNum2) {
            case 1:
                myMenu2 = menu1;
                break;
            case 2:
                myMenu2 = menu2;
                break;
            case 3:
                myMenu2 = menu3;
                break;
            case 4:
                myMenu2 = menu4;
                break;
            case 5:
                myMenu2 = menu5;
                break;
        }

        if (myMenu1 + myMenu2 > 500) {
            System.out.println("angry");
        } else {
            System.out.println("no angry");
        }
    }
}
