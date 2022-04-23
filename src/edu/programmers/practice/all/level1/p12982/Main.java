package edu.programmers.practice.all.level1.p12982;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        int[] d = {1, 3, 2, 5, 4};
//        int budget = 9;
        int[] d = {2, 2, 3, 3};
        int budget = 10;
        System.out.println(new Solution().solution(d, budget));
    }
}

class Solution {

    public int solution(int[] d, int budget) {
        int answer = d.length;
        int sum = 0;
        int index = d.length;

        Arrays.sort(d);

        for (int number : d) {
            sum += number;
        }

        while (true) {
            if (budget < sum) {
                sum -= d[--index];
                answer--;
                continue;
            }
            break;
        }

        return answer;
    }
}
