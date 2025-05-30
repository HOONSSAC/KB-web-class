package ch18.sec04.exam02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample {
    public static void main(String[] args) {
        try {
            Reader reader = null;

            // 1. 한 문자씩 읽기
            reader = new FileReader("/Users/hoonssac/Desktop/KB-web-class/KB-Java/src/ch18/sec04/exam02/test.txt");
            while (true) {
                int data = reader.read(); // 한 문자씩 읽음
                if (data == -1) {
                    break;
                }
                System.out.println((char)data); // 정수 -> 문자
            }
            reader.close();
            System.out.println();

            // 2. 문자 배열로 읽기 (버퍼 사용)
            reader  = new FileReader("/Users/hoonssac/Desktop/KB-web-class/KB-Java/src/ch18/sec04/exam02/test.txt");
            char[] data = new char[100];
            while (true) {
                int num = reader.read(data);
                if (num == -1) {
                    break;
                }
                for (int i = 0; i < num; i++) {
                    System.out.println(data[i]);
                }
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
