package edu.programmers.practice.monthly.code.p68644;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        int[] numbers = {2, 1, 3, 4, 1};
        System.out.println(Arrays.toString(new Solution().solution(numbers)));
    }
}

class Solution {
    private static final Set<Integer> sum = new HashSet<>();
    private static int[] ints;
    private static int[] visit;

    public int[] solution(int[] numbers) {
        ints = numbers;
        visit = new int[numbers.length];

        add(0, 0);

        return sum.stream()
                  .mapToInt(Integer::intValue)
                  .sorted()
                  .toArray();
    }

    public void add(int depth, int begin) {
        if (depth == 2) {
            sum.add(sum());
            return;
        }

        for (int idx = begin; idx < ints.length; idx++) {
            if (visit[idx] == 0) {
                visit[idx] = 1;
                add(depth + 1, begin + 1);
                visit[idx] = 0;
            }
        }
    }

    public int sum() {
        int sum = 0;
        for (int idx = 0; idx < visit.length; idx++) {
            if (visit[idx] == 1) {
                sum += ints[idx];
            }
        }
        return sum;
    }
}
