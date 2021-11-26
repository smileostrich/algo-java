package boj.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class basic_10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        Integer N = Integer.parseInt(s[0]);
        Integer X = Integer.parseInt(s[1]);
        String[] s2 = br.readLine().split(" ");
        for (String k:s2) {
            if (Integer.parseInt(k) < X) {
                System.out.printf("%s ", k);
            }
        }
    }
}
