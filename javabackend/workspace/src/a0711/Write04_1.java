package a0711;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Write04_1 {
    public static void main(String[] args) throws IOException {
        PrintWriter pw1 = new PrintWriter("d:/out1.txt");
        for(int i = 1; i<11; i++){
            String data = i + "번 째 줄입니다.\r\n";
            pw1.write(data);
        }
        pw1.close();
        PrintWriter pw2 = new PrintWriter(new FileWriter("d:/out1.txt",true));
        for(int i = 1; i<11; i++){
            String data = i + "번 째 줄입니다.\r\n";
            pw2.write(data);
        }
        pw2.close();
        
    }
}
