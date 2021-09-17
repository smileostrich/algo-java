package boj.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class basic_14681 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer s = Integer.parseInt(br.readLine());
        Integer s2 = Integer.parseInt(br.readLine());

        if (s > 0) {
            if (s2 > 0) {
                System.out.println(1);
            } else {
                System.out.println(4);
            }
        } else {
            if (s2 > 0) {
                System.out.println(2);
            } else {
                System.out.println(3);
            }
        }

    }
}
