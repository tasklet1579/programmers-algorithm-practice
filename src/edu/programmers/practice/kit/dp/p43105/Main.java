package edu.programmers.practice.kit.dp.p43105;

public class Main {

    public static void main(String[] args) {
        int[][] triangle = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
        System.out.println(new Solution().solution(triangle));
    }
}

class Solution {

    public int solution(int[][] triangle) {
        for (int row = triangle.length - 2; row >= 0; row--) {
            for (int col = 0; col < triangle[row].length; col++) {
                int left = triangle[row][col] + triangle[row + 1][col];
                int right = triangle[row][col] + triangle[row + 1][col + 1];
                triangle[row][col] = Math.max(left, right);
            }
        }

        return triangle[0][0];
    }
}
