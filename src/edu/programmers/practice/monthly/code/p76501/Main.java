package edu.programmers.practice.monthly.code.p76501;

public class Main {

    public static void main(String[] args) {
        int[] absolutes = {4, 7, 12};
        boolean[] signs = {true, false, true};
        System.out.println(new Solution().solution(absolutes, signs));
    }
}

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        int idx = 0;

        for (int number : absolutes) {
            answer += number * sign(signs[idx++]);
        }

        return answer;
    }

    public int sign(boolean sign) {
        return sign ? 1 : -1;
    }
}
