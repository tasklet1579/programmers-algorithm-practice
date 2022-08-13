package edu.programmers.practice.monthly.code.p70128;

public class Main {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {-3, -1, 0, 2};
        System.out.println(new Solution().solution(a, b));
    }
}

class Solution {

    public int solution(int[] a, int[] b) {
        int answer = 0;

        for (int idx = 0; idx < a.length; idx++) {
            answer += a[idx] * b[idx];
        }

        return answer;
    }
}
