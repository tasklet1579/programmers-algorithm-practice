package edu.programmers.practice.kit.sort.p42748;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println(Arrays.toString(new Solution().solution(array, commands)));
    }
}

class Solution {

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int idx = 0;

        for (int[] command : commands) {
            int begin = command[0] - 1;
            int end = command[1];
            int position = command[2] - 1;
            int[] sorted = sort(Arrays.copyOfRange(array, begin, end));
            answer[idx++] = sorted[position];
        }

        return answer;
    }

    public int[] sort(int[] array) {
        if (array.length == 1) {
            return array;
        }

        int[] left = sort(Arrays.copyOfRange(array, 0, array.length / 2));
        int[] right = sort(Arrays.copyOfRange(array, array.length / 2, array.length));

        return compare(left, right);
    }

    public int[] compare(int[] left, int[] right) {
        int[] sorted = new int[left.length + right.length];
        int l = 0;
        int r = 0;
        int i = 0;

        while (l < left.length && r < right.length) {
            if (left[l] <= right[r]) {
                sorted[i++] = left[l++];
            } else {
                sorted[i++] = right[r++];
            }
        }

        while (l < left.length) {
            sorted[i++] = left[l++];
        }

        while (r < right.length) {
            sorted[i++] = right[r++];
        }

        return sorted;
    }
}
