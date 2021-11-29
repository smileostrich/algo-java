package boj.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class basic_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];
        int high = 0;
        int idx = 1;
        for (int i=0; i<9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (arr[i] > high) {
                high = arr[i];
                idx = i+1;
            }
        }
        System.out.println(high);
        System.out.println(idx);
    }
}
