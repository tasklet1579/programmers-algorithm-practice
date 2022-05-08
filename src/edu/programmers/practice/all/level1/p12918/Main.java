package edu.programmers.practice.all.level1.p12918;

public class Main {

    public static void main(String[] args) {
//        String s = "a234";
        String s = "1234";
        System.out.println(new Solution().solution(s));
    }
}

class Solution {

    public boolean solution(String s) {
        boolean answer = true;
        for (char ch : s.toCharArray()) {
            if (ch < 48 || ch > 57 || (s.length() != 4 && s.length() != 6)) {
                answer = false;
                break;
            }
        }
        return answer;
    }
}
