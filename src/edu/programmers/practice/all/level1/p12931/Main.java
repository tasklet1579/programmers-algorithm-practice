package edu.programmers.practice.all.level1.p12931;

public class Main {

    public static void main(String[] args) {
//        int n = 123;
        int n = 987;
        System.out.println(new Solution().solution(n));
    }
}

class Solution {

    public int solution(int n) {
        int answer = 0;
        String str = Integer.toString(n);

        for (int idx = 0; idx < str.length(); idx++) {
            answer += (str.charAt(idx) - 48); // 48, 0x30, '0'
        }

        return answer;
    }
}
