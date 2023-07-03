package a0703;

import java.util.Scanner;

public class This5_9 {
    public static void main(String[] args) {
        boolean run = true;
        int[] scores = new int[0];
        int stuNum = 0;
        int maxNum = 0;
        int sum = 0;
        float avg = 0.0f;
        Scanner scanner = new Scanner(System.in);

        while (run) {
            System.out.println("------------------------------------------------------------");
            System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
            System.out.println("------------------------------------------------------------");
            System.out.print("선택 > ");
            int menuNum = scanner.nextInt();

            switch (menuNum) {
                case 1:
                    System.out.print("학생 수 > ");
                    stuNum = scanner.nextInt();
                    scores = new int[stuNum];
                    break;
                case 2:
                    for (int i = 0; i < stuNum; i++) {
                        System.out.print("scores[" + i + "] > ");
                        scores[i] = scanner.nextInt();
                    }
                    break;
                case 3:
                    for (int i = 0; i < stuNum; i++) {
                        System.out.println("scores[" + i + "] > " + scores[i]);
                    }
                    break;
                case 4:
                    for (int i = 0; i < scores.length; i++) {
                        if (scores[i] > maxNum) {
                            maxNum = scores[i];
                        }
                    }
                    System.out.println("최고 점수: " + maxNum);
                    maxNum = 0;
                    for (int i = 0; i < scores.length; i++) {
                        sum += scores[i];
                        avg = sum / (float)(stuNum);
                    }
                    System.out.println("평균 점수: " + avg);
                    sum = 0;
                    avg = 0.0f;
                    break;
                case 5:
                    run = false;
                    break;
            }
        }
        System.out.println("프로그램 종료");
    }
}
