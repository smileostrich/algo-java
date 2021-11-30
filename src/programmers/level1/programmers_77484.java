package programmers.level1;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class programmers_77484 {
    public static int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {6,6,5,4,3,2,1};
        int cnt_z = 0;
        int cnt_a = 0;
        Set<Integer> set = new HashSet<>();
        for (int e:win_nums) {
            set.add(e);
        }
        for (int i=0; i<lottos.length; i++) {
            if (lottos[i] == 0) {
                cnt_z += 1;
            } else if (set.contains(i)) {
                cnt_a += 1;
            }
        }
        return new int[] {answer[cnt_a+cnt_z], answer[cnt_a]};
    }
    public static void main(String[] args) throws IOException {
        int[] lottos = {0,0,0,0,0,0};
        int[] win_nums = {31,10,45,1,6,19};
        for (int e:solution(lottos, win_nums)) {
            System.out.print(e);
            System.out.print(" ");
        }
    }
}
