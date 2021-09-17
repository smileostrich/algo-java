package boj.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class basic_1330 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        Integer i1 = Integer.parseInt(str[0]);
        Integer i2 = Integer.parseInt(str[1]);
        if (i1 > i2) {
            System.out.println(">");
        }
        else if (i1 < i2) {
            System.out.println("<");
        }
        else {
            System.out.println("==");
        }


    }
}
