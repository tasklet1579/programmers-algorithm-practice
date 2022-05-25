package edu.programmers.practice.all.level1.p12916;

public class Main {

    public static void main(String[] args) {
//        String s = "pPoooyY";
        String s = "Pyy";
        System.out.println(new Solution().solution(s));
    }
}

class Solution {

    boolean solution(String s) {
        int answer = 0;

        for (char ch : s.toLowerCase().toCharArray()) {
            if (ch == 'p') {
                answer++;
            }
            if (ch == 'y') {
                answer--;
            }
        }

        return answer == 0;
    }
}
