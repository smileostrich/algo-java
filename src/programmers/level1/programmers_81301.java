package programmers.level1;

import java.util.HashMap;

public class programmers_81301 {
    public static int solution(String s) {
        HashMap<String, Integer> map = new HashMap<>();

        String answer = "";

        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);
        map.put("zero", 0);

        String temp = "";

        for (int i = 0; i < s.length(); i++) {
            char num = s.charAt(i);
            if (num >= 48 && num <= 57) {
                answer = answer + num + "";
                continue;
            }

            temp = temp + s.charAt(i);
            if (map.containsKey(temp)) {
                answer = answer + map.get(temp);
                temp = "";
            }
        }

        int ans = Integer.parseInt(answer);
        return ans;
    }
    public static void main(String[] args) {
        System.out.print(solution("one4seveneight"));
    }
}
