package a0628;

import java.util.Scanner;

public class Ex4_4 {
    public static void main(String[] args) {
        int score = 0;
        char grade = ' ';

        System.out.printf("점수를 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();
        

        if (score >= 90){
            grade = 'A';
            System.out.println(grade);
        }else if(score >= 80){
            grade = 'B';
            System.out.println(grade);
        }else if(score >= 70){
            grade = 'C';
            System.out.println(grade);
        }else if(score >= 60){
            grade = 'D';
            System.out.println(grade);
        }else{
            grade = 'F';
            System.out.println(grade);
        }
    }
}