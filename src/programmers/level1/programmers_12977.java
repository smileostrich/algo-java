package programmers.level1;

public class programmers_12977 {
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

    public static int solution(int[] nums) {
        int answer = 0;
        int tmp = 1;
        for (int n:nums) {
            tmp += n;
        }
        boolean[] sosu = make_prime(tmp);
        for (int i=0; i<nums.length; i++) {
            for (int j=i+1; j<nums.length; j++) {
                for (int k=j+1; k<nums.length; k++) {
                    int cur = nums[i] + nums[j] + nums[k];
                    if (!sosu[cur]) {
                        answer += 1;
                    }
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] a = {1, 2,7,6,4};
        System.out.println(solution(a));
    }
}
