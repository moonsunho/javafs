package a0628;

import java.util.Scanner;

public class Ex4_5 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ', opt = ' ';

        System.out.printf("점수를 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();
        
        if (score >= 90) {
            grade = 'A';
            if(score>=98){
                opt = '+';
            }else if(score < 94){
                opt = '-';
            }
        } else if (score >= 80) {
            grade = 'B';
            if(score>=88){
                opt = '+';
            }else if(score < 84){
                opt = '-';
            }
        } else {
            grade = 'C';
        }
        System.out.printf("당신의 학정은 %c%c입니다.%n",grade,opt);
    }
}