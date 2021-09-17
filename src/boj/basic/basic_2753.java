package boj.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class basic_2753 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer i = Integer.parseInt(br.readLine());
        Integer r = 0;
        if (i % 4 == 0){
            if (i%100 != 0) {
                r = 1;
            }
            else if (i%400 == 0) {
                r = 1;
            }
        }
        System.out.println(r);
    }
}
