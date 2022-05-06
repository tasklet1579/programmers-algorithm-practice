package edu.programmers.practice.all.level1.p12943;

public class Main {

    public static void main(String[] args) {
//        int n = 6;
//        int n = 16;
        int n = 626331;
        System.out.println(new Solution().solution(n));
    }
}

class Solution {

    private static int answer = 0;

    public int solution(int num) {
        collatz(num);
        return answer;
    }

    public void collatz(long num) {
        if (num == 1) {
            return;
        }
        if (answer == 500) {
            answer = -1;
            return;
        }

        if (num % 2 == 0) {
            num = num / 2;
        } else {
            num = num * 3 + 1;
        }

        answer++;
        collatz(num);
    }
}
