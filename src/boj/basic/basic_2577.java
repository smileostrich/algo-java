package boj.basic;

import org.w3c.dom.css.Counter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class basic_2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        String res = String.valueOf(a * b * c);
        HashMap<String, Integer> test = new HashMap<>();
        for (int i=0; i < 10; i++) {
            test.put(Integer.toString(i), 0);
        }
        for (int i=0; i < res.length(); i++) {
            String tmp = String.valueOf(res.charAt(i));
            if (tmp == "0") {
                continue;
            }
            int value = test.get(tmp) +1;
            test.put(tmp, value);
        }
        for (Integer n: test.values()){
            System.out.println(n);
        }
    }
}
