package edu.programmers.practice.monthly.code.p87389;

public class Main {

    public static void main(String[] args) {
        int n = 10;
//        int n = 12;
        System.out.println(new Solution().solution(n));
    }
}

class Solution {
    public int solution(int n) {
        int answer = 2;

        while (n % answer != 1) {
            answer++;
        }

        return answer;
    }
}
