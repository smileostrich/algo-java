package boj.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class basic_2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        for (int i=1; i<=cnt; ++i) {
            for (int j=cnt-i-1; j>=0; --j) {
                System.out.print(" ");
            }
            for (int k=1; k<=i; ++k) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
