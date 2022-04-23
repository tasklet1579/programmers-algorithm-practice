package edu.programmers.practice.all.level1.p12919;

public class Main {

    public static void main(String[] args) {
        String[] seoul = {"Jane", "Kim"};
        System.out.println(new Solution().solution(seoul));
    }
}

class Solution {

    private static final String KIM = "Kim";
    private static final String ANSWER = "김서방은 %d에 있다";

    public String solution(String[] seoul) {
        String answer = "";

        for (int idx = 0; idx < seoul.length; idx++) {
            if (KIM.equals(seoul[idx])) {
                answer = String.format(ANSWER, idx);
                break;
            }
        }

        return answer;
    }
}
