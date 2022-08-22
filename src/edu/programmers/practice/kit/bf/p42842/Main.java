package edu.programmers.practice.kit.bf.p42842;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int brown = 24;
        int yellow = 24;
        System.out.println(Arrays.toString(new Solution().solution(brown, yellow)));
    }
}

class Solution {
    public int[] solution(int brown, int yellow) {
        int size = brown + yellow;
        int row;
        int col = 3;

        while (true) {
            if (size % col == 0) {
                row = size / col;
                if ((row - 2) * (col - 2) == yellow) {
                    break;
                }
            }
            col++;
        }

        return new int[]{row, col};
    }
}
