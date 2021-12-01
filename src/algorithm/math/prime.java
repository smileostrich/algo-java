package algorithm.math;

public class prime {
    public static boolean[] make_prime(int N) {
        boolean prime[] = new boolean[N+1];

        prime[0] = prime[1] = true;
        for(int i=2; i*i<=N; i++){
            if(!prime[i]) {
                for(int j=i*i; j<=N; j+=i) prime[j] = true;
            }
        }
        return prime;
    }
}
