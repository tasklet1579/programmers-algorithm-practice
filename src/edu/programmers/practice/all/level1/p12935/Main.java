package edu.programmers.practice.all.level1.p12935;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        int[] arr = {4, 3, 2, 1};
        int[] arr = {10};
        System.out.println(Arrays.toString(new Solution().solution(arr)));
    }
}

class Solution {

    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length - 1];
        int minValue = Integer.MAX_VALUE;
        int location = 0;

        if (arr.length == 1) {
            return new int[]{-1};
        }

        for (int idx = 0; idx < arr.length; idx++) {
            if (minValue > arr[idx]) {
                minValue = arr[idx];
                location = idx;
            }
        }

        for (int src = 0, dest = 0; src < arr.length; src++) {
            if (src == location) {
                continue;
            }
            answer[dest++] = arr[src];
        }

        return answer;
    }
}
