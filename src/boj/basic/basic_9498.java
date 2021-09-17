package boj.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class basic_9498 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Integer i = Integer.parseInt(s);
        if (i >= 90) {
            System.out.println("A");
        } else if (i>=80) {
            System.out.println("B");
        } else if (i >= 70) {
            System.out.println("C");
        } else if (i >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
