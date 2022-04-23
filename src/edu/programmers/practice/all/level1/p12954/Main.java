package edu.programmers.practice.all.level1.p12954;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int x = 2;
        int n = 5;
//        int x = 4;
//        int n = 3;
//        int x = -4;
//        int n = 2;
        System.out.println(Arrays.toString(new Solution().solution(x, n)));
    }
}

class Solution {

    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        for (int idx = 0; idx < n; idx++) {
            answer[idx] = (long) x * (idx + 1);
        }

        return answer;
    }
}
