package a0629;

import java.util.Scanner;

public class Ex4_14 {
    public static void main(String[] args) {
        int num = 0, sum = 0;
        System.out.print("숫자를 입력하세요(예:12345) > ");
        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        num = Integer.parseInt(tmp); // 입력받은 문자열tmp를 숫자로 변환하여 num에 대입
        while(num!=0){
            sum += num%10;
            System.out.printf("sum=%3d num=%d%n",sum,num);
            num /= 10; // num = num / 10;

        }
        System.out.println("각 자리 수의 합 :" + sum);
    }
}