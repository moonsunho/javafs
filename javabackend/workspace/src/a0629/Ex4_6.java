package a0629;

import java.util.Scanner;

public class Ex4_6 {
    public static void main(String[] args) {
        System.out.println("현재 월을 입력하세요. >");
        Scanner scanner = new Scanner(System.in);
        // Scanner - 자바에서 제공하는 입력을 받는 클래스
        // (System.in)을 통해서 사용자로부터 입력을 받을 수 있고,
        // System.in 부터 Scanner 객체를 생성
        // scanner.nextInt() - 숫자를 입력받음
        // scanner.nextLine() - 문자열을 입력받음
        int month = scanner.nextInt();

        switch(month){
            case 3:
            case 4:
            case 5:
            System.out.println("현재 계절은 봄입니다.");
            break;
            case 6:
            case 7:
            case 8:
            System.out.println("현재 계절은 여름입니다.");
            break;
            case 9:
            case 10:
            case 11:
            System.out.println("현재 계절은 가을입니다.");
            break;
            default:
            System.out.println("현재 계절은 겨울입니다.");
        }
    }
}
