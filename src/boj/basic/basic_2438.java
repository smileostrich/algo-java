package boj.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class basic_2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        for (int i=1; i<=cnt; ++i) {
            for (int j=1; j<=i; ++j) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
