package a0711;

public class StringBuilderEx {
    public static void main(String[] args) {
        String data = new StringBuilder()
                .append("DEF")
                .insert(0, "ABC")
                .delete(3, 4)
                .toString();
        System.out.println(data);
    }
}
