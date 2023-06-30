public class E4_2 {
    public static void main(String[] args) {
        int sum1 = 0;
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0 && i % 3 != 0) {
                sum1 += i;
            }
        }
        System.out.println(sum1);

    }
}
