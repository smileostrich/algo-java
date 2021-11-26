package boj.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class basic_10950 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        for (int i=0; i<cnt; ++i) {
            String[] s = br.readLine().split(" ");
            Integer i1 = Integer.parseInt(s[0]);
            Integer i2 = Integer.parseInt(s[1]);
            System.out.println(i1 + i2);
        }
    }
}
