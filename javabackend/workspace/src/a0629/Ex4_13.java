package a0629;

public class Ex4_13 {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        while(sum <= 100){
            System.out.printf("%d - %d%n",i,sum);
            i++;
            sum += i;
            // sum+=++i;
        }
    }
}
