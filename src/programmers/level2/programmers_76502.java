package programmers.level2;

import java.math.BigInteger;
import java.util.Stack;

public class programmers_76502 {
    public static int solution(String s) {
        int answer = 0;
        for(int i=0; i<s.length(); i++){
            Stack<String> st = new Stack();
            s = s.substring(1)+s.substring(0,1);

            for(int j=0; j<s.length(); j++){
                String word = s.substring(j,j+1);
                if(st.isEmpty()){
                    st.push(word);
                    continue;
                }

                if(word.equals(")") && st.peek().equals("(")){
                    st.pop();
                }else if(word.equals("}") && st.peek().equals("{")){
                    st.pop();
                }else if(word.equals("]") && st.peek().equals("[")){
                    st.pop();
                }else{
                    st.push(word);
                }
            }

            if(st.isEmpty()){
                answer++;
            }

        }
        return answer;
    }
    public static void main(String[] args) {
        String a = "}]()[{";
        System.out.println(solution(a));
    }
}
