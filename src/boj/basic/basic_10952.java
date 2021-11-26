package boj.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class basic_10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (Boolean.TRUE) {
            String[] s2 = br.readLine().split(" ");
            int i1 = Integer.parseInt(s2[0]);
            int i2 = Integer.parseInt(s2[1]);
            if (i1==0 && i2==0) {
                break;
            } else {
                System.out.println(i1+i2);
            }
        }
    }
}
