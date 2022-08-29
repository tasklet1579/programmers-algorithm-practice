package edu.programmers.practice.kit.greedy.p42862;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int n = 6;
        int[] lost = {3, 4, 5};
        int[] reserve = {3, 4, 6};
        System.out.println(new Solution().solution(n, lost, reserve));
    }
}

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] clothes = new int[n + 2];
        int[] extra = new int[n + 2];
        int answer = 0;

        clothes[0] = -1;
        clothes[n + 1] = -1;

        lost = Arrays.stream(lost)
                     .sorted()
                     .toArray();
        reserve = Arrays.stream(reserve)
                        .sorted()
                        .toArray();

        for (int i = 1; i <= n; i++) {
            clothes[i] = 1;
        }

        for (int i : lost) {
            clothes[i] = 0;
        }

        for (int i : reserve) {
            if (clothes[i] == 0) {
                clothes[i] = 1;
                extra[i] = 0;
            } else {
                extra[i] = 1;
            }
        }

        for (int i : reserve) {
            if (extra[i] == 1) {
                if (clothes[i - 1] == 0) {
                    clothes[i - 1] = 1;
                } else if (clothes[i + 1] == 0) {
                    clothes[i + 1] = 1;
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            if (clothes[i] == 1) {
                answer++;
            }
        }

        return answer;
    }
}
