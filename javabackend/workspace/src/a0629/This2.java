package a0629;

public class This2 {
    public static void main(String[] args) {
    /*     int i = 0;
        int j = 0;
        int sum = 0;
        do {
            i = (int) (Math.random() * 6) + 1;
            j = (int) (Math.random() * 6) + 1;
            sum = i +j;
        } while (sum != 5);
        System.out.printf("%d,%d,%d", i, j, sum); */

        while(true){
            int num1 = (int)(Math.random()*6)+1;
            int num2 = (int)(Math.random()*6)+1;
            System.out.printf("%d,%d%n",num1,num2);
            if(num1+num2==5){
                break;
            }
        }
    }
}
