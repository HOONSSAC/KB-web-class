package ch18.sec04.exam01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample {
    public static void main(String[] args) {
        try (Writer writer = new FileWriter("/Users/hoonssac/Desktop/KB-web-class/KB-Java/src/ch18/sec04/exam01/test.txt")) {
            char a = 'A';
            writer.write(a);
            char b = 'B';
            writer.write(b);

            // char 배열 출력
            char[] arr = {'C', 'D', 'E'};
            writer.write(arr);

            // 문자열 출력
            writer.write("FGH");

            // 버퍼에 잔류하고 있는 문자들을 출력하고, 버퍼를 사용
            writer.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
