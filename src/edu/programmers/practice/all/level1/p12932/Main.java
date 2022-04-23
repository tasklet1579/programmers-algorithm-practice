package edu.programmers.practice.all.level1.p12932;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        long n = 12345;
        System.out.println(Arrays.toString(new Solution().solution(n)));
    }
}

class Solution {

    public int[] solution(long n) {
        String str = Long.toString(n);
        int[] answer = new int[str.length()];

        for (int src = 0, dest = str.length() - 1; src < str.length(); src++, dest--) {
            answer[dest] = (str.charAt(src) - 48); // 48, 0x30, '0'
        }

        return answer;
    }
}
