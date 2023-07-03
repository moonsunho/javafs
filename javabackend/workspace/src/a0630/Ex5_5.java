package a0630;

import java.util.Arrays;

public class Ex5_5 {
    public static void main(String[] args) {
        int[] ball = new int[45]; // 45개의 정수값을 저장하기 위한 배열 생성
        // 배열의 각 요소에 1 ~ 45 값을 저장
        for (int i = 0; i<ball.length; i++){
            ball[i] = i+1; // ball[0]에 1 저장
        }
        int tmp = 0;
        int j = 0;

        for (int i =0; i <6; i++){
            j = (int)(Math.random()*45); // 0 ~ 44 범위의 임의의 값을 얻는다.
            tmp = ball[i]; //tmp = 1
            ball[i] = ball[j]; // ball i = 43
            ball[j] = tmp; //ball 43 = 1
        }
        for(int i=0;i<6;i++){
            System.out.printf("ball[%d]=%d%n",i,ball[i]);
        }
    }
}
