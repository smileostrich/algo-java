package programmers.level1;

import java.util.Arrays;

public class programmers_42748 {
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i=0; i<commands.length; i++) {
            int[] tmp = new int[commands[i][1] - commands[i][0] + 1];
            int idx = 0;
            for (int j = commands[i][0]; j <= commands[i][1]; j++) {
                tmp[idx] = array[j - 1];
                idx += 1;
            }
            Arrays.sort(tmp);
            answer[i] = tmp[commands[i][2]-1];
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] t = {1, 5, 2, 6, 3, 7, 4};
        int[][] d = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println(solution(t, d));
    }
}
