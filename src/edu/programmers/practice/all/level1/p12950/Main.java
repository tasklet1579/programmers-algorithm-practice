package edu.programmers.practice.all.level1.p12950;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        int[][] arr1 = {{1, 2}, {2, 3}};
//        int[][] arr2 = {{3, 4}, {5, 6}};
        int[][] arr1 = {{1}, {2}};
        int[][] arr2 = {{3}, {4}};
        System.out.println(Arrays.deepToString(new Solution().solution(arr1, arr2)));
    }
}

class Solution {

    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];

        for (int row = 0; row < arr1.length; row++) {
            for (int col = 0; col < arr1[0].length; col++) {
                answer[row][col] = arr1[row][col] + arr2[row][col];
            }
        }
        return answer;
    }
}
