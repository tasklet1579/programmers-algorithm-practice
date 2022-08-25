package edu.programmers.practice.all.level2.p12924;

public class Main {

    public static void main(String[] args) {
        int n = 15;
        System.out.println(new Solution().solution(n));
    }
}

class Solution {
    public int solution(int n) {
        int answer = 0;

        for (int num = 1; num <= n; num++) {
            int add = num;
            int sum = 0;

            while (sum < n) {
                sum += add++;
            }
            if (sum == n) {
                answer++;
            }
        }

        return answer;
    }
}
