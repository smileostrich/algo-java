package programmers.level2;

import java.math.BigInteger;

public class programmers_62048 {
    public static long solution(int w, int h) {
        int gcd = BigInteger.valueOf(w).gcd(BigInteger.valueOf(h)).intValue();
        return ((long) w * (long) h) - ((((long) w / gcd) + ((long) h / gcd) - 1) * gcd);
    }
    public static void main(String[] args) {
        int a = 8;
        int b = 12;
        System.out.println(solution(a, b));
    }
}
