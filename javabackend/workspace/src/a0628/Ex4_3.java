package a0628;

import java.util.Scanner;

public class Ex4_3 {
    public static void main(String[] args) {
        // 키보드로 입력 받아서 숫자를 하나 입력하세요.
        // 화면을 통해 입력받은 숫자를 input에 저장하고, input == 0이면 입력하신 숫자는 0입니다.
        // 아니면 입력하신 숫자는 0이 아닙니다.
        Scanner scanner = new Scanner(System.in);
        System.out.printf("숫자를 입력하세요.");
        int input = scanner.nextInt();
        if (input == 0) {
            System.out.println("입력하신 숫자는 0입니다.");
        } else {
            System.out.println("입력하신 숫자는 0이 아닙니다.");
        }
    }
}
